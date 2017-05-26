/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class ConfereTipo {

    public boolean tipoInteger(String x) {
        boolean z = false;
        try {
            if (x.equals("0")) {
                z = true;
            } else if (Integer.parseInt(x) != 0) z = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor " + x + " é inválido!"
                    + "\nA informação digitada não é um número INTEIRO."
                    + "\nCaracteres inválidos:"
                    + "\n{A-Z,  a-z,  ^,  ~,  /,  \\,  ',  \",  !,  ?,  @,  #,  $,  %,  ¨,  &, "
                    + "\n*,  (,  ),  [,  ],  +,  -,  |,  .,  ;,  =} ", "ERRO", JOptionPane.ERROR_MESSAGE);
            z = false;
        }
        return z;
    }
    
    public static void main(String[] args) {
        ConfereTipo conf = new ConfereTipo();
        conf.tipoInteger("325");
    }

}
