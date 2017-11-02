/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexoes.ConexaoMySQL;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class RpaCodigos {

    private ConexaoMySQL cn;
    private String sql;
    
    public RpaCodigos(ConexaoMySQL conn){
        this.cn = conn;
    }

    public int getSequencia(String competencia, String transportador, String estabelecimento, int seq_inicial) {

        int sequencia = seq_inicial;

        sql = "SELECT max(sequencia) as seq FROM rpa "
                + "WHERE competencia = '" + competencia + "' "
                + "AND transportador = '" + transportador + "' "
                + "AND estabelecimento = '" + estabelecimento + "';";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);

                while (cn.rs.next()) {
                    sequencia = cn.rs.getInt("seq");
                    sequencia++;
                    System.out.println("Valor da sequencia: " + sequencia);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível capturar o número da sequencia.");
            } finally {
                cn.finalizarTransacao();
            }
        }
        return sequencia;
    }

    public int getNumeroRecibo(String estabelecimento) {
        int nroRecibo = 0;

        String sql;

        if (cn.iniciarTransacao()) {
            sql = "SELECT MAX(numero) as codigo FROM rpa WHERE estabelecimento = '" + estabelecimento + "'";
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    nroRecibo = cn.rs.getInt("codigo");
                }
                nroRecibo++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível recuperar o último número de recibo.");
            } finally {
                cn.finalizarTransacao();
            }
        }

        return nroRecibo;
    }

    public int getId(String tabela) {

        int id = 0;

        sql = "SHOW TABLE STATUS like '" + tabela + "';";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    id = cn.rs.getInt("auto_increment");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível definir a próxima id no MySQL.");

            } finally {
                cn.finalizarTransacao();
            }
        }
        return id;
    }

//    public static void main(String[] args) {
//        RpaCodigos rpa = new RpaCodigos();
//
//        int squencia = rpa.getSequencia("04", "1633", "2", 1);
//
//        System.out.println("Sequencia: " + squencia);
//
//    }

}
