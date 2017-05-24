package conexoes;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoORCL {

    private Connection conexao;
    private Statement st;
    public ResultSet rs;

    String url, driver, usuario, senha;

    public static int resultadoUpd = 99;

    public static Properties getProp() throws IOException {

        Properties props = new Properties();

        FileInputStream file = new FileInputStream(
                "./src/properties/orcl.properties");
        props.load(file);

        return props;

    }

    public boolean conecta() {
        boolean resposta = false;
        try {
            System.out.println("ORACLE - Capturando arquivo de propriedades");
            Properties props = getProp();
            System.out.println("ORACLE - Arquivo capturado. Extraindo propriedade...");
            driver = props.getProperty("driver");
            url = props.getProperty("url");
            System.out.println("ORACLE - Propriedades extraídas. Definindo Driver..." + driver);
            Class.forName(driver);
            System.out.println("ORACLE - Driver Definido. Criando conexão...");
            conexao = DriverManager.getConnection(url, props);
            //st = conexao.createStatement();

            conexao.setAutoCommit(false);

            resultadoUpd = 0;

            //st.executeUpdate("begin");
            resposta = true;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível carregar o "
                    + "driver do banco de dados." + ex);
        } catch (SQLException sqlEx) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados. " + sqlEx);
        } catch (IOException ex) {
            Logger.getLogger(ConexaoORCL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resposta;
    }

    public void desconecta() {

        try {

            switch (resultadoUpd) {
                case 0:
                    //st = conexao.createStatement();
                    //st.executeUpdate("commit");
                    conexao.commit();
                    break;
                default:
                    conexao.rollback();
                //st = conexao.createStatement();
                //st.executeUpdate("rollback");
            }

            conexao.close();
            
            System.out.println("ORACLE - Conexão finalizada com sucesso.");

        } catch (SQLException sqlEx) {

            JOptionPane.showMessageDialog(null, "Não foi possível desconectar o banco " + sqlEx);

        }

    }

    public void executeAtualizacao(String sql) {

        try {
            st = conexao.createStatement();
            st.executeUpdate(sql);

        } catch (SQLException sqlEx) {
            resultadoUpd = 1;
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql" + sql + ".Erro " + sqlEx + " upd " + resultadoUpd);

        }

    }

    public void executeConsulta(String sql) {

        try {
            st = conexao.createStatement();
            System.out.println("ORACLE - Realizando consulta ao banco de dados ORACLE: " + sql);

            rs = st.executeQuery(sql);

        } catch (SQLException sqlEx) {

            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql" + sql + "Erro " + sqlEx);

        }

    }
}
