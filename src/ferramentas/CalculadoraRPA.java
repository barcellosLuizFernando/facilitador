/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferramentas;


import cadastros.ConfigDefault;
import conexoes.ConexaoMySQL;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Fernando Dill Barcellos
 */
public class CalculadoraRPA {

    ConfigDefault cd = new ConfigDefault();
    ConexaoMySQL cn = new ConexaoMySQL();

    private Double global_faturamento;
    private Double global_inss;
    private Double global_irrf;
    private Double global_terceiros;

    private Double valor_bruto;
    private Double valor_liquido;
    private Double inss_bc;
    private Double irrf_bc;
    private Double inss;
    private Double irrf;
    private Double irrf_deducao;
    private Double terceiros;
    private Double inss_teto;
    private Double inss_aliq;
    private Double irrf_aliq;
    private Double terceiros_aliq;

    //private String classificacao;
    private String tipo_rpa;

    private Double acum_valor_bruto;
    private Double acum_inss;
    private Double acum_irrf;
    private Double acum_terceiros;

    
    /**
     * Este Método recebe os valores acumulados pagos a pessoa durante a 
     * 'COMPETÊNCIA', acrescenta o valor que está sendo calculado 'AGORA'
     * e atribui o resultado às variáveis da classe. Deve ser utilizado o metódo
     * 'GET' para recuperar os valores após o cálculo.
     * Implementa os métodos <code>{@link #defineVariaveisIRRF(java.lang.Double)}</code> 
     * para encontrar a alíquota e dedução correta do Imposto de Renda, e <code>
     * {@link #defineParametros(java.lang.String, java.lang.Double)}</code>
     * para encontrar o valor máximo de desconto do INSS.
     * 
     * @param valor_bruto Valor atual do RPA
     * @param acum_valor_bruto Valor bruto calculado dentro da competência
     * @param acum_inss Valor de INSS descontado dentro da competência
     * @param acum_irrf Valor de IRRF descontado dentro da competência
     * @param terceiros Valor de SEST/SENAT descontado dentro da competência
     * @param classificacao Indica se é Cooperado ou Não-Cooperado
     */
    public void calculaRPA(Double valor_bruto, Double acum_valor_bruto,
            Double acum_inss, Double acum_irrf, Double terceiros,
            String classificacao) {

        System.out.println("Definindo variáveis da 'Calculadora.'");
        System.out.println("Valor Bruto: " + valor_bruto);
        System.out.println("Valor Bruto Acumulado: " + acum_valor_bruto);
        System.out.println("INSS acumulado: " + acum_inss);
        System.out.println("IRRF acumulado: " + acum_irrf);
        System.out.println("Terceiros acumulado: " + terceiros);
        System.out.println("Classificação: " + classificacao);
        this.valor_bruto = valor_bruto;
        this.acum_valor_bruto = acum_valor_bruto;
        this.acum_inss = acum_inss;
        this.acum_irrf = acum_irrf;
        this.acum_terceiros = terceiros;

        //DEFINE FATURAMENTO TOTAL DO PERÍODO
        System.out.println("Realizando cálculo do Faturamento.");
        global_faturamento = this.valor_bruto + this.acum_valor_bruto;
        System.out.println("Faturamento global: " + global_faturamento);

        System.out.println("Buscando configurações 'Default'.");
        defineParametros(classificacao, global_faturamento);

        System.out.println("Realizando cálculo do INSS.");

        //CALCULA O INSS DO RPA
        global_inss = (global_faturamento * this.inss_bc) * this.inss_aliq;
        System.out.println("INSS global: " + global_inss + ". BC INSS: " + this.inss_bc + ". INSS Aliquota: " + this.inss_aliq);

        if (global_inss > inss_teto) {
            inss = inss_teto - this.acum_inss;
        } else {
            inss = global_inss - this.acum_inss;
        }
        System.out.println("INSS do RPA: " + inss);

        this.global_terceiros = (this.global_faturamento * this.inss_bc) * this.terceiros_aliq;
        System.out.println("Terceiros Global: " + this.global_terceiros + ". Alíquota Terceiros: " + this.terceiros_aliq);

        this.terceiros = global_terceiros - acum_terceiros;

        defineVariaveisIRRF((global_faturamento * irrf_bc) - this.acum_inss - inss);

        //CALCULA O IRRF, CONSIDERANDO AS DEDUÇÕES
        irrf = (((global_faturamento * irrf_bc) - this.acum_inss - inss) * irrf_aliq) - this.acum_irrf - this.irrf_deducao;
        System.out.println("Imposto de Renda: " + irrf);

        this.valor_liquido = this.valor_bruto - this.inss - this.irrf - this.terceiros;

    }

    /**
     * Método que define as bases de cálculo para a pessoa, buscando os valores
     * no arquivo 'DEFAULT.PROPERTIES'. Define também qual o teto máximo para o
     * desconto de INSS próprio.
     * @param categoria Informar se é Cooperado ou Terceiro
     * @param base_calculo Informar o valor bruto do RPA 'ATUAL'
     */
    
