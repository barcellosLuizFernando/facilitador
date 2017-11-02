
package testews;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosEspetaculoDesportivoInIngressos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosEspetaculoDesportivoInIngressos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CNPJRespIngressos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomedoResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroInscricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numerodeIngressos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sequencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosEspetaculoDesportivoInIngressos", propOrder = {
    "cnpjRespIngressos",
    "nomedoResponsavel",
    "numeroInscricao",
    "numerodeIngressos",
    "sequencia",
    "tipOpe"
})
public class TerceirosEspetaculoDesportivoInIngressos {

    @XmlElementRef(name = "CNPJRespIngressos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjRespIngressos;
    @XmlElementRef(name = "nomedoResponsavel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomedoResponsavel;
    @XmlElementRef(name = "numeroInscricao", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroInscricao;
    @XmlElementRef(name = "numerodeIngressos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numerodeIngressos;
    @XmlElementRef(name = "sequencia", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sequencia;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;

    /**
     * Obtém o valor da propriedade cnpjRespIngressos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNPJRespIngressos() {
        return cnpjRespIngressos;
    }

    /**
     * Define o valor da propriedade cnpjRespIngressos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNPJRespIngressos(JAXBElement<String> value) {
        this.cnpjRespIngressos = value;
    }

    /**
     * Obtém o valor da propriedade nomedoResponsavel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomedoResponsavel() {
        return nomedoResponsavel;
    }

    /**
     * Define o valor da propriedade nomedoResponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomedoResponsavel(JAXBElement<String> value) {
        this.nomedoResponsavel = value;
    }

    /**
     * Obtém o valor da propriedade numeroInscricao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroInscricao() {
        return numeroInscricao;
    }

    /**
     * Define o valor da propriedade numeroInscricao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroInscricao(JAXBElement<String> value) {
        this.numeroInscricao = value;
    }

    /**
     * Obtém o valor da propriedade numerodeIngressos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumerodeIngressos() {
        return numerodeIngressos;
    }

    /**
     * Define o valor da propriedade numerodeIngressos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumerodeIngressos(JAXBElement<Integer> value) {
        this.numerodeIngressos = value;
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

}
