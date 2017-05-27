/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 * Esta é uma classe que irá verificar se existe frame no Desktop
 *
 * @author (dsfextreme@pop.com.br)
 */
public abstract class VerificaFrame {

    /**
     * Creates a new instance of VerificaFrame
     */
    public VerificaFrame() {
    }

    public static Boolean verificaFrame(JDesktopPane jDesktopPane, JInternalFrame frame) {
        Boolean valor = false;
        JInternalFrame[] results;
        results = jDesktopPane.getAllFrames();
        for (int i = 0; i < results.length;
                i++) {
            if (results[i].equals(frame)) {
                valor = true;
                break;
            }
        }
        return valor;
    }
}