    private void defineParametros(String categoria, Double base_calculo) {

        cd.carregaProp();
        System.out.println("Arquivo de Parâmetros carregado. Categoria: " + categoria + ". Base de Cálculo: " + base_calculo);

        String sql;

        String inss_tab_local = cd.getInss_tab_local();

        //BUSCA VARIÁVEIS DO ARQUIVO PROPERTIES
        if ("Cooperado".equals(categoria)) {
            inss_bc = cd.getInss_bc_cooperado();
            irrf_bc = cd.getIrrf_bc_cooperado();
            terceiros_aliq = cd.getCoop_terceiros_aliq();
            inss_aliq = cd.getInss_aliq_cooperado();
            tipo_rpa = "Transporte";
        } else if ("Terceiro".equals(categoria)) {
            inss_bc = cd.getInss_bc_terceiro();
            irrf_bc = cd.getIrrf_bc_terceiro();
            terceiros_aliq = cd.getTerc_terceiros_aliq();
            inss_aliq = cd.getInss_aliq_terceiro();
            tipo_rpa = "Transporte";
        } else {
            inss_bc = 100.00;
            irrf_bc = 100.00;
            terceiros_aliq = 0.00;
            tipo_rpa = "Outros";
        }

        //BUSCA VARIÁVEIS DO BANCO MYSQL
        System.out.println("Buscando informações do INSS. Tabela local: " + inss_tab_local);
        switch (inss_tab_local) {
            case "S":
                if (cn.conecta()) {
                    try {
                        sql = "SELECT * FROM tab_inss "
                                + "WHERE valor = (SELECT MAX(valor) "
                                + "FROM tab_inss WHERE data < current_date());";
                        cn.executeConsulta(sql);
                        while (cn.rs.next()) {
                            inss_teto = cn.rs.getDouble("valor") * inss_aliq;
                        }
                        System.out.println("Teto do INSS: " + inss_teto);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível consultar as variáveis no Banco de Dados MySQL.");
                    } finally {
                        cn.desconecta();
                    }

                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Solicitar implementação do cálculo de variáveis por outros métodos.");
        }
    }

    
    /**
     * Busca a faixa de desconto do Imposto de Renda na Fonte. O valor informado
     * como parâmetro dever ser o Valor Bruto, descontado de INSS próprio. Não
     * considerar o SEST/SENAT como dedução.
     *
     * @param base_calculo Valor Bruto, menos INSS próprio
     */
    private void defineVariaveisIRRF(Double base_calculo) {

        String sql;

        String irrf_tab_local = cd.getIrrf_tab_local();

        switch (irrf_tab_local) {
            case "S":
                if (cn.conecta()) {
                    try {
                        sql = "SELECT * FROM tab_irrf "
                                + "WHERE valor = (SELECT valor from tab_irrf "
                                + "WHERE valor >= '" + base_calculo + "' "
                                + "AND data <= current_date() "
                                + "ORDER BY valor,data LIMIT 1)";

                        cn.executeConsulta(sql);

                        System.out.println("Definindo alíquotas");
                        while (cn.rs.next()) {
                            irrf_aliq = cn.rs.getDouble("taxa") / 100.00;
                            irrf_deducao = cn.rs.getDouble("desconto");
                        }
                        System.out.println("Base de Cálculo para o I.R.: " + base_calculo);
                        System.out.println("Alíquota do IRRF: " + irrf_aliq);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não foi possível definir as variáveis do Imposto de Renda.");
                    } finally {
                        cn.desconecta();
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Consulta à folha de pagamentos não foi configurada.");
                break;

        }
    }

    public String getTipo_rpa() {
        return tipo_rpa;
    }

    public Double getValor_liquido() {
        return valor_liquido;
    }

    public Double getInss() {
        return inss;
    }

    public Double getInss_bc() {
        return inss_bc;
    }

    public Double getIrrf_bc() {
        return irrf_bc;
    }

    public Double getInss_aliq() {
        return inss_aliq;
    }

    public Double getIrrf_aliq() {
        return irrf_aliq;
    }

    public Double getIrrf() {
        return irrf;
    }

    public Double getTerceiros() {
        return terceiros;
    }

    public static void main(String[] args) {

        System.out.println("Criando Objeto 'Calculadora RPA'");
        try {
            ferramentas.CalculadoraRPA rpa = new CalculadoraRPA();
            System.out.println("Calculando RPA com os dados informados");
            rpa.calculaRPA(1711.17, 33128.92, 1106.26, 0.00, 165.64, "Cooperado");
            System.out.println("Valor líquido: " + rpa.valor_liquido);

        } catch (Exception e) {
            System.out.println("Erro ao criar o objeto. Resposta: " + e);
        }

    }

}
