/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import cadastros.ConfigDefault;
import conexoes.ConexaoFB;
import conexoes.ConexaoMySQL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import telaCadastros.TelaInicial;

/**
 *
 * @author ferna
 */
public class ImportaCte {
    
    public ImportaCte(int user){
        this.usu_inc = user;
        cnfb = new ConexaoFB(usu_inc);
    }

    private JFrame parent;
    telaCadastros.TelaInicial ti;
    private int usu_inc;

    private final conexoes.ConexaoFB cnfb;
    private final conexoes.ConexaoMySQL cn = new ConexaoMySQL();
    private final cadastros.ConfigDefault cd = new ConfigDefault();
    private final DataFechamento fechamento = new DataFechamento();
    private final DateFormat dateIn = new SimpleDateFormat("dd.MM.yyyy");

    Timestamp sinc = null;
    int cteImportado;
    int cteDuplicado;

    /**
     * Captura todos os CTEs autorizados. Método verifica quais os conhecimentos
     * de fretes que ainda não foram importados, e puxa para a base atual.
     *
     * @param numeroCte Informar 0 para importar todos
     * @param mostraExcept Booleano que define se serão mostradas Exceptions.
     * @param p JFrame que está requisitando a Thread
     */
    public void buscaCteAutorizado(final int numeroCte, final boolean mostraExcept, final JFrame p, final boolean msgResumo) {
        new Thread() {
            public void run() {
                System.out.println("CULSULTA CTE - Iniciando Thread");
                parent = p;
                ti = (TelaInicial) parent;
                ti.setState(TelaInicial.NORMAL);
                System.out.println("CONSULTA CTE - State = NORMAL: " + ti);
                ti.setStatus(1);
                System.out.println("CONSULTA CTE - Status enviado para tela inicial.");

                cn.setExcept(mostraExcept);

                int qtdCte = 0;
                int qtdCteDup = 0;

                String condicao;

                System.out.println("Iniciando procedimento para sincronização de CTEs.");
                cd.carregaProp();

                if (cn.conecta()) {
                    try {
                        cn.executeConsulta("SELECT data FROM fechamento;");
                        while (cn.rs.next()) {
                            sinc = cn.rs.getTimestamp("data");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    } finally {
                        cn.desconecta();
                    }
                }

                System.out.println("Última sincronização em " + sinc);

                if (numeroCte == 0) {
                    condicao = " where a.hora_emissao > '" + dateIn.format(fechamento.getData("us")) + "' and a.status_envio = 'AU' ";
                } else {
                    condicao = " where a.numero =  '" + numeroCte + "' and a.hora_emissao > '" + dateIn.format(fechamento.getData("us")) + "' ";
                }

                String sql = "with conhecimentos as(select a.empresa,a.emitente,a.hora_emissao as emissao,"
                        + "a.numero,a.serie,a.chave_cte,a.operacao,"
                        + "b.nome as natureza,a.tp_cte,a.status_envio,"
                        + "a.vlr_total_serv as valor,(SELECT FIRST 1 (RV.PLACA) "
                        + "FROM REL_CT_VEICULOS RV WHERE A.EMPRESA=RV.EMPRESA "
                        + "AND A.SERIE=RV.SERIE AND A.NUMERO=RV.NUMERO) AS PLACA, "
                        + "c.quantidade as peso, d.nome||'/'||  d.uf as origem, dd.nome||'/'|| dd.uf as destino,"
                        + "e.vlr_componente as pedagio "
                        + "from fro_conhecimento_transporte a "
                        + "left join cad_operacoes_fisc b on (b.empresa = a.empresa and b.codigo = a.operacao) "
                        + "left join fro_ct_unidades c on (c.empresa = a.empresa and c.numero = a.numero and c.serie = a.serie and c.tp_medida = 'PESO BRUTO') "
                        + "left join cad_municipios d on (d.codigo = a.mun_ini_prestacao) "
                        + "left join cad_municipios dd on (dd.codigo = a.mun_fim_prestacao) "
                        + "left join FRO_CT_DETALHE e on (e.empresa = a.empresa and e.numero = a.numero and e.serie = a.serie and e.nome_componente = 'VALOR PEDAGIO') "
                        + condicao + " ) "
                        + "select z.empresa,z.emitente,z.emissao,z.numero,z.serie,z.chave_cte,"
                        + "z.operacao,z.natureza,z.tp_cte,z.status_envio,z.valor,"
                        + "z.placa,y.codigo as cod_transportador,y.nome as transportador,"
                        + "current_timestamp as importacao, z.peso , z.origem, z.destino, z.pedagio "
                        + "from conhecimentos z "
                        + "left join cad_veiculos zz on (zz.empresa = z.empresa and zz.placa = z.placa) "
                        + "left join cad_terceiros y on (y.empresa = zz.empresa and y.codigo = zz.cliente)"
                        + "WHERE y.pessoa_fj = 'F';";
                System.out.println("Comando: " + sql);

                if (cnfb.conecta()) {
                    if (cn.conecta()) {
                        try {
                            cnfb.executeConsulta(sql);
                            while (cnfb.rs.next()) {
                                //System.out.println("Iniciando laço!");
                                sql = "INSERT INTO conhecimentos (empresa,emitente,numero,"
                                        + "serie,emissao,chave,operacao,natureza,tp_cte,status_envio,"
                                        + "valor,placa,cod_transportador,nome_transportador,"
                                        + "importacao,peso,mun_origem,mun_destino,pedagio) VALUES('"
                                        + cnfb.rs.getInt("empresa") + "','"
                                        + cnfb.rs.getInt("emitente") + "','"
                                        + cnfb.rs.getInt("numero") + "','"
                                        + cnfb.rs.getString("serie") + "','"
                                        + cnfb.rs.getTimestamp("emissao") + "','"
                                        + cnfb.rs.getString("chave_cte") + "','"
                                        + cnfb.rs.getInt("operacao") + "','"
                                        + cnfb.rs.getString("natureza") + "','"
                                        + cnfb.rs.getInt("tp_cte") + "','"
                                        + cnfb.rs.getString("status_envio") + "','"
                                        + cnfb.rs.getDouble("valor") + "','"
                                        + cnfb.rs.getString("placa") + "','"
                                        + cnfb.rs.getInt("cod_transportador") + "','"
                                        + cnfb.rs.getString("transportador") + "','"
                                        + cnfb.rs.getTimestamp("importacao") + "','"
                                        + cnfb.rs.getDouble("peso") + "','"
                                        + cnfb.rs.getString("origem") + "','"
                                        + cnfb.rs.getString("destino") + "','"
                                        + cnfb.rs.getDouble("pedagio")
                                        + "');";
                                if (cn.executeAtualizacao(sql)) {
                                    sinc = cnfb.rs.getTimestamp("importacao");
                                } else {
                                    System.out.println("Não foi possível executar a importação.");
                                }

                                //System.out.println("UPD Classe: " + cn.getResultadoUpd());
                                if (cn.getResultadoUpd() > 0) {
                                    qtdCteDup++;
                                } else {
                                    qtdCte++;
                                }
                                //System.out.println("Quantidade de Duplicados: " + qtdCteDup);
                                //System.out.println("Quantidade de Importados: " + qtdCte);

                            }

                            ti.setStatus(2);
                            cn.setResultadoUpd(0);
                        } catch (Exception e) {
                            cn.setResultadoUpd(1);
                            JOptionPane.showMessageDialog(null, "Não foi possível importar os Conhecimentos de Frete. " + e);
                        } finally {
                            cnfb.desconecta();
                            cn.desconecta();
                            setCteImportado(qtdCte);
                            setCteDuplicado(qtdCteDup);
                        }
                    }

                    /*
                    Condição somente mostrará mensagem, quando for realizada a importação manual.
                    Na importação automática, sempre irá atualizar os CTEs cancelados.
                     */
                    if (msgResumo) {
                        JOptionPane.showMessageDialog(null, "\rSincronização Finalizada\r. "
                                + "\nImportados: " + qtdCte + ". "
                                + "\nDuplicados, não importados: " + qtdCteDup + ". ");
                    } else {
                        buscaCteCancelado();
                    }

                } else {
                    ti.setStatus(99);
                }

                //cn.setResultadoUpd(0);
                if (numeroCte == 0) {
                    cd.setUltima_sincronizacao(sinc);
                    cd.salvaProp();
                } else {
                    System.out.println("Arquivo properties não foi atualizado.");
                }
                System.out.println("Conhecimentos Importados: " + getCteImportado());
                System.out.println("Conhecimentos Duplicados, não importados: " + getCteDuplicado());

            }
        }.start();
    }

    public int buscaCteCancelado() {
        int qtdCte = 0;

        String chave;
        String status;

        String sql;

        if (cnfb.conecta()) {

            sql = "with conhecimentos as(select a.empresa,a.emitente,a.hora_emissao as emissao,"
                    + "a.numero,a.serie,a.chave_cte,a.operacao,"
                    + "b.nome as natureza,a.tp_cte,a.status_envio,"
                    + "a.vlr_total_serv as valor,(SELECT FIRST 1 (RV.PLACA) "
                    + "FROM REL_CT_VEICULOS RV WHERE A.EMPRESA=RV.EMPRESA "
                    + "AND A.SERIE=RV.SERIE AND A.NUMERO=RV.NUMERO) AS PLACA, "
                    + "c.quantidade as peso, d.nome||'/'||  d.uf as origem, dd.nome||'/'|| dd.uf as destino, "
                    + "e.vlr_componente as pedagio "
                    + "from fro_conhecimento_transporte a "
                    + "left join cad_operacoes_fisc b on (b.empresa = a.empresa and b.codigo = a.operacao) "
                    + "left join fro_ct_unidades c on (c.empresa = a.empresa and c.numero = a.numero and c.serie = a.serie and c.tp_medida = 'PESO BRUTO') "
                    + "left join cad_municipios d on (d.codigo = a.mun_ini_prestacao) "
                    + "left join cad_municipios dd on (dd.codigo = a.mun_fim_prestacao) "
                    + "left join FRO_CT_DETALHE e on (e.empresa = a.empresa and e.numero = a.numero and e.serie = a.serie and e.nome_componente = 'VALOR PEDAGIO' )"
                    + "where a.status_envio = 'CA' and a.hora_emissao >= '" + dateIn.format(fechamento.getData("us")) + "') "
                    + "select z.empresa,z.emitente,z.emissao,z.numero,z.serie,z.chave_cte,"
                    + "z.operacao,z.natureza,z.tp_cte,z.status_envio,z.valor,"
                    + "z.placa,y.codigo as cod_transportador,y.nome as transportador,"
                    + "current_timestamp as importacao, z.peso , z.origem, z.destino, z.pedagio "
                    + "from conhecimentos z "
                    + "left join cad_veiculos zz on (zz.empresa = z.empresa and zz.placa = z.placa) "
                    + "left join cad_terceiros y on (y.empresa = zz.empresa and y.codigo = zz.cliente)"
                    + "WHERE y.pessoa_fj = 'F';";

            cnfb.executeConsulta(sql);
            if (cn.conecta()) {
                try {
                    while (cnfb.rs.next()) {
                        chave = cnfb.rs.getString("chave_cte");
                        status = cnfb.rs.getString("status_envio");

                        sql = "UPDATE conhecimentos SET status_envio = '" + status + "' "
                                + "WHERE chave = '" + chave + "';";

                        if (cn.executeAtualizacao(sql)) {
                            qtdCte++;
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível atualizar o STATUS dos conhecimentos.");
                } finally {
                    cn.desconecta();
                    cnfb.desconecta();
                }
            }

        }
        System.out.println("CTe cancelado, atualizado: " + qtdCte + ".");
        return qtdCte;
    }

    private int atualizaCadCte() {
        int qtdCte = 0;

        String emitente;
        String numero;
        String serie;
        String origem;
        String destino;
        Double peso;
        Double pedagio;

        String sql;

        atualiza:
        if (cn.conecta()) {
            try {
                sql = "SELECT * FROM conhecimentos WHERE pedagio IS NULL;";
                cn.executeConsulta(sql);
                if (cnfb.conecta()) {
                    while (cn.rs.next()) {
                        emitente = cn.rs.getString("emitente");
                        numero = cn.rs.getString("numero");
                        serie = cn.rs.getString("serie");

                        sql = "with conhecimentos as(select a.empresa,a.emitente,a.hora_emissao as emissao,"
                                + "a.numero,a.serie,a.chave_cte,a.operacao,"
                                + "b.nome as natureza,a.tp_cte,a.status_envio,"
                                + "a.vlr_total_serv as valor,(SELECT FIRST 1 (RV.PLACA) "
                                + "FROM REL_CT_VEICULOS RV WHERE A.EMPRESA=RV.EMPRESA "
                                + "AND A.SERIE=RV.SERIE AND A.NUMERO=RV.NUMERO) AS PLACA, "
                                + "c.quantidade as peso, d.nome||'/'||  d.uf as origem, dd.nome||'/'|| dd.uf as destino, "
                                + "e.vlr_componente as pedagio "
                                + "from fro_conhecimento_transporte a "
                                + "left join cad_operacoes_fisc b on (b.empresa = a.empresa and b.codigo = a.operacao) "
                                + "left join fro_ct_unidades c on (c.empresa = a.empresa and c.numero = a.numero and c.serie = a.serie and c.tp_medida = 'PESO BRUTO') "
                                + "left join cad_municipios d on (d.codigo = a.mun_ini_prestacao) "
                                + "left join cad_municipios dd on (dd.codigo = a.mun_fim_prestacao) "
                                + "left join FRO_CT_DETALHE e on (e.empresa = a.empresa and e.numero = a.numero and e.serie = a.serie and e.nome_componente = 'VALOR PEDAGIO' )"
                                + "where a.emitente = '" + emitente + "' AND a.numero = '" + numero + "' AND a.serie = '" + serie + "') "
                                + "select z.empresa,z.emitente,z.emissao,z.numero,z.serie,z.chave_cte,"
                                + "z.operacao,z.natureza,z.tp_cte,z.status_envio,z.valor,"
                                + "z.placa,y.codigo as cod_transportador,y.nome as transportador,"
                                + "current_timestamp as importacao, z.peso , z.origem, z.destino, z.pedagio "
                                + "from conhecimentos z "
                                + "left join cad_veiculos zz on (zz.empresa = z.empresa and zz.placa = z.placa) "
                                + "left join cad_terceiros y on (y.empresa = zz.empresa and y.codigo = zz.cliente);";

                        cnfb.executeConsulta(sql);
                        while (cnfb.rs.next()) {
                            origem = cnfb.rs.getString("origem");
                            destino = cnfb.rs.getString("destino");
                            peso = cnfb.rs.getDouble("peso");
                            pedagio = cnfb.rs.getDouble("pedagio");

                            sql = "UPDATE conhecimentos SET pedagio = '" + pedagio + "' "
                                    + "WHERE emitente = '" + emitente + "' "
                                    + "AND numero = '" + numero + "' "
                                    + "AND serie = '" + serie + "' ;";

                            if (cn.executeAtualizacao(sql)) {
                                qtdCte++;
                            } else {
                                break atualiza;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar os conhecimentos. " + e);
            } finally {
                cn.desconecta();
                cnfb.desconecta();
            }
        }

        return qtdCte;
    }

    private void setCteImportado(int cteImportado) {
        this.cteImportado = cteImportado;
    }

    private void setCteDuplicado(int cteDuplicado) {
        this.cteDuplicado = cteDuplicado;
    }

    public int getCteImportado() {
        return cteImportado;
    }

    public int getCteDuplicado() {
        return cteDuplicado;
    }

    public static void main(String[] args) {
        ImportaCte cte = new ImportaCte(131);
        TelaInicial ti = new TelaInicial();

        cte.buscaCteAutorizado(0, false, ti, false);
        ti.dispose();

        //System.out.println("CTe cancelado, atualizado: " + cte.buscaCteCancelado());
        //System.out.println("Conhecimentos Atualizados: " + cte.atualizaCadCte());
    }
}
