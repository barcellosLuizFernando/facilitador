/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class ConfigDefault {

    private Properties props = new Properties();

    private Double inss_aliq_cooperado;
    private Double inss_aliq_patronal_cooperado;
    private Double inss_aliq_patronal_terceiro;
    private Double inss_aliq_terceiro;
    private Double inss_bc_cooperado;
    private Double inss_bc_terceiro;
    private String inss_tab_local;
    private String irrf_tab_local;
    private Double irrf_bc_cooperado;
    private Double irrf_bc_terceiro;
    private String lanca_fin;
    private String lanca_folha;
    private String margem_variavel;
    private Double margem_cooperado;
    private Double margem_terceiro;
    private Double coop_terceiros_aliq;
    private Double terc_terceiros_aliq;
    private String ult_user;
    private Timestamp ultima_sincronizacao;
    private String cta_cooperado;
    private String cta_terceiro;
    private String cta_outras_despesas;
    private String cta_inss;
    private String cta_irrf;
    private String ult_integ_fin;
    private String considera_pedagio;

    public void carregaProp() {
        try {
            System.out.println("Abrindo arquivo Properties.");
            FileInputStream file = new FileInputStream(
                    "./src/properties/default.properties");
            props.load(file);

            System.out.println("Arquivo properties iniciado. Carregando variáveis...");

            inss_aliq_cooperado = Double.parseDouble(props.getProperty("inss_aliq_cooperado"));
            inss_aliq_terceiro = Double.parseDouble(props.getProperty("inss_aliq_terceiro"));
            inss_bc_cooperado = Double.parseDouble(props.getProperty("inss_bc_cooperado"));
            inss_bc_terceiro = Double.parseDouble(props.getProperty("inss_bc_terceiro"));
            inss_tab_local = props.getProperty("inss_tab_local");
            irrf_tab_local = props.getProperty("irrf_tab_local");
            irrf_bc_cooperado = Double.parseDouble(props.getProperty("irrf_bc_cooperado"));
            irrf_bc_terceiro = Double.parseDouble(props.getProperty("irrf_bc_terceiro"));
            lanca_fin = props.getProperty("lanca_fin");
            lanca_folha = props.getProperty("lanca_folha");
            margem_cooperado = Double.parseDouble(props.getProperty("margem_cooperado"));
            margem_terceiro = Double.parseDouble(props.getProperty("margem_terceiro"));
            ult_user = props.getProperty("ult_user");
            ultima_sincronizacao = Timestamp.valueOf(props.getProperty("ultima_sincronizacao"));
            coop_terceiros_aliq = Double.parseDouble(props.getProperty("coop_terceiros_aliq"));
            terc_terceiros_aliq = Double.parseDouble(props.getProperty("terc_terceiros_aliq"));
            cta_cooperado = props.getProperty("cta_cooperado");
            cta_terceiro = props.getProperty("cta_terceiro");
            cta_outras_despesas = props.getProperty("cta_outras_despesas");
            cta_inss = props.getProperty("cta_inss");
            cta_irrf = props.getProperty("cta_irrf");
            margem_variavel = props.getProperty("margem_variavel");
            ult_integ_fin = props.getProperty("ult_integ_fin");
            inss_aliq_patronal_cooperado = Double.parseDouble(props.getProperty("inss_aliq_patronal_cooperado"));
            inss_aliq_patronal_terceiro = Double.parseDouble(props.getProperty("inss_aliq_patronal_terceiro"));
            considera_pedagio = props.getProperty("considera_pedagio");
            System.out.println("Variáveis carregadas.");

            file.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Default - Não foi possível ler o arquivo de configurações: " + ex);
        } finally {
        }
    }

    public boolean salvaProp() {
        boolean resposta = true;

        System.out.println("Salvando arquivo properties.");

        props.setProperty("inss_aliq_cooperado", inss_aliq_cooperado + "");
        props.setProperty("inss_aliq_terceiro", inss_aliq_terceiro + "");
        props.setProperty("inss_bc_cooperado", inss_bc_cooperado + "");
        props.setProperty("inss_bc_terceiro", inss_bc_terceiro + "");
        props.setProperty("inss_bc_terceiro", inss_bc_terceiro + "");
        props.setProperty("irrf_bc_cooperado", irrf_bc_cooperado + "");
        props.setProperty("irrf_bc_terceiro", irrf_bc_terceiro + "");
        props.setProperty("lanca_fin", lanca_fin);
        props.setProperty("lanca_folha", lanca_folha);
        props.setProperty("margem_cooperado", margem_cooperado + "");
        props.setProperty("margem_terceiro", margem_terceiro + "");
        props.setProperty("ult_user", ult_user);
        props.setProperty("ultima_sincronizacao", ultima_sincronizacao + "");
        props.setProperty("coop_terceiros_aliq", coop_terceiros_aliq + "");
        props.setProperty("terc_terceiros_aliq", terc_terceiros_aliq + "");
        props.setProperty("cta_cooperado", cta_cooperado);
        props.setProperty("cta_terceiro", cta_terceiro);
        props.setProperty("cta_inss", cta_inss);
        props.setProperty("cta_irrf", cta_irrf);
        props.setProperty("cta_outras_despesas", cta_outras_despesas);
        props.setProperty("margem_variavel", margem_variavel);
        props.setProperty("inss_aliq_patronal_cooperado", inss_aliq_patronal_cooperado + "");
        props.setProperty("inss_aliq_patronal_terceiro", inss_aliq_patronal_terceiro + "");
        props.setProperty("inss_tab_local", inss_tab_local);
        props.setProperty("irrf_tab_local", irrf_tab_local);
        props.setProperty("ult_integ_fin", ult_integ_fin);
        props.setProperty("considera_pedagio", considera_pedagio);

        try {
            FileOutputStream out = new FileOutputStream(
                    "./src/properties/default.properties");

            props.store(out, "");
            out.close();
        } catch (Exception e) {
            resposta = false;

            JOptionPane.showMessageDialog(null, "Não foi possível salvar o arquivo de propriedades.");
        }

        return resposta;
    }

    public String getIrrf_tab_local() {
        return irrf_tab_local;
    }

    public String getConsidera_pedagio() {
        return considera_pedagio;
    }

    public void setConsidera_pedagio(String considera_pedagio) {
        this.considera_pedagio = considera_pedagio;
    }

    public String getUlt_integ_fin() {
        return ult_integ_fin;
    }

    public void setUlt_integ_fin(String ult_integ_fin) {
        this.ult_integ_fin = ult_integ_fin;
    }

    public void setIrrf_tab_local(String irrf_tab_local) {
        this.irrf_tab_local = irrf_tab_local;
    }

    public Double getInss_aliq_cooperado() {
        return inss_aliq_cooperado;
    }

    public String getCta_inss() {
        return cta_inss;
    }

    public void setCta_inss(String cta_inss) {
        this.cta_inss = cta_inss;
    }

    public String getCta_irrf() {
        return cta_irrf;
    }

    public void setCta_irrf(String cta_irrf) {
        this.cta_irrf = cta_irrf;
    }

    public void setInss_aliq_cooperado(Double inss_aliq_cooperado) {
        this.inss_aliq_cooperado = inss_aliq_cooperado;
    }

    public Double getInss_aliq_patronal_cooperado() {
        return inss_aliq_patronal_cooperado;
    }

    public void setInss_aliq_patronal_cooperado(Double inss_aliq_patronal_cooperado) {
        this.inss_aliq_patronal_cooperado = inss_aliq_patronal_cooperado;
    }

    public Double getInss_aliq_patronal_terceiro() {
        return inss_aliq_patronal_terceiro;
    }

    public void setInss_aliq_patronal_terceiro(Double inss_aliq_patronal_terceiro) {
        this.inss_aliq_patronal_terceiro = inss_aliq_patronal_terceiro;
    }

    public Double getInss_aliq_terceiro() {
        return inss_aliq_terceiro;
    }

    public void setInss_aliq_terceiro(Double inss_aliq_terceiro) {
        this.inss_aliq_terceiro = inss_aliq_terceiro;
    }

    public Double getInss_bc_cooperado() {
        return inss_bc_cooperado;
    }

    public void setInss_bc_cooperado(Double inss_bc_cooperado) {
        this.inss_bc_cooperado = inss_bc_cooperado;
    }

    public Double getInss_bc_terceiro() {
        return inss_bc_terceiro;
    }

    public void setInss_bc_terceiro(Double inss_bc_terceiro) {
        this.inss_bc_terceiro = inss_bc_terceiro;
    }

    public String getInss_tab_local() {
        return inss_tab_local;
    }

    public void setInss_tab_local(String inss_tab_local) {
        this.inss_tab_local = inss_tab_local;
    }

    public Double getIrrf_bc_cooperado() {
        return irrf_bc_cooperado;
    }

    public void setIrrf_bc_cooperado(Double irrf_bc_cooperado) {
        this.irrf_bc_cooperado = irrf_bc_cooperado;
    }

    public Double getIrrf_bc_terceiro() {
        return irrf_bc_terceiro;
    }

    public void setIrrf_bc_terceiro(Double irrf_bc_terceiro) {
        this.irrf_bc_terceiro = irrf_bc_terceiro;
    }

    public String getLanca_fin() {
        return lanca_fin;
    }

    public void setLanca_fin(String lanca_fin) {
        this.lanca_fin = lanca_fin;
    }

    public String getLanca_folha() {
        return lanca_folha;
    }

    public void setLanca_folha(String lanca_folha) {
        this.lanca_folha = lanca_folha;
    }

    public String getMargem_variavel() {
        return margem_variavel;
    }

    public void setMargem_variavel(String margem_variavel) {
        this.margem_variavel = margem_variavel;
    }

    public Double getMargem_cooperado() {
        return margem_cooperado;
    }

    public void setMargem_cooperado(Double margem_cooperado) {
        this.margem_cooperado = margem_cooperado;
    }

    public Double getMargem_terceiro() {
        return margem_terceiro;
    }

    public void setMargem_terceiro(Double margem_terceiro) {
        this.margem_terceiro = margem_terceiro;
    }

    public Double getCoop_terceiros_aliq() {
        return coop_terceiros_aliq;
    }

    public void setCoop_terceiros_aliq(Double coop_terceiros_aliq) {
        this.coop_terceiros_aliq = coop_terceiros_aliq;
    }

    public Double getTerc_terceiros_aliq() {
        return terc_terceiros_aliq;
    }

    public void setTerc_terceiros_aliq(Double terc_terceiros_aliq) {
        this.terc_terceiros_aliq = terc_terceiros_aliq;
    }

    public String getUlt_user() {
        return ult_user;
    }

    public void setUlt_user(String ult_user) {
        this.ult_user = ult_user;
    }

    public Timestamp getUltima_sincronizacao() {
        return ultima_sincronizacao;
    }

    public void setUltima_sincronizacao(Timestamp ultima_sincronizacao) {
        this.ultima_sincronizacao = ultima_sincronizacao;
    }

    public String getCta_cooperado() {
        return cta_cooperado;
    }

    public void setCta_cooperado(String cta_cooperado) {
        this.cta_cooperado = cta_cooperado;
    }

    public String getCta_terceiro() {
        return cta_terceiro;
    }

    public void setCta_terceiro(String cta_terceiro) {
        this.cta_terceiro = cta_terceiro;
    }

    public String getCta_outras_despesas() {
        return cta_outras_despesas;
    }

    public void setCta_outras_despesas(String cta_outras_despesas) {
        this.cta_outras_despesas = cta_outras_despesas;
    }

    public static void main(String[] args) {
        ConfigDefault cd = new ConfigDefault();

        cd.carregaProp();

        System.out.println("Margem Cooperado: " + cd.getMargem_cooperado());
        System.out.println("Margem Terceiro: " + cd.getMargem_terceiro());

    }

}
