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

    public static Connection conexao;
    private Statement st;
    private PreparedStatement pst;
    public ResultSet rs;

    private String url, driver, usuario, senha;

    int resultadoUpd = 99;

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

    public boolean conecta(String usuario, String senha) {

        boolean resposta = true;

        try {
            System.out.println("MySQL - Capturando arquivo de propriedades");
            Properties props = getProp();

            props.setProperty("user", usuario);
            this.usuario = usuario;
            props.setProperty("password", senha);
            this.senha = senha;

            System.out.println("MySQL - Arquivo capturado. Extraindo propriedade...");
            driver = props.getProperty("driver");
            url = props.getProperty("url");

            System.out.println("MySQL - Propriedades extraídas. Definindo Driver..." + driver);

            Class.forName(driver);

            System.out.println("MySQL - Driver Definido. Criando conexão...");
            conexao = DriverManager.getConnection(url, props);
            st = conexao.createStatement();

            resultadoUpd = 0;

        } catch (ClassNotFoundException | NullPointerException ex) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Não foi possível carregar o "
                    + "driver do banco de dados.\n" + ex.getMessage());
        } catch (SQLException sqlEx) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados. \n" + sqlEx.getMessage());
        } catch (IOException ex) {
            resposta = false;
            JOptionPane.showMessageDialog(null, "Não possível carregar o arquivo de configurações. \n" + ex.getMessage());
        }

        return resposta;
    }

    /*public Connection getConnection() {

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
    }*/
    public void desconecta() {

        try {

            conexao.close();

            System.out.println("MySQL - Conexão finalizada com sucesso.");

        } catch (Exception sqlEx) {

            System.out.println("MySQL - Conexão não encerrada.");

            JOptionPane.showMessageDialog(null, "Não foi possível desconectar o banco. \n" + sqlEx.getMessage());

        }

    }

    public boolean executeAtualizacao(String sql) {

        boolean resposta = true;

        try {
            st = conexao.createStatement();

            System.out.println("\nPreparando para executar Query: \n" + sql);
            st.executeUpdate(sql);

            resultadoUpd = 0;

        } catch (SQLException sqlEx) {
            resultadoUpd = 1;
            resposta = false;
            //JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql\n" + sql + ".\nErro " + sqlEx);
            JOptionPane.showMessageDialog(null, "\nNão foi possível executar o comando.\nErro: " + sqlEx.getMessage());
        }
        return resposta;
    }

    public boolean executeConsulta(String sql) {

        boolean resposta = true;

        try {
            st = conexao.createStatement();

            rs = st.executeQuery(sql);

            System.out.println("\nMySQL - Realizando consulta ao banco de dados MySQL: " + sql);

        } catch (SQLException sqlEx) {
            resposta = false;
            System.out.println("\nMySQL - Consulta não realizada no banco de dados MySQL");
            JOptionPane.showMessageDialog(null, "Não foi possível executar o comando sql" + sql + "\nErro " + sqlEx.getMessage());
        }

        System.out.println("Resposta da consulta: " + resposta);
        return resposta;
    }

    public boolean iniciarTransacao() {
        boolean resposta = false;
        try {
            conexao.setAutoCommit(false);
            resposta = true;
            System.out.println("\nMYSQL - Transação Iniciada.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao setar autocommit:\n" + e.getMessage());
            resposta = false;
        }
        return resposta;
    }

    public boolean finalizarTransacao() {

        boolean resposta = false;

        try {
            switch (resultadoUpd) {
                case 0:
                    conexao.commit();
                    break;
                default:
                    conexao.rollback();
            }
            resposta = true;
            System.out.println("MYSQL - Transação Finalizada.\n");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar transação:\n" + e.getMessage());
            resposta = false;
        }

        return resposta;
    }

    public int getResultadoUpd() {
        return resultadoUpd;
    }

    public void setResultadoUpd(int resultadoUpd) {
        this.resultadoUpd = resultadoUpd;
    }

    public Connection getConexao() {
        return conexao;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

}
