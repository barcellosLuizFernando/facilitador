/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexoes.ConexaoFB;
import javax.swing.JOptionPane;

/**
 * Captura os valores CÓDIGO e TRANSAÇÃO no Firebird.
 * 
 * @author Luiz Fernando Dill Barcellos
 */
public class FbGenerators {
    
    private int usu_inc;
    private ConexaoFB cnfb;
    
    public FbGenerators(int user){
        this.usu_inc = user;
        cnfb = new ConexaoFB(usu_inc);
    }


    String sql;

    public int getCodigo(String tabela) {
        int codigo = 0;

        sql = "select * from INC_GENERATORS(1, '" + tabela + "')";
        System.out.println("Iniciando pesquisa de código: " + sql);
        if (cnfb.conecta()) {
            try {
                cnfb.executeConsulta(sql);
                while (cnfb.rs.next()) {
                    codigo = cnfb.rs.getInt("GEN");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível recuperar o próximo número do financeiro.");
            } finally {
                cnfb.desconecta();
            }
        }

        return codigo;
    }

    public int getTransacao() {
        int transacao = 0;

        if (cnfb.conecta()) {
            try {
                cnfb.executeConsulta("select gen_id(gen_transacoes0,1) from rdb$database");
                while (cnfb.rs.next()) {
                    transacao = cnfb.rs.getInt(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível definir o número da transação.");
            } finally {
                cnfb.desconecta();
            }
        }

        return transacao;
    }

    public static void main(String[] args) {
        FbGenerators gen = new FbGenerators(131);
        System.out.println("Próximo Código: " + gen.getCodigo("fin_contas_pagar"));
    }

}
