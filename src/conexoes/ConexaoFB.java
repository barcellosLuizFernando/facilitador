/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import telaCadastros.TelaInicial;

public class ConexaoFB {

    private Connection conexao;
    private Statement st;
    public ResultSet rs;

    public static int resultadoUpd = 99;
    private int userlog;

    public static String arquivo = "fb.properties";

    String url, driver, usuario, senha;

    public ConexaoFB(int user) {
        System.out.println("Usuário recebido pela classe ConexaoFB: " + user);
        this.userlog = user;
        System.out.println("Usuário setado pela classe ConexaoFB: " + userlog);
    }

    public static Properties getProp() throws IOException {

        Properties props = new Properties();

        FileInputStream file = new FileInputStream(
                "./src/properties/" + arquivo);
        props.load(file);

        return props;

    }

    public boolean conecta() {

        //JOptionPane.showMessageDialog(null, "vai conectar.");
        boolean isConnected = false;

        try {
            Properties props = getProp();
            driver = props.getProperty("driver");
            url = props.getProperty("url");

            //url = props.getProperty("user");
            //senha = props.getProperty("password");

            /*props.put("user", usuario);
            props.put("password", senha);
            props.put("charset", "UTF8");
            props.put("lc_ctype", "ISO8859_1");*/
            Class.forName(driver);

            conexao = DriverManager.getConnection(url, props);

            isConnected = true;

            conexao.setAutoCommit(false);

            st = conexao.createStatement();
            rs = st.executeQuery("select * from set_user_cde_win (" + userlog + ",null,1,1,null)");
            while (rs.next()) {
                String resultado = (rs.getString(1));
            }
            rs.close();

            resultadoUpd = 0;

            System.out.println("Firebird Conectado, usuário: " + userlog);

        } catch (Exception ex) {

            isConnected = false;

            JOptionPane.showMessageDialog(null, "Não foi possível carregar o "
                    + "driver do banco de dados." + ex);
        }

        return isConnected;
    }

    public boolean desconecta() {

        boolean isConnected = false;

        try {

            switch (resultadoUpd) {
                case 0:
                    st = conexao.createStatement();
                    conexao.commit();
                    break;
                default:
                    st = conexao.createStatement();
                    conexao.rollback();
            }

            conexao.close();
            isConnected = true;
            System.out.println("Firebird desconectado com sucesso.");
        } catch (SQLException sqlEx) {

            isConnected = false;

            throw new RuntimeException(sqlEx);

        }

        return isConnected;

    }

    public boolean executeAtualizacao(String sql) {

        boolean resposta = true;

        try {
            st = this.conexao.createStatement();
            st.executeUpdate(sql);
            System.out.println("Query update Firebird: " + sql);
            st.close();

        } catch (SQLException sqlEx) {
            resultadoUpd = 1;
            resposta = false;
            throw new RuntimeException(sqlEx);
        }

        return resposta;

    }

    public ResultSet executeConsulta(String sql) {

        rs = null;

        try {
            st = this.conexao.createStatement();

            System.out.println("Query consulta Firebird: " + sql);
            rs = st.executeQuery(sql);
        } catch (SQLException sqlEx) {

            throw new RuntimeException(sqlEx);

        }
        return rs;
    }
}
