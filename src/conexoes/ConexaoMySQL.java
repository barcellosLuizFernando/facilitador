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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

public class ConexaoMySQL {

    private Connection conexao;
    private Statement st;
    private PreparedStatement pst;
    public ResultSet rs;

    String url, driver, usuario, senha;

    int resultadoUpd = 99;
    boolean except = true;

    public static Properties getProp() throws IOException {

        Properties props = new Properties();
        try {
            FileInputStream file = new FileInputStream(
                    "./src/properties/mysql.properties");
            props.load(file);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível ler o arquivo de configurações.");
        }

        return props;

    }

    public boolean conecta() {

        boolean resposta = true;

        try {
            System.out.println("MySQL - Capturando arquivo de propriedades");
            Properties props = getProp();
            System.out.println("MySQL - Arquivo capturado. Extraindo propriedade...");
            driver = props.getProperty("driver");
            url = props.getProperty("url");

            System.out.println("MySQL - Propriedades extraídas. Definindo Driver..." + driver);

            Class.forName(driver);

            System.out.println("MySQL - Driver Definido. Criando conexão...");
            conexao = DriverManager.getConnection(url, props);
            st = conexao.createStatement();

            resultadoUpd = 0;

            st.executeUpdate("begin;");

        } catch (ClassNotFoundException | NullPointerException ex) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Não foi possível carregar o "
                    + "driver do banco de dados." + ex);
        } catch (SQLException sqlEx) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados. " + sqlEx);
        } catch (IOException ex) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Não possível carregar o arquivo de configurações. " + ex);
        }

        return resposta;
    }

    public Connection getConnection() {

        boolean resposta = true;

        try {
            System.out.println("MySQL - Capturando arquivo de propriedades");
            Properties props = getProp();
            System.out.println("MySQL - Arquivo capturado. Extraindo propriedade...");
            driver = props.getProperty("driver");
            url = props.getProperty("url");

            System.out.println("MySQL - Propriedades extraídas. Definindo Driver..." + driver);

            Class.forName(driver);

            System.out.println("MySQL - Driver Definido. Criando conexão...");
            conexao = DriverManager.getConnection(url, props);
            st = conexao.createStatement();

            resultadoUpd = 0;

            st.executeUpdate("begin;");

        } catch (ClassNotFoundException | NullPointerException ex) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Não foi possível carregar o "
                    + "driver do banco de dados." + ex);
        } catch (SQLException sqlEx) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados. " + sqlEx);
        } catch (IOException ex) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Não possível carregar o arquivo de configurações. " + ex);
        }

        return conexao;
    }

    public void desconecta() {

        try {

            switch (resultadoUpd) {
                case 0:
                    st = conexao.createStatement();
                    st.executeUpdate("commit;");
                    break;
                default:
                    st = conexao.createStatement();
                    st.executeUpdate("rollback;");
            }

            conexao.close();

            System.out.println("MySQL - Conexão finalizada com sucesso.");

        } catch (Exception sqlEx) {

            System.out.println("MySQL - Conexão não encerrada.");

            JOptionPane.showMessageDialog(null, "Não foi possível desconectar o banco " + sqlEx);

        }

    }

    public boolean executeAtualizacao(String sql) {

        boolean resposta = true;

        try {
            st = conexao.createStatement();

            System.out.println("Preparando para executar Query: " + sql);
            st.executeUpdate(sql);

        } catch (SQLException sqlEx) {
            resultadoUpd = 1;
            if (except) {
                resposta = false;
                JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql" + sql + ".Erro " + sqlEx + " upd " + resultadoUpd);
            }
        }

        return resposta;
    }

    public boolean executeConsulta(String sql) {

        boolean resposta = true;

        try {
            st = conexao.createStatement();

            rs = st.executeQuery(sql);

            System.out.println("MySQL - Realizando consulta ao banco de dados MySQL: " + sql);

        } catch (SQLException sqlEx) {
            resposta = false;
            System.out.println("MySQL - Consulta não realizada no banco de dados MySQL");
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql" + sql + "Erro " + sqlEx);
        }

        System.out.println("Resposta da consulta: " + resposta);
        return resposta;
    }

    public int getResultadoUpd() {
        return resultadoUpd;
    }

    public void setResultadoUpd(int resultadoUpd) {
        this.resultadoUpd = resultadoUpd;
    }

    public boolean isExcept() {
        return except;
    }

    public void setExcept(boolean except) {
        this.except = except;
    }

}
