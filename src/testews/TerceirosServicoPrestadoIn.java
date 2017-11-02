
package testews;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosServicoPrestadoIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosServicoPrestadoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bas15a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bas20a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bas25a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cmpRcb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjSu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datRcb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCNO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ret11p" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="retSub" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="seqRcb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serObr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serPre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="servicosContidosNF" type="{http://services.senior.com.br}terceirosServicoPrestadoInServicosContidosNF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valBru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valDed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valMat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valNRe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valRcb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valSer" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosServicoPrestadoIn", propOrder = {
    "bas15A",
    "bas20A",
    "bas25A",
    "cmpRcb",
    "cnpjSu",
    "codFil",
    "codRat",
    "datPag",
    "datRcb",
    "flowInstanceID",
    "flowName",
    "insPro",
    "notFis",
    "numCNO",
    "numEmp",
    "numPro",
    "ret11P",
    "retSub",
    "seqRcb",
    "serFis",
    "serObr",
    "serPre",
    "servicosContidosNF",
    "tipOpe",
    "tipPro",
    "valBru",
    "valDed",
    "valMat",
    "valNRe",
    "valRcb",
    "valSer"
})
public class TerceirosServicoPrestadoIn {

    @XmlElementRef(name = "bas15a", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bas15A;
    @XmlElementRef(name = "bas20a", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bas20A;
    @XmlElementRef(name = "bas25a", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bas25A;
    @XmlElementRef(name = "cmpRcb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpRcb;
    @XmlElementRef(name = "cnpjSu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjSu;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFil;
    @XmlElementRef(name = "codRat", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codRat;
    @XmlElementRef(name = "datPag", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datPag;
    @XmlElementRef(name = "datRcb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datRcb;
    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElementRef(name = "insPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insPro;
    @XmlElementRef(name = "notFis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notFis;
    @XmlElementRef(name = "numCNO", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> numCNO;
    @XmlElementRef(name = "numEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numEmp;
    @XmlElementRef(name = "numPro", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numPro;
    @XmlElementRef(name = "ret11p", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ret11P;
    @XmlElementRef(name = "retSub", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> retSub;
    @XmlElementRef(name = "seqRcb", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> seqRcb;
    @XmlElementRef(name = "serFis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serFis;
    @XmlElementRef(name = "serObr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serObr;
    @XmlElementRef(name = "serPre", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serPre;
    @XmlElement(nillable = true)
    protected List<TerceirosServicoPrestadoInServicosContidosNF> servicosContidosNF;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "tipPro", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipPro;
    @XmlElementRef(name = "valBru", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valBru;
    @XmlElementRef(name = "valDed", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valDed;
    @XmlElementRef(name = "valMat", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valMat;
    @XmlElementRef(name = "valNRe", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valNRe;
    @XmlElementRef(name = "valRcb", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valRcb;
    @XmlElementRef(name = "valSer", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valSer;

    /**
     * Obtém o valor da propriedade bas15A.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBas15A() {
        return bas15A;
    }

    /**
     * Define o valor da propriedade bas15A.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBas15A(JAXBElement<Double> value) {
        this.bas15A = value;
    }

    /**
     * Obtém o valor da propriedade bas20A.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBas20A() {
        return bas20A;
    }

    /**
     * Define o valor da propriedade bas20A.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBas20A(JAXBElement<Double> value) {
        this.bas20A = value;
    }

    /**
     * Obtém o valor da propriedade bas25A.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBas25A() {
        return bas25A;
    }

    /**
     * Define o valor da propriedade bas25A.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBas25A(JAXBElement<Double> value) {
        this.bas25A = value;
    }

    /**
     * Obtém o valor da propriedade cmpRcb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpRcb() {
        return cmpRcb;
    }

    /**
     * Define o valor da propriedade cmpRcb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpRcb(JAXBElement<String> value) {
        this.cmpRcb = value;
    }

    /**
     * Obtém o valor da propriedade cnpjSu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnpjSu() {
        return cnpjSu;
    }

    /**
     * Define o valor da propriedade cnpjSu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnpjSu(JAXBElement<String> value) {
        this.cnpjSu = value;
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
     * Obtém o valor da propriedade codRat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodRat() {
        return codRat;
    }

    /**
     * Define o valor da propriedade codRat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodRat(JAXBElement<Integer> value) {
        this.codRat = value;
    }

    /**
     * Obtém o valor da propriedade datPag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatPag() {
        return datPag;
    }

    /**
     * Define o valor da propriedade datPag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatPag(JAXBElement<String> value) {
        this.datPag = value;
    }

    /**
     * Obtém o valor da propriedade datRcb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatRcb() {
        return datRcb;
    }

    /**
     * Define o valor da propriedade datRcb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatRcb(JAXBElement<String> value) {
        this.datRcb = value;
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
     * Obtém o valor da propriedade insPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsPro() {
        return insPro;
    }

    /**
     * Define o valor da propriedade insPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsPro(JAXBElement<String> value) {
        this.insPro = value;
    }

    /**
     * Obtém o valor da propriedade notFis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotFis() {
        return notFis;
    }

    /**
     * Define o valor da propriedade notFis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotFis(JAXBElement<String> value) {
        this.notFis = value;
    }

    /**
     * Obtém o valor da propriedade numCNO.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNumCNO() {
        return numCNO;
    }

    /**
     * Define o valor da propriedade numCNO.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNumCNO(JAXBElement<Double> value) {
        this.numCNO = value;
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
     * Obtém o valor da propriedade numPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumPro() {
        return numPro;
    }

    /**
     * Define o valor da propriedade numPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumPro(JAXBElement<String> value) {
        this.numPro = value;
    }

    /**
     * Obtém o valor da propriedade ret11P.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRet11P() {
        return ret11P;
    }

    /**
     * Define o valor da propriedade ret11P.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRet11P(JAXBElement<Double> value) {
        this.ret11P = value;
    }

    /**
     * Obtém o valor da propriedade retSub.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRetSub() {
        return retSub;
    }

    /**
     * Define o valor da propriedade retSub.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRetSub(JAXBElement<Double> value) {
        this.retSub = value;
    }

    /**
     * Obtém o valor da propriedade seqRcb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSeqRcb() {
        return seqRcb;
    }

    /**
     * Define o valor da propriedade seqRcb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSeqRcb(JAXBElement<Integer> value) {
        this.seqRcb = value;
    }

    /**
     * Obtém o valor da propriedade serFis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerFis() {
        return serFis;
    }

    /**
     * Define o valor da propriedade serFis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerFis(JAXBElement<String> value) {
        this.serFis = value;
    }

    /**
     * Obtém o valor da propriedade serObr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSerObr() {
        return serObr;
    }

    /**
     * Define o valor da propriedade serObr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSerObr(JAXBElement<Integer> value) {
        this.serObr = value;
    }

    /**
     * Obtém o valor da propriedade serPre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSerPre() {
        return serPre;
    }

    /**
     * Define o valor da propriedade serPre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSerPre(JAXBElement<Integer> value) {
        this.serPre = value;
    }

    /**
     * Gets the value of the servicosContidosNF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicosContidosNF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicosContidosNF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosServicoPrestadoInServicosContidosNF }
     * 
     * 
     */
    public List<TerceirosServicoPrestadoInServicosContidosNF> getServicosContidosNF() {
        if (servicosContidosNF == null) {
            servicosContidosNF = new ArrayList<TerceirosServicoPrestadoInServicosContidosNF>();
        }
        return this.servicosContidosNF;
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
     * Obtém o valor da propriedade tipPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipPro() {
        return tipPro;
    }

    /**
     * Define o valor da propriedade tipPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipPro(JAXBElement<Integer> value) {
        this.tipPro = value;
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

    /**
     * Obtém o valor da propriedade valDed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValDed() {
        return valDed;
    }

    /**
     * Define o valor da propriedade valDed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValDed(JAXBElement<Double> value) {
        this.valDed = value;
    }

    /**
     * Obtém o valor da propriedade valMat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValMat() {
        return valMat;
    }

    /**
     * Define o valor da propriedade valMat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValMat(JAXBElement<Double> value) {
        this.valMat = value;
    }

    /**
     * Obtém o valor da propriedade valNRe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValNRe() {
        return valNRe;
    }

    /**
     * Define o valor da propriedade valNRe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValNRe(JAXBElement<Double> value) {
        this.valNRe = value;
    }

    /**
     * Obtém o valor da propriedade valRcb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValRcb() {
        return valRcb;
    }

    /**
     * Define o valor da propriedade valRcb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValRcb(JAXBElement<Double> value) {
        this.valRcb = value;
    }

    /**
     * Obtém o valor da propriedade valSer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValSer() {
        return valSer;
    }

    /**
     * Define o valor da propriedade valSer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValSer(JAXBElement<Double> value) {
        this.valSer = value;
    }

}
