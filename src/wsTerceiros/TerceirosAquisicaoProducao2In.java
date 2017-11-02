
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
 * <p>Classe Java de terceirosAquisicaoProducao2In complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosAquisicaoProducao2In">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmpPrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datEmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indAqu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="natDes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomCnp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numIns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numNot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateios" type="{http://services.senior.com.br}terceirosAquisicaoProducao2InRateios" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recBru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="seqPrd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serNot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VFinPr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VPrePr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VSenPr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valFin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valPre" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valSEN" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosAquisicaoProducao2In", propOrder = {
    "cmpPrd",
    "codCcu",
    "codFil",
    "codPro",
    "datEmi",
    "flowInstanceID",
    "flowName",
    "indAqu",
    "natDes",
    "nomCnp",
    "numEmp",
    "numIns",
    "numLoc",
    "numNot",
    "rateios",
    "recBru",
    "seqPrd",
    "serNot",
    "tipOpe",
    "vFinPr",
    "vPrePr",
    "vSenPr",
    "valFin",
    "valPre",
    "valSEN"
})
public class TerceirosAquisicaoProducao2In {

    @XmlElementRef(name = "cmpPrd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpPrd;
    @XmlElementRef(name = "codCcu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCcu;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFil;
    @XmlElementRef(name = "codPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codPro;
    @XmlElementRef(name = "datEmi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datEmi;
    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElementRef(name = "indAqu", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> indAqu;
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
    @XmlElementRef(name = "numNot", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numNot;
    @XmlElement(nillable = true)
    protected List<TerceirosAquisicaoProducao2InRateios> rateios;
    @XmlElementRef(name = "recBru", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> recBru;
    @XmlElementRef(name = "seqPrd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> seqPrd;
    @XmlElementRef(name = "serNot", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serNot;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "VFinPr", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vFinPr;
    @XmlElementRef(name = "VPrePr", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vPrePr;
    @XmlElementRef(name = "VSenPr", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vSenPr;
    @XmlElementRef(name = "valFin", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valFin;
    @XmlElementRef(name = "valPre", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valPre;
    @XmlElementRef(name = "valSEN", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valSEN;

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
     * Obtém o valor da propriedade datEmi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatEmi() {
        return datEmi;
    }

    /**
     * Define o valor da propriedade datEmi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatEmi(JAXBElement<String> value) {
        this.datEmi = value;
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
     * Obtém o valor da propriedade indAqu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIndAqu() {
        return indAqu;
    }

    /**
     * Define o valor da propriedade indAqu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIndAqu(JAXBElement<Integer> value) {
        this.indAqu = value;
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
     * Obtém o valor da propriedade numNot.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumNot() {
        return numNot;
    }

    /**
     * Define o valor da propriedade numNot.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumNot(JAXBElement<String> value) {
        this.numNot = value;
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
     * {@link TerceirosAquisicaoProducao2InRateios }
     * 
     * 
     */
    public List<TerceirosAquisicaoProducao2InRateios> getRateios() {
        if (rateios == null) {
            rateios = new ArrayList<TerceirosAquisicaoProducao2InRateios>();
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
     * Obtém o valor da propriedade serNot.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerNot() {
        return serNot;
    }

    /**
     * Define o valor da propriedade serNot.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerNot(JAXBElement<String> value) {
        this.serNot = value;
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
     * Obtém o valor da propriedade vFinPr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVFinPr() {
        return vFinPr;
    }

    /**
     * Define o valor da propriedade vFinPr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVFinPr(JAXBElement<Double> value) {
        this.vFinPr = value;
    }

    /**
     * Obtém o valor da propriedade vPrePr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVPrePr() {
        return vPrePr;
    }

    /**
     * Define o valor da propriedade vPrePr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVPrePr(JAXBElement<Double> value) {
        this.vPrePr = value;
    }

    /**
     * Obtém o valor da propriedade vSenPr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVSenPr() {
        return vSenPr;
    }

    /**
     * Define o valor da propriedade vSenPr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVSenPr(JAXBElement<Double> value) {
        this.vSenPr = value;
    }

    /**
     * Obtém o valor da propriedade valFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValFin() {
        return valFin;
    }

    /**
     * Define o valor da propriedade valFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValFin(JAXBElement<Double> value) {
        this.valFin = value;
    }

    /**
     * Obtém o valor da propriedade valPre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValPre() {
        return valPre;
    }

    /**
     * Define o valor da propriedade valPre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValPre(JAXBElement<Double> value) {
        this.valPre = value;
    }

    /**
     * Obtém o valor da propriedade valSEN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValSEN() {
        return valSEN;
    }

    /**
     * Define o valor da propriedade valSEN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValSEN(JAXBElement<Double> value) {
        this.valSEN = value;
    }

}
