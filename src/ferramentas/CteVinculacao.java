/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

import cadastros.Conhecimentos;
import conexoes.ConexaoMySQL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import telaCadastros.TelaInicial;

/**
 *
 * @author ferna
 */
public class CteVinculacao {

    private String id, ca_numero, ca_serie, ca_chave, au_numero, au_serie,
            au_chave, cod_rpa, usu_inc, nro_rpa, talao, sql, tarifa, ca_peso,
            au_peso, au_data, au_valor, au_pedagio, idVinculo;
    private ConexaoMySQL cn = new ConexaoMySQL();
    private TelaInicial ti;
    private DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
    private DateFormat dateOut = new SimpleDateFormat("yyyy/MM/dd");

    public boolean vinculaCTe(String chave_ca, String chave_au, JFrame x) {
        boolean resposta = false;

        this.ti = (TelaInicial) x;
        //ti.usuariosys = 131;

        Conhecimentos cte_ca = new Conhecimentos();
        Conhecimentos cte_au = new Conhecimentos();

        //BUSCA DADOS DO CONHECIMENTO CANCELADO
        if (cte_ca.buscaConhecimento(chave_ca)) {
            ca_numero = cte_ca.getNumero();
            ca_serie = cte_ca.getSerie();
            ca_chave = cte_ca.getChave();
            cod_rpa = cte_ca.getCod_rpa();
            nro_rpa = cte_ca.getNro_rpa();
            talao = cte_ca.getIdEmitente();
            tarifa = cte_ca.getTarifa();
            ca_peso = cte_ca.getPeso();

            if (tarifa == null) {
                tarifa = "0,00";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os dados "
                    + "dos conhecimentos cancelados.");
        }

        System.out.println("Conhecimento cancelado: " + cte_ca.getNumero() + ", transportador " + cte_ca.getNomeTransportador() + ", RPA " + nro_rpa);
        //BUSCA DADOS DO CONHECIMENTO AUTORIZADO
        if (cte_au.buscaConhecimento(chave_au)) {
            au_numero = cte_au.getNumero();
            au_serie = cte_au.getSerie();
            au_chave = cte_au.getChave();
            au_peso = cte_au.getPeso();
            au_data = cte_au.getData();
            au_valor = cte_au.getValor();
            au_pedagio = cte_au.getPedagio();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível buscar os dados "
                    + "dos conhecimentos autorizados.");
        }
        System.out.println("Conhecimento autorizado: " + cte_au.getNumero() + ", transportador " + cte_au.getNomeTransportador());

//IDENTIFICA QUAL O USUÁRIO LOGADO
        usu_inc = ti.getUsuariosys() + "";

//VERIFICA SE O PESO DOS CONHECIMENTOS É DIFERENTE
        if (!ca_peso.equals(au_peso)) {
            JOptionPane.showMessageDialog(null, "Peso dos conhecimentos está diferente!"
                    + "\nConhecimento cancelado: " + ca_peso
                    + "\nConhecimento autorizado: " + au_peso + ".",
                    "Vinculação de conhecimentos", JOptionPane.WARNING_MESSAGE
            );
        }
        //SALVA INFORMAÇÕES NO BANCO DE DADOS
        try {
            au_data = dateOut.format(dateIn.parse(au_data));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível converter a data de emissão. \nErro: " + e);
        }

        if (!"".equals(ca_chave) && !"".equals(au_chave)) {
            sql = "INSERT INTO rpa_vinculacao (ca_numero,ca_serie,ca_chave,"
                    + "au_numero,au_serie,au_chave,rpa,usu_inc,data_inc) "
                    + "VALUES ('" + ca_numero + "','" + ca_serie + "',"
                    + "'" + ca_chave + "','" + au_numero + "','" + au_serie + "',"
                    + "'" + au_chave + "','" + cod_rpa + "','" + usu_inc + "',"
                    + "current_date());";

            if (cn.conecta()) {
                try {
                    if (cn.executeAtualizacao(sql)) {
                        System.out.println("cod_rpa: " + cod_rpa);
                        System.out.println("au_chave: " + au_chave);
                        System.out.println("au_numero: " + au_numero);
                        System.out.println("au_data: " + au_data);
                        System.out.println("au_valor: " + au_valor);
                        System.out.println("au_peso: " + au_peso);
                        System.out.println("tarifa: " + tarifa);
                        System.out.println("au_pedagio: " + au_pedagio);
                        sql = "INSERT INTO rpa_detalhe (codigo,chave,numero,"
                                + "data,valor,peso,tarifa,pedagio) "
                                + "VALUES ('" + cod_rpa + "','" + au_chave + "',"
                                + "'" + au_numero + "','" + au_data + "',"
                                + "'" + au_valor.replace(".", "").replace(",", ".") + "',"
                                + "'" + au_peso.replace(".", "").replace(",", ".") + "',"
                                + "'" + tarifa.replace(".", "").replace(",", ".") + "',"
                                + "'" + au_pedagio.replace(".", "").replace(",", ".") + "');";
                        if (cn.executeAtualizacao(sql)) {
                            resposta = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Conhecimento autorizado não foi vinculado ao RPA " + cod_rpa);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Conhecimento autorizado não foi \nvinculado ao conhecimento cancelado.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {
                    cn.desconecta();
                }
            }

        }

        return resposta;
    }

    public boolean desvinculaCTe(String chave_ca, String chave_au) {
        boolean resposta = false;

        sql = "SELECT * FROM rpa_vinculacao "
                + "WHERE ca_chave = '" + chave_ca + "' "
                + "AND au_chave = '" + chave_au + "' ;";

        if (cn.conecta()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    cod_rpa = cn.rs.getString("rpa");
                    idVinculo = cn.rs.getString("id");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                cn.desconecta();
            }
        }

        if (cod_rpa != null && idVinculo != null) {
            sql = "DELETE FROM rpa_vinculacao WHERE id = '" + idVinculo + "';";

            if (cn.conecta()) {
                try {
                    if (cn.executeAtualizacao(sql)) {
                        sql = "DELETE FROM rpa_detalhe WHERE chave = '" + chave_au + "';";
                        if (cn.executeAtualizacao(sql)) {
                            resposta = true;
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {
                    cn.desconecta();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível recuperar os dados para estorno.");
        }

        return resposta;
    }

    public static void main(String[] args) {
        CteVinculacao vin = new CteVinculacao();

        System.out.println("Resposta: "
                + vin.vinculaCTe("CTe42170415278561000205570000000065871635582514",
                        "CTe42170315278561000205570000000060911460964849", new TelaInicial()));
        vin.ti.dispose();
//        Conhecimentos cte = new Conhecimentos();
//
//        if (cte.buscaConhecimento("CTe41170115278561000124570000000319701261571120")) {
//
//            System.out.println("Transportador do conhecimento é: " + cte.getNomeTransportador());
//            System.out.println("Data de Emissão é: " + cte.getData());
//            System.out.println("Valor do conhecimento é: " + cte.getValor());
//        } else {
//            JOptionPane.showMessageDialog(null, "Não foram encontrados conhecimentos com esta chave.");
//        }

    }

}
