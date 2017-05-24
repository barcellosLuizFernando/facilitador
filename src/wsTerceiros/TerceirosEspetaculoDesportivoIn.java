
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
 * <p>Classe Java de terceirosEspetaculoDesportivoIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosEspetaculoDesportivoIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catEve" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cgcMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgcVis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codEst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPai" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datRea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despesas" type="{http://services.senior.com.br}terceirosEspetaculoDesportivoInDespesas" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detalhamentoMaoDeObra" type="{http://services.senior.com.br}terceirosEspetaculoDesportivoInDetalhamentoMaoDeObra" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horRea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ingressos" type="{http://services.senior.com.br}terceirosEspetaculoDesportivoInIngressos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nomCom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomVis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numBol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outrasReceitas" type="{http://services.senior.com.br}terceirosEspetaculoDesportivoInOutrasReceitas" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="praDes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtdNPa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="qtdPag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receitaIngressos" type="{http://services.senior.com.br}terceirosEspetaculoDesportivoInReceitaIngressos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipCom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valCon" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vlrClu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vlrRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosEspetaculoDesportivoIn", propOrder = {
    "catEve",
    "cgcMan",
    "cgcVis",
    "codCid",
    "codEst",
    "codFil",
    "codPai",
    "datRea",
    "despesas",
    "detalhamentoMaoDeObra",
    "flowInstanceID",
    "flowName",
    "horRea",
    "ingressos",
    "nomCom",
    "nomMan",
    "nomVis",
    "numBol",
    "numEmp",
    "outrasReceitas",
    "praDes",
    "qtdNPa",
    "qtdPag",
    "receitaIngressos",
    "tipCom",
    "tipOpe",
    "valCon",
    "vlrClu",
    "vlrRet"
})
public class TerceirosEspetaculoDesportivoIn {

