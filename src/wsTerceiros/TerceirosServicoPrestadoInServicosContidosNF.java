
package wsTerceiros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosServicoPrestadoInServicosContidosNF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosServicoPrestadoInServicosContidosNF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numIte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipSrv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valBru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosServicoPrestadoInServicosContidosNF", propOrder = {
    "basRet",
    "numIte",
    "tipOpe",
    "tipSrv",
    "valBru"
})
public class TerceirosServicoPrestadoInServicosContidosNF {

    @XmlElementRef(name = "basRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basRet;
    @XmlElementRef(name = "numIte", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numIte;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "tipSrv", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipSrv;
    @XmlElementRef(name = "valBru", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valBru;

    /**
     * Obtém o valor da propriedade basRet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasRet() {
        return basRet;
    }

    /**
     * Define o valor da propriedade basRet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasRet(JAXBElement<Double> value) {
        this.basRet = value;
    }

    /**
     * Obtém o valor da propriedade numIte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumIte() {
        return numIte;
    }

    /**
     * Define o valor da propriedade numIte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumIte(JAXBElement<Integer> value) {
        this.numIte = value;
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
     * Obtém o valor da propriedade tipSrv.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipSrv() {
        return tipSrv;
    }

    /**
     * Define o valor da propriedade tipSrv.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipSrv(JAXBElement<Integer> value) {
        this.tipSrv = value;
    }

    /**
     * Obtém o valor da propriedade valBru.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValBru() {
        return valBru;
    }

    /**
     * Define o valor da propriedade valBru.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValBru(JAXBElement<Double> value) {
        this.valBru = value;
    }

}
