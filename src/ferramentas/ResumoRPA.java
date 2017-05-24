/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;

/**
 *
 * @author luiz.barcellos
 */
import conexoes.ConexaoMySQL;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class ResumoRPA {

    private ConexaoMySQL cn = new ConexaoMySQL();

    private DateFormat dateOut = new SimpleDateFormat("yyyy/MM/dd");
    private DateFormat mes = new SimpleDateFormat("MM");
    private DateFormat ano = new SimpleDateFormat("yyyy");

    DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    private String acumulado;
    private String inss;
    private String irrf;
    private String terceiros;
    private String fretes;
    private int qtdApos;

    public void calculaResumo(Date data, String transportador, String rpa) {

        String sql;

        System.out.println("Data informada: " + data);

        String mes = this.mes.format(data);
        String ano = this.ano.format(data);
        System.out.println("Mês formatado: " + mes + ". Ano: " + ano);

        if (cn.conecta()) {
            sql = "SELECT round(sum(a.vlr_bruto),2) as acumulado, "
                    + "round(sum(a.inss),2) as inss, round(sum(a.terceiros),2) as terceiros, "
                    + "round(sum(a.irrf),2) as irrf, (select count(b.codigo) "
                    + "from rpa_detalhe b where b.codigo = a.codigo) as fretes "
                    + "FROM rpa a "
                    + "WHERE month(a.emissao) = '" + mes + "' "
                    + "AND year(a.emissao) = '" + ano + "' "
                    + "AND a.transportador = " + transportador + " "
                    + "AND codigo != '" + rpa + "' "
                    + "AND emissao <= '" + dateOut.format(data) + "';";
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    acumulado = df.format(cn.rs.getDouble("acumulado"));
                    inss = df.format(cn.rs.getDouble("inss"));
                    irrf = df.format(cn.rs.getDouble("irrf"));
                    terceiros = df.format(cn.rs.getDouble("terceiros"));
                }
                cn.rs.close();

                sql = "SELECT count(b.codigo) as fretes FROM rpa_detalhe b "
                        + "LEFT JOIN rpa a on (a.codigo = b.codigo) "
                        + "WHERE month(a.emissao) = '" + mes + "' "
                        + "AND year(a.emissao) = '" + ano + "' "
                        + "AND a.transportador = " + transportador + " "
                        + "AND a.codigo != '" + rpa + "' "
                        + "AND a.emissao <= '" + dateOut.format(data) + "';";
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    fretes = cn.rs.getString("fretes");
                }
                
                
                sql = "SELECT COUNT(codigo) as qtd FROM rpa "
                        + "WHERE month(emissao) = '" + mes + "' "
                        + "AND year(emissao) = '" + ano + "' "
                        + "AND emissao >= '" + dateOut.format(data) + "' "
                        + "AND codigo != '" + rpa + "' "
                        + "AND transportador = '" + transportador + "'; ";
                cn.executeConsulta(sql);
                while(cn.rs.next()){
                    qtdApos = cn.rs.getInt("qtd");
                }
                cn.rs.close();

                if (acumulado == null) {
                    acumulado = "0,00";
                    inss = "0,00";
                    irrf = "0,00";
                    terceiros = "0,00";
                    fretes = "0";
                }

                System.out.println("Acumulado: " + acumulado);
                System.out.println("INSS: " + inss);
                System.out.println("IRRF: " + irrf);
                System.out.println("Terceiros: " + terceiros);
                System.out.println("Fretes: " + fretes);
                System.out.println("Quantidade após: " + qtdApos);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível consultar o resumo.");
            } finally {
                cn.desconecta();
            }
        }
    }

    public String getAcumulado() {
        return acumulado;
    }

    public String getInss() {
        return inss;
    }

    public String getIrrf() {
        return irrf;
    }

    public String getTerceiros() {
        return terceiros;
    }

    public String getFretes() {
        return fretes;
    }

    public int getQtdApos() {
        return qtdApos;
    }

    public static void main(String[] args) {
        ResumoRPA rRpa = new ResumoRPA();
        rRpa.calculaResumo(new Date("2017/04/13"), "605", "105");
        System.out.println("Acumulado calculado: " + rRpa.getAcumulado());
    }

}
