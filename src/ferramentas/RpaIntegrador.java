/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import cadastros.ConfigDefault;
import cadastros.Transportador;
import conexoes.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import telaCadastros.TelaInicial;
import wsTerceiros.ObjectFactory;
import wsTerceiros.G5SeniorServices;
import wsTerceiros.TerceirosPagtosFisica2In;

/**
 *
 * @author ferna
 */
public class RpaIntegrador {

    private int usu_inc;
    private conexoes.ConexaoMySQL cn;
    private conexoes.ConexaoFB cnfb;
    private final conexoes.ConexaoORCL cnSen = new ConexaoORCL();
    private ferramentas.FbGenerators gen;
    private cadastros.ConfigDefault cd = new ConfigDefault();
    private cadastros.Transportador transp;

    private DecimalFormat df = new DecimalFormat("0.00");
    private DecimalFormat dfSen = new DecimalFormat("#,##0.00");
    private DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
    //private TelaInicial ti = new TelaInicial();

    private String empresa = "1";
    private int codigo;
    private String estabelecimento;
    private String nome_estabelecimento;
    private String tipodoc = "25";
    private String fornecedor;
    private String nome_fornecedor;
    private String portador = "1";
    private String doc;
    private String historico;
    private Date dt_emissao;
    private Date dt_vencimento;
    private Date data_inc;
    private TimeZone hora_inc;
    private int id_transacao;
    private String estabelec_cad;
    private String lote;
    private String parcela = "1";
    private String integra_contabil = "S";
    private String perc_juros_atraso = "0";
    private String perc_multa_atraso = "0";
    private String perc_desc_antecipacao = "0";
    private String perc_pontualidade = "0";

    private String planoconta;
    private Double valor_bruto;
    private Double valor_liquido;
    private Double inss;
    private Double irrf;
    private Double terceiros;
    private String tipo_plano;

    private String categoria;
    private String competencia;
    private String sequencia;
    private String cod_folha;
    private Double faturamento;

    private int nroRpa;

    private int numEmp = 7;
    private int codFil;
    private String cmpPte;
    private int numCad;
    private int seqPte;
    private String tipOpe;
    private String datPag;
    private Double renBru;
    private Integer codIse = 20;
    private Integer codRet = 588;
    private Double perGrp;
    private Integer codSer = 1;
    private Double valIse;

    public RpaIntegrador(ConexaoMySQL conn) {
        this.cn = conn;
        cnfb = new ConexaoFB(usu_inc);
    }

    public RpaIntegrador(int user, ConexaoMySQL conn) {
        this.usu_inc = user;
        cnfb = new ConexaoFB(usu_inc);
        gen = new FbGenerators(usu_inc);
        transp = new Transportador(usu_inc, conn);

        this.cn = conn;
    }

    public boolean buscaRpa(String nroRpa) {
        boolean resposta = false;
        estabelec_cad = estabelecimento = null;
        fornecedor = null;

        String sql = "SELECT * FROM bsctranscooper.rpa a WHERE a.codigo = '" + nroRpa + "';";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    System.out.println("Recuperando dados do RPA.");
                    estabelec_cad = estabelecimento = cn.rs.getString("estabelecimento");
                    fornecedor = cn.rs.getString("transportador");
                    doc = cn.rs.getString("numero");
                    dt_emissao = cn.rs.getDate("emissao");
                    dt_vencimento = cn.rs.getDate("pagamento");
                    datPag = dateIn.format(cn.rs.getDate("pagamento")); //CARREGA PARA O SENIOR
                    renBru = valor_bruto = Double.parseDouble(df.format(cn.rs.getDouble("vlr_bruto")).replace(",", "."));
                    //renBru = dfSen.format(cn.rs.getDouble("vlr_bruto"));
                    valor_liquido = cn.rs.getDouble("liquido");
                    inss = cn.rs.getDouble("inss");
                    irrf = cn.rs.getDouble("irrf");
                    terceiros = cn.rs.getDouble("terceiros");
                    categoria = cn.rs.getString("categoria");
                    cmpPte = competencia = cn.rs.getString("competencia");
                    sequencia = cn.rs.getString("sequencia");
                    seqPte = cn.rs.getInt("sequencia"); // CARREGA PARA SENIOR
                    cod_folha = cn.rs.getString("cod_folha");
                    faturamento = cn.rs.getDouble("faturamento");
                    categoria = cn.rs.getString("categoria");
                    codigo = cn.rs.getInt("codigo_fin");
                    this.nroRpa = cn.rs.getInt("codigo");
                    valIse = valor_bruto * 0.90;

                    if (this.nroRpa > 0) {
                        resposta = true;
                    } else {
                        resposta = false;
                    }
                }
                cn.rs.close();

