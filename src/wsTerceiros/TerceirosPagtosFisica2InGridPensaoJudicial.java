
package wsTerceiros;

import wsTerceiros.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosPagtosFisica2InGridPensaoJudicial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosPagtosFisica2InGridPensaoJudicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cpfDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datNas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomDep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqPla" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlrPag" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosPagtosFisica2InGridPensaoJudicial", propOrder = {
    "codDep",
    "cpfDep",
    "datNas",
    "nomDep",
    "seqPla",
    "tipOpe",
    "vlrPag"
})
public class TerceirosPagtosFisica2InGridPensaoJudicial {

    @XmlElementRef(name = "codDep", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codDep;
    @XmlElementRef(name = "cpfDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpfDep;
    @XmlElementRef(name = "datNas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datNas;
    @XmlElementRef(name = "nomDep", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomDep;
    @XmlElementRef(name = "seqPla", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> seqPla;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "vlrPag", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrPag;

    /**
     * Obtém o valor da propriedade codDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodDep() {
        return codDep;
    }

    /**
     * Define o valor da propriedade codDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodDep(JAXBElement<Integer> value) {
        this.codDep = value;
    }

    /**
     * Obtém o valor da propriedade cpfDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpfDep() {
        return cpfDep;
    }

    /**
     * Define o valor da propriedade cpfDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpfDep(JAXBElement<String> value) {
        this.cpfDep = value;
    }

    /**
     * Obtém o valor da propriedade datNas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatNas() {
        return datNas;
    }

    /**
     * Define o valor da propriedade datNas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatNas(JAXBElement<String> value) {
        this.datNas = value;
    }

    /**
     * Obtém o valor da propriedade nomDep.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomDep() {
        return nomDep;
    }

    /**
     * Define o valor da propriedade nomDep.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomDep(JAXBElement<String> value) {
        this.nomDep = value;
    }

    /**
     * Obtém o valor da propriedade seqPla.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSeqPla() {
        return seqPla;
    }

    /**
     * Define o valor da propriedade seqPla.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSeqPla(JAXBElement<Integer> value) {
        this.seqPla = value;
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
     * Obtém o valor da propriedade vlrPag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrPag() {
        return vlrPag;
    }

    /**
     * Define o valor da propriedade vlrPag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrPag(JAXBElement<Double> value) {
        this.vlrPag = value;
    }

}
