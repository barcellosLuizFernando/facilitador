
package wsTerceiros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosEspetaculoDesportivoInReceitaIngressos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosEspetaculoDesportivoInReceitaIngressos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ingressosDevolvidos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ingressosVenda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ingressosVendidos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="precoIndividual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sequencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipodeIngresso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipodePreco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valorArrecadado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosEspetaculoDesportivoInReceitaIngressos", propOrder = {
    "ingressosDevolvidos",
    "ingressosVenda",
    "ingressosVendidos",
    "precoIndividual",
    "sequencia",
    "tipOpe",
    "tipodeIngresso",
    "tipodePreco",
    "valorArrecadado"
})
public class TerceirosEspetaculoDesportivoInReceitaIngressos {

    @XmlElementRef(name = "ingressosDevolvidos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ingressosDevolvidos;
    @XmlElementRef(name = "ingressosVenda", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ingressosVenda;
    @XmlElementRef(name = "ingressosVendidos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ingressosVendidos;
    @XmlElementRef(name = "precoIndividual", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> precoIndividual;
    @XmlElementRef(name = "sequencia", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sequencia;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "tipodeIngresso", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipodeIngresso;
    @XmlElementRef(name = "tipodePreco", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipodePreco;
    @XmlElementRef(name = "valorArrecadado", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorArrecadado;

    /**
     * Obtém o valor da propriedade ingressosDevolvidos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIngressosDevolvidos() {
        return ingressosDevolvidos;
    }

    /**
     * Define o valor da propriedade ingressosDevolvidos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIngressosDevolvidos(JAXBElement<Integer> value) {
        this.ingressosDevolvidos = value;
    }

    /**
     * Obtém o valor da propriedade ingressosVenda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIngressosVenda() {
        return ingressosVenda;
    }

    /**
     * Define o valor da propriedade ingressosVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIngressosVenda(JAXBElement<Integer> value) {
        this.ingressosVenda = value;
    }

    /**
     * Obtém o valor da propriedade ingressosVendidos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIngressosVendidos() {
        return ingressosVendidos;
    }

    /**
     * Define o valor da propriedade ingressosVendidos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIngressosVendidos(JAXBElement<Integer> value) {
        this.ingressosVendidos = value;
    }

    /**
     * Obtém o valor da propriedade precoIndividual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPrecoIndividual() {
        return precoIndividual;
    }

    /**
     * Define o valor da propriedade precoIndividual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPrecoIndividual(JAXBElement<Double> value) {
        this.precoIndividual = value;
    }

    /**
     * Obtém o valor da propriedade sequencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSequencia() {
        return sequencia;
    }

    /**
     * Define o valor da propriedade sequencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSequencia(JAXBElement<Integer> value) {
        this.sequencia = value;
    }

    /**
     * Obtém o valor da propriedade tipOpe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipOpe() {
        return tipOpe;
    }

    /**
     * Define o valor da propriedade tipOpe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipOpe(JAXBElement<String> value) {
        this.tipOpe = value;
    }

    /**
     * Obtém o valor da propriedade tipodeIngresso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipodeIngresso() {
        return tipodeIngresso;
    }

    /**
     * Define o valor da propriedade tipodeIngresso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipodeIngresso(JAXBElement<Integer> value) {
        this.tipodeIngresso = value;
    }

    /**
     * Obtém o valor da propriedade tipodePreco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipodePreco() {
        return tipodePreco;
    }

    /**
     * Define o valor da propriedade tipodePreco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipodePreco(JAXBElement<Integer> value) {
        this.tipodePreco = value;
    }

    /**
     * Obtém o valor da propriedade valorArrecadado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorArrecadado() {
        return valorArrecadado;
    }

    /**
     * Define o valor da propriedade valorArrecadado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorArrecadado(JAXBElement<Double> value) {
        this.valorArrecadado = value;
    }

}
