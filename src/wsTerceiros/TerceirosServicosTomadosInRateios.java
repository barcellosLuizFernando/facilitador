
package wsTerceiros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosServicosTomadosInRateios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosServicosTomadosInRateios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="perRateio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "terceirosServicosTomadosInRateios", propOrder = {
    "perRateio",
    "rateio",
    "tipOpe"
})
public class TerceirosServicosTomadosInRateios {

    @XmlElementRef(name = "perRateio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perRateio;
    @XmlElementRef(name = "rateio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rateio;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;

    /**
     * Obtém o valor da propriedade perRateio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerRateio() {
        return perRateio;
    }

    /**
     * Define o valor da propriedade perRateio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerRateio(JAXBElement<String> value) {
        this.perRateio = value;
    }

    /**
     * Obtém o valor da propriedade rateio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRateio() {
        return rateio;
    }

    /**
     * Define o valor da propriedade rateio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRateio(JAXBElement<String> value) {
        this.rateio = value;
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
