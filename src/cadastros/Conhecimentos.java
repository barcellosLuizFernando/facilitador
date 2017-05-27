/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import conexoes.ConexaoMySQL;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * Utilizada para buscar dados de conhecimentos já importados.
 *
 * @author ferna
 */
public class Conhecimentos {

    private final conexoes.ConexaoMySQL cn = new ConexaoMySQL();
    private final DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
    private final DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    private String idEmpresa, idEmitente, numero, serie, data, status, placa, 
            valor, pedagio, chave, tipo, operacao, natureza, idTransportador, 
            nomeTransportador, origem, destino, peso, cod_rpa, tarifa, nro_rpa;

    private String sql;

    public boolean buscaConhecimento(String chave) {

        boolean resposta = false;

//        if (!"".equals(txt)) {
//            condicao = " AND numero LIKE '%" + txt + "%' "
//                    + " OR chave LIKE '%" + txt + "%' ";
//        } else {
//            condicao = " ";
//        }
        sql = "SELECT * FROM conhecimentos a "
                + "LEFT JOIN rpa_detalhe b ON (b.chave = a.chave) "
                + "LEFT JOIN rpa c ON (c.codigo = b.codigo) "
                + "WHERE a.chave = '" + chave + "' ;";

        if (cn.conecta()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {

                    numero = cn.rs.getString("numero");
                    serie = cn.rs.getString("serie");
                    origem = cn.rs.getString("mun_origem");
                    destino = cn.rs.getString("mun_destino");
                    idTransportador = cn.rs.getString("cod_transportador");
                    nomeTransportador = cn.rs.getString("nome_transportador");
                    placa = cn.rs.getString("placa");
                    status = cn.rs.getString("status_envio");
                    tipo = cn.rs.getString("tp_cte");
                    idEmpresa = cn.rs.getString("empresa");
                    idEmitente = cn.rs.getString("emitente");
                    operacao = cn.rs.getString("operacao");
                    natureza = cn.rs.getString("natureza");
                    data = dateIn.format(cn.rs.getDate("emissao"));
                    valor = df.format(cn.rs.getDouble("valor"));
                    this.chave = cn.rs.getString("chave");
                    peso = df.format(cn.rs.getDouble("peso"));
                    pedagio = df.format(cn.rs.getDouble("pedagio"));
                    nro_rpa = cn.rs.getString("c.numero");
                    tarifa = cn.rs.getString("tarifa");
                    cod_rpa = cn.rs.getString("codigo");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível consultar os conhecimentos.");
            } finally {
                cn.desconecta();
            }
        }

        if (getNumero() != null) {
            resposta = true;
        }

        return resposta;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public String getIdEmitente() {
        return idEmitente;
    }

    public String getNumero() {
        return numero;
    }

    public String getSerie() {
        return serie;
    }

    public String getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public String getPlaca() {
        return placa;
    }

    public String getValor() {
        return valor;
    }

    public String getPedagio() {
        return pedagio;
    }

    public String getChave() {
        return chave;
    }

    public String getTipo() {
        return tipo;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getNatureza() {
        return natureza;
    }

    public String getIdTransportador() {
        return idTransportador;
    }

    public String getNomeTransportador() {
        return nomeTransportador;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public String getPeso() {
        return peso;
    }

    public String getCod_rpa() {
        return cod_rpa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public String getNro_rpa() {
        return nro_rpa;
    }
    
    public static void main(String[] args) {
        Conhecimentos cte = new Conhecimentos();

        if (cte.buscaConhecimento("CTe42170415278561000205570000000065871635582514")) {

            System.out.println("Transportador do conhecimento é: " + cte.getNomeTransportador());
            System.out.println("Data de Emissão é: " + cte.getData());
            System.out.println("Valor do conhecimento é: " + cte.getValor());
            System.out.println("Valor da tarifa é: " + cte.getTarifa());
            
        } else {
            JOptionPane.showMessageDialog(null, "Não foram encontrados conhecimentos com esta chave.");
        }
    }
}