                if (resposta) {
                    System.out.println("buscando nome do fornecedor: " + fornecedor);

                    try {
                        cn.executeConsulta("SELECT a.nome,a.id_folha FROM bsctranscooper.cad_pessoas a WHERE a.codigo = '" + fornecedor + "';");
                        while (cn.rs.next()) {
                            nome_fornecedor = cn.rs.getString("nome");
                            numCad = cn.rs.getInt("id_folha"); //CARREGA PARA SENIOR
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível identificar o nome da pessoa.");
                    }
                    cn.rs.close();

                    try {
                        cn.executeConsulta("SELECT a.razao_social FROM bsctranscooper.cad_estabelecimentos a WHERE a.id = '" + estabelecimento + "';");
                        while (cn.rs.next()) {
                            nome_estabelecimento = cn.rs.getString("razao_social");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível identificar o nome da pessoa.");
                    }
                    cn.rs.close();

                    cn.executeConsulta("SELECT group_concat(a.numero) as documentos FROM bsctranscooper.rpa_detalhe a WHERE a.codigo = '" + nroRpa + "';");
                    while (cn.rs.next()) {
                        historico = "Recibo de frete - CTe " + cn.rs.getString("documentos") + " " + nome_fornecedor;
                    }

                    cn.executeConsulta("SELECT * FROM bsctranscooper.cad_estabelecimentos a WHERE a.id = '" + estabelecimento + "';");
                    while (cn.rs.next()) {
                        if ("Cooperado".equals(categoria)) {
                            codFil = cn.rs.getInt("id_folha_coop");
                            perGrp = 0.00;
                        } else {
                            codFil = cn.rs.getInt("id_folha_terceiro");
                            perGrp = 20.00;
                        }
                    }
                    cn.rs.close();

                    if (this.nroRpa > 0) {
                        resposta = true;
                    } else {
                        resposta = false;
                    }

                    System.out.println("Dados do RPA recuperados com Sucesso. Resposta consulta = '" + resposta + "'.");
                } else {
                    JOptionPane.showMessageDialog(null, "RPA inexistente.");
                }

            } catch (Exception e) {
                resposta = false;
                JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados do RPA: " + e);
            } finally {
                cn.finalizarTransacao();
            }
        }

