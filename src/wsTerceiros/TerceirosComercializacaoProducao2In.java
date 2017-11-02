
package wsTerceiros;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosComercializacaoProducao2In complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosComercializacaoProducao2In">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmpPrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indCom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="natDes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomCnp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numIns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateios" type="{http://services.senior.com.br}terceirosComercializacaoProducao2InRateios" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recBru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="seqPrd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipIns" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipPrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VGilEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VPreEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VSenEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosComercializacaoProducao2In", propOrder = {
    "cmpPrd",
    "codCcu",
    "codFil",
    "codPro",
    "flowInstanceID",
    "flowName",
    "indCom",
    "natDes",
    "nomCnp",
    "numEmp",
    "numIns",
    "numLoc",
    "rateios",
    "recBru",
    "seqPrd",
    "tipIns",
    "tipOpe",
    "tipPrd",
    "vGilEx",
    "vPreEx",
    "vSenEx",
    "valRet"
})
public class TerceirosComercializacaoProducao2In {

    @XmlElementRef(name = "cmpPrd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpPrd;
    @XmlElementRef(name = "codCcu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCcu;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFil;
    @XmlElementRef(name = "codPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPro;
    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElementRef(name = "indCom", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> indCom;
    @XmlElementRef(name = "natDes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> natDes;
    @XmlElementRef(name = "nomCnp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomCnp;
    @XmlElementRef(name = "numEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numEmp;
    @XmlElementRef(name = "numIns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numIns;
    @XmlElementRef(name = "numLoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numLoc;
    @XmlElement(nillable = true)
    protected List<TerceirosComercializacaoProducao2InRateios> rateios;
    @XmlElementRef(name = "recBru", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> recBru;
    @XmlElementRef(name = "seqPrd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> seqPrd;
    @XmlElementRef(name = "tipIns", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipIns;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "tipPrd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipPrd;
    @XmlElementRef(name = "VGilEx", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vGilEx;
    @XmlElementRef(name = "VPreEx", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vPreEx;
    @XmlElementRef(name = "VSenEx", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vSenEx;
    @XmlElementRef(name = "valRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valRet;

    /**
     * Obtém o valor da propriedade cmpPrd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpPrd() {
        return cmpPrd;
    }

    /**
     * Define o valor da propriedade cmpPrd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpPrd(JAXBElement<String> value) {
        this.cmpPrd = value;
    }

    /**
     * Obtém o valor da propriedade codCcu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCcu() {
        return codCcu;
    }

    /**
     * Define o valor da propriedade codCcu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCcu(JAXBElement<String> value) {
        this.codCcu = value;
    }

    /**
     * Obtém o valor da propriedade codFil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodFil() {
        return codFil;
    }

    /**
     * Define o valor da propriedade codFil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodFil(JAXBElement<Integer> value) {
        this.codFil = value;
    }

    /**
     * Obtém o valor da propriedade codPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodPro() {
        return codPro;
    }

    /**
     * Define o valor da propriedade codPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodPro(JAXBElement<String> value) {
        this.codPro = value;
    }

    /**
     * Obtém o valor da propriedade flowInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowInstanceID() {
        return flowInstanceID;
    }

    /**
     * Define o valor da propriedade flowInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowInstanceID(JAXBElement<String> value) {
        this.flowInstanceID = value;
    }

    /**
     * Obtém o valor da propriedade flowName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlowName() {
        return flowName;
    }

    /**
     * Define o valor da propriedade flowName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlowName(JAXBElement<String> value) {
        this.flowName = value;
    }

    /**
     * Obtém o valor da propriedade indCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIndCom() {
        return indCom;
    }

    /**
     * Define o valor da propriedade indCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIndCom(JAXBElement<Integer> value) {
        this.indCom = value;
    }

    /**
     * Obtém o valor da propriedade natDes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNatDes() {
        return natDes;
    }

    /**
     * Define o valor da propriedade natDes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNatDes(JAXBElement<Integer> value) {
        this.natDes = value;
    }

    /**
     * Obtém o valor da propriedade nomCnp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCnp() {
        return nomCnp;
    }

    /**
     * Define o valor da propriedade nomCnp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCnp(JAXBElement<String> value) {
        this.nomCnp = value;
    }

    /**
     * Obtém o valor da propriedade numEmp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumEmp() {
        return numEmp;
    }

    /**
     * Define o valor da propriedade numEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumEmp(JAXBElement<Integer> value) {
        this.numEmp = value;
    }

    /**
     * Obtém o valor da propriedade numIns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumIns() {
        return numIns;
    }

    /**
     * Define o valor da propriedade numIns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumIns(JAXBElement<String> value) {
        this.numIns = value;
    }

    /**
     * Obtém o valor da propriedade numLoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumLoc() {
        return numLoc;
    }

    /**
     * Define o valor da propriedade numLoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumLoc(JAXBElement<String> value) {
        this.numLoc = value;
    }

    /**
     * Gets the value of the rateios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosComercializacaoProducao2InRateios }
     * 
     * 
     */
    public List<TerceirosComercializacaoProducao2InRateios> getRateios() {
        if (rateios == null) {
            rateios = new ArrayList<TerceirosComercializacaoProducao2InRateios>();
        }
        return this.rateios;
    }

    /**
     * Obtém o valor da propriedade recBru.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRecBru() {
        return recBru;
    }

    /**
     * Define o valor da propriedade recBru.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRecBru(JAXBElement<Double> value) {
        this.recBru = value;
    }

    /**
     * Obtém o valor da propriedade seqPrd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSeqPrd() {
        return seqPrd;
    }

    /**
     * Define o valor da propriedade seqPrd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSeqPrd(JAXBElement<Integer> value) {
        this.seqPrd = value;
    }

    /**
     * Obtém o valor da propriedade tipIns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipIns() {
        return tipIns;
    }

    /**
     * Define o valor da propriedade tipIns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipIns(JAXBElement<Integer> value) {
        this.tipIns = value;
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
     * Obtém o valor da propriedade tipPrd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipPrd() {
        return tipPrd;
    }

    /**
     * Define o valor da propriedade tipPrd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipPrd(JAXBElement<String> value) {
        this.tipPrd = value;
    }

    /**
     * Obtém o valor da propriedade vGilEx.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVGilEx() {
        return vGilEx;
    }

    /**
     * Define o valor da propriedade vGilEx.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVGilEx(JAXBElement<Double> value) {
        this.vGilEx = value;
    }

    /**
     * Obtém o valor da propriedade vPreEx.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVPreEx() {
        return vPreEx;
    }

    /**
     * Define o valor da propriedade vPreEx.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVPreEx(JAXBElement<Double> value) {
        this.vPreEx = value;
    }

    /**
     * Obtém o valor da propriedade vSenEx.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVSenEx() {
        return vSenEx;
    }

    /**
     * Define o valor da propriedade vSenEx.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVSenEx(JAXBElement<Double> value) {
        this.vSenEx = value;
    }

    /**
     * Obtém o valor da propriedade valRet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValRet() {
        return valRet;
    }

    /**
     * Define o valor da propriedade valRet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValRet(JAXBElement<Double> value) {
        this.valRet = value;
    }

}