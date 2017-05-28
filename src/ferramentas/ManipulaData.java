/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Fernando Dill Barcellos
 */
public class ManipulaData {

    private final DateFormat dateOut = new SimpleDateFormat("yyyy/MM/dd");
    private final DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");

    private Date data;

    /**
     * Converte uma competência em data. Recebe uma string do tipo "DD/AAAA" e
     * retorna a data do último dia do mês, sem formatação.
     *
     * @param competencia String do tipo "DD/AAAA"
     * @return Data sem formatação
     */
    public Date ultimoDia(String competencia) {
        try {
            data = dateIn.parse("01/" + competencia);

            Calendar data2 = Calendar.getInstance();
            data2.setTime(data);

            data2.set(Calendar.MONTH, data2.get(Calendar.MONTH) + 1);
            data2.set(Calendar.DAY_OF_MONTH, data2.get(Calendar.DAY_OF_MONTH) - 1);

            data = data2.getTime();

            System.out.println("Formatação: " + data);

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return data;
    }

    public static void main(String[] args) {
        ManipulaData d = new ManipulaData();
        System.out.println("Resposta: " + d.ultimoDia("05/2017"));
    }
}