        System.out.println("Resposta busca RPA: " + resposta);
        return resposta;
    }

    public boolean integraFinanceiro(String rpa) {
        boolean resposta = false;

        String sql;
        String query;

        cd.carregaProp();

        if (buscaRpa(rpa)) {

            codigo = gen.getCodigo("fin_contas_pagar");
            System.out.println("Código capturado: " + codigo);

            id_transacao = gen.getTransacao();
            System.out.println("Transação capturada: " + id_transacao);

            if (cnfb.conecta()) {
                try {

                    if ("Cooperado".equals(categoria)) {
                        planoconta = cd.getCta_cooperado();
                    } else if ("Terceiro".equals(categoria)) {
                        planoconta = cd.getCta_terceiro();
                    } else {
                        planoconta = cd.getCta_outras_despesas();
                    }

                    sql = "INSERT INTO fin_contas_pagar (empresa,codigo,estabelec,"
                            + "tipodoc,fornecedor,portador,usu_inc,doc,historico,"
                            + "dt_emissao,dt_venc,data_inc,hora_inc,id_transacao,"
                            + "estabelec_cad,parcela,integra_contabil,"
                            + "perc_juros_atraso,perc_multa_atraso,"
                            + "perc_desc_antecipacao,perc_pontualidade) VALUES ('"
                            + empresa + "','" + codigo + "','" + estabelecimento + "','"
                            + tipodoc + "','" + fornecedor + "','" + portador + "','"
                            + usu_inc + "','" + doc + "','" + historico + "','"
                            + dt_emissao + "','" + dt_vencimento + "',current_date,"
                            + "current_time,'" + id_transacao + "','" + estabelec_cad + "','"
                            + parcela + "','" + integra_contabil + "','" + perc_juros_atraso + "','"
                            + perc_multa_atraso + "','" + perc_desc_antecipacao + "','"
                            + perc_pontualidade + "');";
                    if (cnfb.executeAtualizacao(sql)) {
                        sql = "INSERT INTO fin_contas_pagar_detalhe (empresa,codigo,planoconta,valor,id_transacao,tipo_plano,historico,tipo_lcto) VALUES ";
                        if ((valor_bruto > 0)) {
                            historico = "RPA " + doc + " " + nome_fornecedor;
                            query = "('" + empresa + "','" + codigo + "','" + planoconta + "','" + valor_bruto + "','" + id_transacao + "','D','" + historico + "','1');";
                            cnfb.executeAtualizacao(sql + query);
                            if ((inss + terceiros > 0)) {
                                historico = "INSS/Terceiros sobre RPA " + doc + " " + nome_fornecedor;
                                query = "('" + empresa + "','" + codigo + "','258','" + (inss + terceiros) + "','" + id_transacao + "','C','" + historico + "','4');";
                                cnfb.executeAtualizacao(sql + query);
                            }
                            if ((irrf > 0)) {
                                historico = "IRRF sobre RPA " + doc + " " + nome_fornecedor;
                                query = "('" + empresa + "','" + codigo + "','240','" + (irrf) + "','" + id_transacao + "','C','" + historico + "','4');";
                                cnfb.executeAtualizacao(sql + query);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Este recibo" + doc + " não foi integrado.");
                    }

                    resposta = true;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível executar a integração com o Financeiro. " + e);
                } finally {
                    cnfb.desconecta();
                }
            }
        }
        System.out.println("Resposta da integração: " + resposta);
        if (resposta) {
            if (cn.iniciarTransacao()) {
                try {
                    cn.executeAtualizacao("UPDATE rpa SET codigo_fin = '" + codigo + "' WHERE codigo = '" + rpa + "' ;");
                    System.out.println("Atualização da tabela local realizada com sucesso.");

                    cd.setUlt_integ_fin(rpa);
                    cd.salvaProp();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível atualizar a tabela de RPAs.");
                } finally {
                    cn.finalizarTransacao();
                }
            }
        }

        return resposta;
    }

    public int integraFinanceiroMult() {
        int qtdLcto = 0;

        cd.carregaProp();

        int ultRpa = Integer.parseInt(cd.getUlt_integ_fin());

        int nroInicio;
        nroInicio = JOptionPane.showConfirmDialog(null, "Deseja integrar todos os recibos pendentes?", "Integração em Lote", JOptionPane.YES_NO_OPTION);
        ArrayList codigos = new ArrayList();

        if (nroInicio == 0) {
            if (cn.iniciarTransacao()) {
                cn.executeConsulta("SELECT codigo as codigo FROM rpa WHERE codigo >='" + ultRpa++ + "' AND codigo_fin IS NULL;");
                try {
                    while (cn.rs.next()) {
                        codigos.add(cn.rs.getString("codigo"));
                        qtdLcto++;
                    }

                    System.out.println("Códigos: " + codigos);
                } catch (Exception e) {
                } finally {
                    cn.finalizarTransacao();
                }
                System.out.println("Tamanho da lista: " + codigos.size());

                for (int x = 0; x < codigos.size(); x++) {
                    System.out.println("Código capturado: " + codigos.get(x) + ". Número da linha: " + x);
                    integraFinanceiro(codigos.get(x) + "");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Integração Cancelada!", "Integração automática", JOptionPane.INFORMATION_MESSAGE);
        }

        return qtdLcto;
    }

    private boolean sincronizaPessoa() {
        boolean resposta = true;

        ArrayList codigos = new ArrayList();

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta("SELECT codigo FROM cad_pessoas WHERE id_folha IS NULL;");
                while (cn.rs.next()) {
                    codigos.add(cn.rs.getString("codigo"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel sincronizar todas as pessoas.");
            } finally {
                cn.finalizarTransacao();
            }

            System.out.println("Códigos selecionados para sincronização: " + codigos);

            for (int x = 0; x < codigos.size(); x++) {
                System.out.println("Código capturado: " + codigos.get(x) + ". Número da linha: " + x);
                //resposta = sincronizaPessoa(Integer.parseInt(codigos.get(x).toString()));
            }
        }

        return resposta;
    }

    private boolean sincronizaPessoa(int codigo) {
        boolean resposta = true;

        transp.buscaPessoa(codigo);

        String cpf = transp.getCpf();

        String sql;

        int id = codigo;
        int numCad = 0;

        sql = "SELECT numemp, tipcol, numcad, numcpf, numpis, nomfun "
                + "FROM r034FUN WHERE tipcol = 2 AND numemp = 7 "
                + "AND numcpf = '" + cpf + "'";

        if (cnSen.conecta()) {
            try {
                cnSen.executeConsulta(sql);
                while (cnSen.rs.next()) {
                    numCad = cnSen.rs.getInt("numCad");
                }

                //ATUALIZA O CADASTRO DO MYSQL SE A FOLHA DE PAGAMENTOS RETORNAR COM UM CÓDIGO
                if (numCad > 0) {
                    if (cn.iniciarTransacao()) {
                        try {
                            sql = "UPDATE cad_pessoas SET id_folha = '" + numCad + "' "
                                    + "WHERE codigo = '" + codigo + "';";
                            if (cn.executeAtualizacao(sql)) {
                                resposta = true;
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o número do cadastro da pessoa.");
                            resposta = false;
                        } finally {
                            cn.finalizarTransacao();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Transportador " + transp.getNome() + " não está cadastrado na Folha de Pagamentos.");
                    resposta = false;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar o número do cadastro da pessoa.");
                resposta = false;
            } finally {
                cnSen.desconecta();
            }
        } else {
            resposta = false;
            throw new UnsupportedOperationException("Não foi possível conectar com o Banco de Dados.");
        }
        return resposta;
    }

    private String escreveXML(String rpa) {

        TerceirosPagtosFisica2In terc = new TerceirosPagtosFisica2In();
        ObjectFactory objectFactory = new ObjectFactory();
        final StringWriter out = new StringWriter();
        buscaRpa(rpa);
        terc.setNumEmp(objectFactory.createTerceirosPagtosFisica2InNumEmp(numEmp));
        terc.setCodFil(objectFactory.createTerceirosPagtosFisica2InCodFil(codFil));
        terc.setNumCad(objectFactory.createTerceirosPagtosFisica2InNumCad(numCad));
        terc.setSeqPte(objectFactory.createTerceirosPagtosFisica2InSeqPte(seqPte));
        terc.setTipOpe(objectFactory.createTerceirosPagtosFisica2InTipOpe(tipOpe));
        terc.setDatPag(objectFactory.createTerceirosPagtosFisica2InDatPag(datPag));
        terc.setRenBru(objectFactory.createTerceirosPagtosFisica2InRenBru(renBru));
        terc.setCmpPte(objectFactory.createTerceirosPagtosFisica2InCmpPte(cmpPte));
        terc.setCodIse(objectFactory.createTerceirosPagtosFisica2InCodIse(codIse));
        terc.setCodRet(objectFactory.createTerceirosPagtosFisica2InCodRet(codRet));
        terc.setNroRpa(objectFactory.createTerceirosPagtosFisica2InNroRpa(Integer.parseInt(doc)));
        terc.setPerGrp(objectFactory.createTerceirosPagtosFisica2InPerGrp(perGrp));
        terc.setCodSer(objectFactory.createTerceirosPagtosFisica2InCodSer(codSer));
        terc.setValIse(objectFactory.createTerceirosPagtosFisica2InValIse(valIse));
        terc.setInsTrp(objectFactory.createTerceirosPagtosFisica2InInsTrp(terceiros));
        terc.setIrfRet(objectFactory.createTerceirosPagtosFisica2InIrfRet(irrf));
        terc.setConIns(objectFactory.createTerceirosPagtosFisica2InConIns(inss));

        JAXBContext context = null;

        try {
            context = JAXBContext.newInstance(terc.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(
                    javax.xml.bind.Marshaller.JAXB_FRAGMENT,
                    Boolean.TRUE
            );
            marshaller.marshal(terc, new StreamResult(out));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível escrever o XML: " + e);
        }

        return out.toString();

    }

    private boolean integraFolha(String rpa) {
        boolean resposta = false;

        System.out.println("\nCriando objeto 'Service'.");
        G5SeniorServices service = new G5SeniorServices();
        System.out.println("\nObjeto 'Service' criado com sucesso.");

        QName portQName = new QName("http://services.senior.com.br", "rubi_Asynccom_senior_g5_rh_fp_terceirosPort");
        String req = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://services.senior.com.br\"><soapenv:Header/><soapenv:Body><ser:PagtosFisica_2><user>luiz.barcellos</user><password>Lu!z12345</password><encryption>0</encryption>"
                + escreveXML(rpa)
                + "</ser:PagtosFisica_2></soapenv:Body></soapenv:Envelope>";

        //String req = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://services.senior.com.br\"><soapenv:Header/><soapenv:Body><ser:PagtosFisica><user>luiz.barcellos</user><password>Lu!z12345</password><encryption>0</encryption><parameters><cmpPte>09/2017</cmpPte><codFil>1</codFil><codIse>20</codIse><codRet>588</codRet><codSer>1</codSer><conIns>33.88</conIns><datPag>06/10/2017</datPag><insTrp>7.7</insTrp><irfRet>0.0</irfRet><nroRpa>2942</nroRpa><numCad>0</numCad><numEmp>7</numEmp><perGrp>20.0</perGrp><renBru>1540.0</renBru><seqPte>3</seqPte><tipOpe>I</tipOpe><valIse>1386.0</valIse></parameters></ser:PagtosFisica></soapenv:Body></soapenv:Envelope>";
        try { // Call Web Service Operation

            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.MESSAGE);

            System.out.println("\nEnviando requisição: " + req);

            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
            System.out.println("Requisição Enviada: " + result);

            //LEITURA DA RESPOSTA DO XML
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            StreamResult xmlOut = new StreamResult(new StringWriter());
            transformer.transform(result, xmlOut);
            System.out.println("Resposta: " + xmlOut.getWriter().toString());

            //CAPTURA DO NODELIST 'result'
            DocumentBuilder docb = null;
            DocumentBuilderFactory docf = DocumentBuilderFactory.newInstance();
            docb = docf.newDocumentBuilder();

            InputSource is = new InputSource(new ByteArrayInputStream(xmlOut.getWriter().toString().getBytes()));

            Document docm = docb.parse(is);

            NodeList pagtosFisica = docm.getElementsByTagName("ns2:PagtosFisicaResponse");

            int tamPagtosFisica = pagtosFisica.getLength();

            for (int i = 0; i < tamPagtosFisica; i++) {
                Node resultSenior = pagtosFisica.item(i);

                if (resultSenior.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoResultSenior = (Element) resultSenior;
                    NodeList filhos = elementoResultSenior.getChildNodes();
                    int tamanho = filhos.getLength();

                    for (int j = 0; j < tamanho; j++) {
                        Node noFilho = filhos.item(j);

                        //System.out.println("\nCabec Filho - volta " + j + ", lendo: " + noFilho);
                        if (noFilho.getNodeType() == Node.ELEMENT_NODE) {
                            Element elementoFilho = (Element) noFilho;
                            switch (elementoFilho.getTagName()) {
                                case "result":
                                    System.out.println("Resposta do Servidor: " + elementoFilho.getTextContent());
                                    resposta = true;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Não foi possível integrar o RPA " + nroRpa + ". Motivo: " + elementoFilho.getTextContent());
                                    break;
                            }
                        }

                    }
                }
            }

        } catch (Exception ex) {
            // TODO handle custom exceptions here
            JOptionPane.showMessageDialog(null, "Não foi possível integrar com Folha de Pagamentos automaticamente: " + ex);
        }

        return resposta;
    }

    //LEITURA DO XML, original em https://docs.oracle.com/cd/E17904_01/web.1111/e13734/provider.htm#WSADV582
    private String sourceToXMLString(Source result) {
        String xmlResult = null;
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            OutputStream out = new ByteArrayOutputStream();
            StreamResult streamResult = new StreamResult();
            streamResult.setOutputStream(out);
            transformer.transform(result, streamResult);
            xmlResult = streamResult.getOutputStream().toString();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return xmlResult;
    }

    /**
     * Executa o comando de integração com a Folha de Pagamentos. Se quiser
     * integrar todos, parametros devem ser null.
     *
     * @param competencia mm/aaaa
     * @param numeroLcto ID do recibo. Não confundir com número do recibo.
     * @param tipo I - Incluir; E - Excluir; A - Alterar
     * @return
     */
    public boolean integraFolha(String competencia, String numeroLcto, String tipo) {
        boolean resposta = false;

        this.tipOpe = tipo;
        String sql = "SELECT * FROM bsctranscooper.rpa a WHERE a.codigo is not null ";

        if (competencia != null) {
            sql += "and a.competencia = '" + competencia + "' ";
        }

        if (numeroLcto != null) {
            sql += "and a.codigo = '" + numeroLcto + "' ";
        }

        if (sincronizaPessoa()) {

            System.out.println("Iniciando integração!!!");

            ArrayList codigos = new ArrayList();

            if (cn.iniciarTransacao()) {
                try {
                    cn.executeConsulta(sql);
                    while (cn.rs.next()) {
                        codigos.add(cn.rs.getString("codigo"));
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível recuperar os códigos dos RPAS.");
                } finally {
                    cn.finalizarTransacao();
                }

                System.out.println("Códigos selecionados para sincronização: " + codigos);

                for (int x = 0; x < codigos.size(); x++) {
                    System.out.println("Código capturado: " + codigos.get(x) + ". Número da linha: " + x);
                    resposta = integraFolha(codigos.get(x).toString());
                }

            }
        }

        return resposta;
    }

    public boolean fechaFolha(boolean x, String competencia) {
        boolean resposta = false;
        String sql;

        sql = "UPDATE bsctranscooper.rpa a SET a.integ_folha = null "
                + "WHERE a.competencia = '" + competencia + "';";
        if (cn.iniciarTransacao()) {
            cn.executeAtualizacao(sql);
            cn.finalizarTransacao();

        }

        ArrayList codigos = new ArrayList();

        sql = "SELECT A.CODFIL, a.SEQPTE, a.NRORPA "
                + "FROM VETORH.R032TPG a "
                + "WHERE a.NUMEMP = 7 "
                + "AND a.CMPPTE = '01/" + competencia + "' "
                + "AND a.TIPCOL = 2 ";

        if (cnSen.conecta()) {
            try {
                cnSen.executeConsulta(sql);
                while (cnSen.rs.next()) {

                    sql = "SELECT * FROM bsctranscooper.rpa a "
                            + "WHERE a.numero = '" + cnSen.rs.getString("nrorpa") + "' "
                            + "AND a.sequencia = '" + cnSen.rs.getString("seqpte") + "' "
                            + "AND a.competencia = '" + competencia + "';";

                    if (cn.iniciarTransacao()) {
                        cn.executeConsulta(sql);
                        while (cn.rs.next()) {
                            codigos.add(cn.rs.getString("codigo"));
                        }
                        cn.finalizarTransacao();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                cnSen.desconecta();
            }
        }

        for (int i = 0; i < codigos.size(); i++) {
            fechaFolha(x, competencia, codigos.get(i).toString());
        }

        return resposta;
    }

    /**
     * Altera o status Integ_Folha no banco de dados.
     *
     * @param x True = Integrado; False = Não integrado;
     * @param competencia
     * @param codigo
     */
    public boolean fechaFolha(boolean x, String competencia, String codigo) {
        boolean resposta = false;

        try {

            if (competencia == null | "  /    ".equals(competencia)) {
                throw new UnsupportedOperationException("Competência não foi informada.");
            }

            String sql = "UPDATE rpa SET integ_folha = ";

            if (x) {
                sql += " 'S' ";
            } else {
                sql += " null ";
            }

            sql += "WHERE competencia = '" + competencia + "' ";

            if (codigo != null && !"".equals(codigo)) {
                sql += "AND codigo = '" + codigo + "' ";
            }

            if (cn.iniciarTransacao()) {
                try {
                    resposta = cn.executeAtualizacao(sql);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                } finally {
                    cn.finalizarTransacao();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return resposta;
    }

    public int getCodigo() {
        return codigo;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public String getSequencia() {
        return sequencia;
    }

    public String getCod_folha() {
        return cod_folha;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCompetencia() {
        return competencia;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public Date getDt_emissao() {
        return dt_emissao;
    }

    public Date getDt_vencimento() {
        return dt_vencimento;
    }

    public Double getValor_bruto() {
        return valor_bruto;
    }

    public Double getValor_liquido() {
        return valor_liquido;
    }

    public Double getInss() {
        return inss;
    }

    public Double getIrrf() {
        return irrf;
    }

    public Double getTerceiros() {
        return terceiros;
    }

    public String getNome_estabelecimento() {
        return nome_estabelecimento;
    }

    public static void main(String[] args) {

        ConexaoMySQL cn = new ConexaoMySQL();
        cn.conecta("luiz.barcellos", "Lu!z12345");

        RpaIntegrador x = new RpaIntegrador(131, cn);

        //x.escreveXML("1818");
        //x.fechaFolha(true, "10/2017", "");
        x.integraFolha("10/2017", null, "E");
        //System.out.println(x.escreveXML(null));
        //x.integraFinanceiro("678");
        //System.out.println("Resultado final: " + x.buscaRpa("500"));
        //x.integraFinanceiroMult();
        //System.out.println("Valor Bruto: " + x.valor_bruto);
        //System.out.println("Emissao em: " + x.dt_emissao);
        //System.out.println("Resposta sincroniza Pessoa: " + x.sincronizaPessoa());
    }

}