    @XmlElementRef(name = "catEve", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> catEve;
    @XmlElementRef(name = "cgcMan", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cgcMan;
    @XmlElementRef(name = "cgcVis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cgcVis;
    @XmlElementRef(name = "codCid", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codCid;
    @XmlElementRef(name = "codEst", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEst;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFil;
    @XmlElementRef(name = "codPai", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPai;
    @XmlElementRef(name = "datRea", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datRea;
    @XmlElement(nillable = true)
    protected List<TerceirosEspetaculoDesportivoInDespesas> despesas;
    @XmlElement(nillable = true)
    protected List<TerceirosEspetaculoDesportivoInDetalhamentoMaoDeObra> detalhamentoMaoDeObra;
    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElementRef(name = "horRea", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> horRea;
    @XmlElement(nillable = true)
    protected List<TerceirosEspetaculoDesportivoInIngressos> ingressos;
    @XmlElementRef(name = "nomCom", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomCom;
    @XmlElementRef(name = "nomMan", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomMan;
    @XmlElementRef(name = "nomVis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomVis;
    @XmlElementRef(name = "numBol", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numBol;
    @XmlElementRef(name = "numEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numEmp;
    @XmlElement(nillable = true)
    protected List<TerceirosEspetaculoDesportivoInOutrasReceitas> outrasReceitas;
    @XmlElementRef(name = "praDes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> praDes;
    @XmlElementRef(name = "qtdNPa", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qtdNPa;
    @XmlElementRef(name = "qtdPag", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qtdPag;
    @XmlElement(nillable = true)
    protected List<TerceirosEspetaculoDesportivoInReceitaIngressos> receitaIngressos;
    @XmlElementRef(name = "tipCom", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipCom;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "valCon", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valCon;
    @XmlElementRef(name = "vlrClu", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrClu;
    @XmlElementRef(name = "vlrRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrRet;

    /**
     * Obtém o valor da propriedade catEve.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCatEve() {
        return catEve;
    }

    /**
     * Define o valor da propriedade catEve.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCatEve(JAXBElement<Integer> value) {
        this.catEve = value;
    }

    /**
     * Obtém o valor da propriedade cgcMan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCgcMan() {
        return cgcMan;
    }

    /**
     * Define o valor da propriedade cgcMan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCgcMan(JAXBElement<String> value) {
        this.cgcMan = value;
    }

    /**
     * Obtém o valor da propriedade cgcVis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCgcVis() {
        return cgcVis;
    }

    /**
     * Define o valor da propriedade cgcVis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCgcVis(JAXBElement<String> value) {
        this.cgcVis = value;
    }

    /**
     * Obtém o valor da propriedade codCid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodCid() {
        return codCid;
    }

    /**
     * Define o valor da propriedade codCid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodCid(JAXBElement<Integer> value) {
        this.codCid = value;
    }

    /**
     * Obtém o valor da propriedade codEst.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEst() {
        return codEst;
    }

    /**
     * Define o valor da propriedade codEst.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEst(JAXBElement<String> value) {
        this.codEst = value;
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
     * Obtém o valor da propriedade codPai.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPai() {
        return codPai;
    }

    /**
     * Define o valor da propriedade codPai.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPai(JAXBElement<Integer> value) {
        this.codPai = value;
    }

    /**
     * Obtém o valor da propriedade datRea.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatRea() {
        return datRea;
    }

    /**
     * Define o valor da propriedade datRea.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatRea(JAXBElement<String> value) {
        this.datRea = value;
    }

    /**
     * Gets the value of the despesas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despesas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespesas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosEspetaculoDesportivoInDespesas }
     * 
     * 
     */
    public List<TerceirosEspetaculoDesportivoInDespesas> getDespesas() {
        if (despesas == null) {
            despesas = new ArrayList<TerceirosEspetaculoDesportivoInDespesas>();
        }
        return this.despesas;
    }

    /**
     * Gets the value of the detalhamentoMaoDeObra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalhamentoMaoDeObra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalhamentoMaoDeObra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosEspetaculoDesportivoInDetalhamentoMaoDeObra }
     * 
     * 
     */
    public List<TerceirosEspetaculoDesportivoInDetalhamentoMaoDeObra> getDetalhamentoMaoDeObra() {
        if (detalhamentoMaoDeObra == null) {
            detalhamentoMaoDeObra = new ArrayList<TerceirosEspetaculoDesportivoInDetalhamentoMaoDeObra>();
        }
        return this.detalhamentoMaoDeObra;
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
     * Obtém o valor da propriedade horRea.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHorRea() {
        return horRea;
    }

    /**
     * Define o valor da propriedade horRea.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHorRea(JAXBElement<Integer> value) {
        this.horRea = value;
    }

    /**
     * Gets the value of the ingressos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingressos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngressos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosEspetaculoDesportivoInIngressos }
     * 
     * 
     */
    public List<TerceirosEspetaculoDesportivoInIngressos> getIngressos() {
        if (ingressos == null) {
            ingressos = new ArrayList<TerceirosEspetaculoDesportivoInIngressos>();
        }
        return this.ingressos;
    }

    /**
     * Obtém o valor da propriedade nomCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomCom() {
        return nomCom;
    }

    /**
     * Define o valor da propriedade nomCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomCom(JAXBElement<String> value) {
        this.nomCom = value;
    }

    /**
     * Obtém o valor da propriedade nomMan.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomMan() {
        return nomMan;
    }

    /**
     * Define o valor da propriedade nomMan.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomMan(JAXBElement<String> value) {
        this.nomMan = value;
    }

    /**
     * Obtém o valor da propriedade nomVis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomVis() {
        return nomVis;
    }

    /**
     * Define o valor da propriedade nomVis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomVis(JAXBElement<String> value) {
        this.nomVis = value;
    }

    /**
     * Obtém o valor da propriedade numBol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumBol() {
        return numBol;
    }

    /**
     * Define o valor da propriedade numBol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumBol(JAXBElement<Integer> value) {
        this.numBol = value;
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
     * Gets the value of the outrasReceitas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outrasReceitas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutrasReceitas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosEspetaculoDesportivoInOutrasReceitas }
     * 
     * 
     */
    public List<TerceirosEspetaculoDesportivoInOutrasReceitas> getOutrasReceitas() {
        if (outrasReceitas == null) {
            outrasReceitas = new ArrayList<TerceirosEspetaculoDesportivoInOutrasReceitas>();
        }
        return this.outrasReceitas;
    }

    /**
     * Obtém o valor da propriedade praDes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPraDes() {
        return praDes;
    }

    /**
     * Define o valor da propriedade praDes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPraDes(JAXBElement<String> value) {
        this.praDes = value;
    }

    /**
     * Obtém o valor da propriedade qtdNPa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQtdNPa() {
        return qtdNPa;
    }

    /**
     * Define o valor da propriedade qtdNPa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQtdNPa(JAXBElement<Integer> value) {
        this.qtdNPa = value;
    }

    /**
     * Obtém o valor da propriedade qtdPag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQtdPag() {
        return qtdPag;
    }

    /**
     * Define o valor da propriedade qtdPag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQtdPag(JAXBElement<Integer> value) {
        this.qtdPag = value;
    }

    /**
     * Gets the value of the receitaIngressos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receitaIngressos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceitaIngressos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosEspetaculoDesportivoInReceitaIngressos }
     * 
     * 
     */
    public List<TerceirosEspetaculoDesportivoInReceitaIngressos> getReceitaIngressos() {
        if (receitaIngressos == null) {
            receitaIngressos = new ArrayList<TerceirosEspetaculoDesportivoInReceitaIngressos>();
        }
        return this.receitaIngressos;
    }

    /**
     * Obtém o valor da propriedade tipCom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipCom() {
        return tipCom;
    }

    /**
     * Define o valor da propriedade tipCom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipCom(JAXBElement<Integer> value) {
        this.tipCom = value;
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
     * Obtém o valor da propriedade valCon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValCon() {
        return valCon;
    }

    /**
     * Define o valor da propriedade valCon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValCon(JAXBElement<Double> value) {
        this.valCon = value;
    }

    /**
     * Obtém o valor da propriedade vlrClu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrClu() {
        return vlrClu;
    }

    /**
     * Define o valor da propriedade vlrClu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrClu(JAXBElement<Double> value) {
        this.vlrClu = value;
    }

    /**
     * Obtém o valor da propriedade vlrRet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrRet() {
        return vlrRet;
    }

    /**
     * Define o valor da propriedade vlrRet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrRet(JAXBElement<Double> value) {
        this.vlrRet = value;
    }

}
