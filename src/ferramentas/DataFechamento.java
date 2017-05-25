/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import conexoes.ConexaoMySQL;
import javax.swing.JFormattedTextField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class DataFechamento {
    
    private conexoes.ConexaoMySQL cn = new ConexaoMySQL();
    private DateFormat dateOut = new SimpleDateFormat("yyyy/MM/dd");
    private DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");

    private Date data;

    private void buscaFechamento() {
        if (cn.conecta()) {
            try {
                cn.executeConsulta("SELECT * FROM fechamento;");
                while (cn.rs.next()) {
                    data = cn.rs.getDate(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível recuperar a data de fechamento.", "Fechamento", JOptionPane.ERROR_MESSAGE);
            } finally {
                cn.desconecta();
            }
        }
    }

    /**
     * Busca no banco de dados a data atual de fechamento.
     * @param lang Recebe os critérios 'br' para brasileiro, e 'us' para Inglês
     * @return Data formatada conforme o idioma.
     */
    public Date getData(String lang) {
        buscaFechamento();
        if("br".equals(lang)){
            try {
                data = dateIn.parse(dateIn.format(data));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível formatar a data.", "Fechamento", JOptionPane.ERROR_MESSAGE);
            }
        }            
        return data;
    }  
    

    public static void main(String[] args) {
        DataFechamento d = new DataFechamento();
        System.out.println("Data de fechamento atual: " + d.getData("br"));
        
    }
}
