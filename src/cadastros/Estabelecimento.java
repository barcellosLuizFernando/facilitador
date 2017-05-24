/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexoes.ConexaoMySQL;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class Estabelecimento {

    conexoes.ConexaoMySQL cn = new ConexaoMySQL();

    String id;
    String razao_social;
    String cnpj;
    String cad_icms;
    String cidade;
    String uf;

    public String getId() {
        return id;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCad_icms() {
        return cad_icms;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public void buscaEstabelecimento(int estab) {

        id = "";
        razao_social = "";
        cnpj = "";
        cad_icms = "";
        cidade = "";
        uf = "";

        String sql = "SELECT * FROM cad_estabelecimentos WHERE id = '" + estab + "';";
        if (cn.conecta()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    id = cn.rs.getString("id");
                    razao_social = cn.rs.getString("razao_social");
                    cnpj = cn.rs.getString("inscricao_federal");
                    cad_icms = cn.rs.getString("inscricao_estadual");
                    cidade = cn.rs.getString("cidade");
                    uf = cn.rs.getString("uf");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível consultar os dados do estabelecimento");
            } finally {
                cn.desconecta();
            }
        }
    }
}
