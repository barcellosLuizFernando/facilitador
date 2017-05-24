
package wsTerceiros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosEspetaculoDesportivoInDetalhamentoMaoDeObra complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosEspetaculoDesportivoInDetalhamentoMaoDeObra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPFTrab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorDesconto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorRemuneracao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosEspetaculoDesportivoInDetalhamentoMaoDeObra", propOrder = {
    "cpfTrab",
    "nome",
    "sequencia",
    "tipOpe",
    "valorDesconto",
    "valorRemuneracao"
})
public class TerceirosEspetaculoDesportivoInDetalhamentoMaoDeObra {

    @XmlElementRef(name = "CPFTrab", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpfTrab;
    @XmlElementRef(name = "nome", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nome;
    @XmlElementRef(name = "sequencia", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sequencia;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "valorDesconto", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorDesconto;
    @XmlElementRef(name = "valorRemuneracao", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorRemuneracao;

    /**
     * Obtém o valor da propriedade cpfTrab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCPFTrab() {
        return cpfTrab;
    }

    /**
     * Define o valor da propriedade cpfTrab.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCPFTrab(JAXBElement<String> value) {
        this.cpfTrab = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNome(JAXBElement<String> value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade sequencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSequencia() {
        return sequencia;
    }

    /**
     * Define o valor da propriedade sequencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSequencia(JAXBElement<String> value) {
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
     * Obtém o valor da propriedade valorDesconto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorDesconto() {
        return valorDesconto;
    }

    /**
     * Define o valor da propriedade valorDesconto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorDesconto(JAXBElement<Double> value) {
        this.valorDesconto = value;
    }

    /**
     * Obtém o valor da propriedade valorRemuneracao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorRemuneracao() {
        return valorRemuneracao;
    }

    /**
     * Define o valor da propriedade valorRemuneracao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorRemuneracao(JAXBElement<Double> value) {
        this.valorRemuneracao = value;
    }

}
