/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexoes.ConexaoFB;
import conexoes.ConexaoMySQL;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class Transportador {
    
    private conexoes.ConexaoFB cnfb;
    private conexoes.ConexaoMySQL cn;

    private String id_fin;
    private String id_folha;
    private String nome;
    private String cpf;
    private String pis;
    private String rg;
    private String org_emissor;
    private String rg_dt_emissao;
    private String classificacao;
    private Double inss_bc;
    private Double inss_aliq;
    private Double inss_teto;
    private Double irrf_bc;
    private Double irrf_aliq;
    private Double margem;
    public int usu_inc;
    
    public Transportador(int user, ConexaoMySQL conn){
        
        this.usu_inc = user;
        this.cn = conn;
        
        cnfb = new ConexaoFB(usu_inc);
        
    }

    public static Properties getProp() throws IOException {

        Properties props = new Properties();
        try {
            FileInputStream file = new FileInputStream(
                    "./src/properties/default.properties");
            props.load(file);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Default - Não foi possível ler o arquivo de configurações.");
        }

        return props;

    }


    public void buscaPessoa(int pessoa, String data) {
        id_fin = null;
        id_folha = null;
        nome = null;
        cpf = null;
        pis = null;
        rg = null;
        org_emissor = null;
        rg_dt_emissao = null;
        classificacao = null;
        inss_bc = null;
        inss_aliq = null;
        inss_teto = null;
        irrf_bc = null;
        irrf_aliq = null;
        margem = null;

        String sql = "SELECT * FROM cad_terceiros a "
                + "WHERE a.codigo = '" + pessoa + "' "
                + "AND a.codigo in (select b.cliente from cad_veiculos b where b.tipo_veiculo = 0) "
                + "AND a.pessoa_fj = 'F'  ";

        if (cnfb.conecta()) {
            System.out.println("Pesquisando transportador: " + sql);
            try {
                cnfb.executeConsulta(sql);
                while (cnfb.rs.next()) {
                    id_fin = cnfb.rs.getString("codigo");
                    nome = cnfb.rs.getString("nome");
                    cpf = cnfb.rs.getString("cpf_cnpj");
                    rg = cnfb.rs.getString("rg");
                    org_emissor = cnfb.rs.getString("rg_orgao_expedidor");
                    rg_dt_emissao = cnfb.rs.getString("rg_data_expedicao");
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Não foi possível consultar o cadastro de pessoas. " + e);
            } finally {
                cnfb.desconecta();
            }

            System.out.println("Código da pessoa: " + id_fin);
            if (id_fin != null) {
                pesquisaClassificacao(Integer.parseInt(id_fin), data);
            }
        }
    }

    /**
     * Consulta Banco de Dados local. Este método é responsável por buscar as 
     * informações da pessoa no banco MySQL. Utilizado para preencher formulários 
     * de pesquisa, destinados a consulta e impressão.
     * @param pessoa Código do autônomo. É o mesmo do Firebird.
     */
    public void buscaPessoa(int pessoa) {
        id_fin = null;
        id_folha = null;
        nome = null;
        cpf = null;
        pis = null;
        rg = null;
        org_emissor = null;
        rg_dt_emissao = null;

        String sql = "SELECT * FROM cad_pessoas WHERE codigo = '" + pessoa + "';";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    id_fin = cn.rs.getString("codigo");
                    id_folha = cn.rs.getString("id_folha");
                    nome = cn.rs.getString("nome");
                    cpf = cn.rs.getString("cpf");
                    pis = cn.rs.getString("pis");
                    rg = cn.rs.getString("rg");
                    org_emissor = cn.rs.getString("rg_emissor");
                    rg_dt_emissao = cn.rs.getString("rg_dtEmissao");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados da pessoa na base local.");
            } finally {
                cn.finalizarTransacao();
            }
        }
    }

    public void pesquisaClassificacao(int pessoa, String data) {
        String sql = "select case when a.tipo = 'A' then 'Cooperado' else 'Terceiro' end as classificacao "
                + "from cad_terceiros_cooperados_hist a where codigo = '" + pessoa + "' "
                + "and a.data = (select max(b.data) "
                + "from cad_terceiros_cooperados_hist b "
                + "where b.codigo = a.codigo and b.data <= '" + data.replace("/", ".") + "')";
        if (cnfb.conecta()) {
            System.out.println("Pesquisando classificacao: " + sql);
            try {
                cnfb.executeConsulta(sql);
                while (cnfb.rs.next()) {
                    classificacao = cnfb.rs.getString("classificacao");
                }

                if (classificacao == null) {
                    classificacao = "Terceiro";
                }

                System.out.println("Captura da classificação: " + classificacao);

                defineBases();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível definir a classificação da pessoa. " + e);
            } finally {
                cnfb.desconecta();
            }
        }

    }

    public void defineBases() {
        System.out.println("Definindo bases.");
        try {
            Properties props = getProp();

            if ("Cooperado".equals(classificacao)) {
                margem = Double.parseDouble(props.getProperty("margem_cooperado"));
                inss_aliq = Double.parseDouble(props.getProperty("inss_aliq_cooperado"));
                inss_bc = Double.parseDouble(props.getProperty("inss_bc_cooperado"));
                irrf_bc = Double.parseDouble(props.getProperty("irrf_bc_cooperado"));

            } else {
                margem = Double.parseDouble(props.getProperty("margem_terceiro"));
                inss_aliq = Double.parseDouble(props.getProperty("inss_aliq_terceiro"));
                inss_bc = Double.parseDouble(props.getProperty("inss_bc_terceiro"));
                irrf_bc = Double.parseDouble(props.getProperty("irrf_bc_terceiro"));
            }
            System.out.println("Bases definidas. ");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível definir as propriedades.");
        }

    }

    public boolean conferePessoa() {
        boolean resposta = false;

        int confereCad = 0;

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta("SELECT codigo FROM cad_pessoas WHERE codigo = '" + id_fin + "';");
                while (cn.rs.next()) {
                    confereCad = cn.rs.getInt("codigo");
                }

                if (confereCad > 0) {
                    resposta = true;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível consultar o cadastro local de pessoas.");
            } finally {
                cn.finalizarTransacao();
            }
        }

        if (resposta == false) {
            String pis = JOptionPane.showInputDialog(null, "Informe o número do PIS para continuar.", "Novo Transportador", JOptionPane.QUESTION_MESSAGE);
            resposta = importaPessoa(pis);
        }

        System.out.println("Resposta da conferência de pessoa: " + resposta);

        return resposta;
    }

    private boolean importaPessoa(String pis) {
        boolean resposta = false;

        if (validatePIS(pis)) {
            System.out.println("Pis Validado.");

            this.pis = pis;
            String sql;

            if (cn.iniciarTransacao()) {
                try {
                    sql = "INSERT INTO cad_pessoas (codigo,nome,rg,rg_emissor,cpf,pis) "
                            + "VALUES ('" + id_fin + "','" + nome + "','" + rg + "','"
                            + org_emissor + "','" + cpf + "','" + pis + "');";

                    resposta = cn.executeAtualizacao(sql);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Não foi possível importar o cadastro de transportador automaticamente.");
                } finally {
                    cn.finalizarTransacao();
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Número do PIS inválido.");
        }

        System.out.println("Resposta da impostação de pessoa: " + resposta);

        return resposta;
    }

    private boolean validatePIS(String plPIS) {
        int liTamanho = 0;
        StringBuffer lsAux = null;
        StringBuffer lsMultiplicador = new StringBuffer("3298765432");
        int liTotalizador = 0;
        int liResto = 0;
        int liMultiplicando = 0;
        int liMultiplicador = 0;
        boolean lbRetorno = true;
        int liDigito = 99;
        lsAux = new StringBuffer().append(plPIS);
        liTamanho = lsAux.length();
        if (liTamanho != 11) {
            lbRetorno = false;
        }
        if (lbRetorno) {
            for (int i = 0; i < 10; i++) {
                liMultiplicando = Integer.parseInt(lsAux.substring(i, i + 1));
                liMultiplicador = Integer.parseInt(lsMultiplicador.substring(i, i + 1));
                liTotalizador += liMultiplicando * liMultiplicador;
            }
            liResto = 11 - liTotalizador % 11;
            liResto = liResto == 10 || liResto == 11 ? 0 : liResto;
            liDigito = Integer.parseInt("" + lsAux.charAt(10));
            lbRetorno = liResto == liDigito;

            System.out.println("Dígito Verificar do PIS digitado: " + liDigito);
            System.out.println("Dígito Verificar do PIS calculado: " + liResto);
        }
        System.out.println("Validação: " + lbRetorno);
        return lbRetorno;
    }

    public String getId_fin() {
        return id_fin;
    }

    public String getId_folha() {
        return id_folha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getPis() {
        return pis;
    }

    public String getRg() {
        return rg;
    }

    public String getOrg_emissor() {
        return org_emissor;
    }

    public String getRg_dt_emissao() {
        return rg_dt_emissao;
    }

    public Double getMargem() {
        return margem;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public Double getInss_bc() {
        return inss_bc;
    }

    public Double getInss_aliq() {
        return inss_aliq;
    }

    public Double getInss_teto() {
        return inss_teto;
    }

    public Double getIrrf_bc() {
        return irrf_bc;
    }

    public Double getIrrf_aliq() {
        return irrf_aliq;
    }

//    public static void main(String[] args) {
//        Transportador transp = new Transportador(131);
//        transp.validatePIS("10721541841");
//    }

}
