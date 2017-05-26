/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaCadastros;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author luiz.barcellos
 */
public class Main {

    public static void main(String[] args) {

        try {
            Properties props = new Properties();
            props.put("logoString", "TransCooper");
            //props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            //props.put("selectionBackgroundColor", "180 240 197"); 
            //props.put("menuSelectionBackgroundColor", "180 240 197"); 

            //props.put("controlColor", "218 254 230");
            //props.put("controlColorLight", "218 254 230");
            //props.put("controlColorDark", "180 240 197"); 
            //props.put("buttonColor", "218 230 254");
            //props.put("buttonColorLight", "255 255 255");
            //props.put("buttonColorDark", "244 242 232");
            //props.put("rolloverColor", "218 254 230"); 
            //props.put("rolloverColorLight", "218 254 230"); 
            //props.put("rolloverColorDark", "180 240 197"); 
            //props.put("windowTitleForegroundColor", "0 0 0");
            //props.put("windowTitleBackgroundColor", "0 0 0"); 
            //props.put("windowTitleColorLight", "0 100 0"); 
            //props.put("windowTitleColorDark", "0 60 0"); 
            //props.put("windowBorderColor", "0 100 0");
            AluminiumLookAndFeel.setCurrentTheme(props);

            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

}
