
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
 * <p>Classe Java de terceirosPagtosFisicaIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosPagtosFisicaIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assIrf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basIns" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="basIrf" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cmpPte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjOp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCCU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codIse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codLim" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codNtg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codOpe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conIns" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ctaFin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="datPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dedIns" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="depIrf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gridPensaoJudicial" type="{http://services.senior.com.br}terceirosPagtosFisicaInGridPensaoJudicial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gridPlanodeSaude" type="{http://services.senior.com.br}terceirosPagtosFisicaInGridPlanodeSaude" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gridRateios" type="{http://services.senior.com.br}terceirosPagtosFisicaInGridRateios" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gruCon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insTrp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="irfRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="natDes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroRpa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numCad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outDes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="outIns" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="penJud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="perGrp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="perIss" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="proIRR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="proIns" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="renBru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="seqPte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="srvTer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valIse" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valIss" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vlrPla" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosPagtosFisicaIn", propOrder = {
    "assIrf",
    "basIns",
    "basIrf",
    "cmpPte",
    "cnpjOp",
    "codCCU",
    "codCid",
    "codFil",
    "codIse",
    "codLim",
    "codNtg",
    "codOpe",
    "codRed",
    "codRet",
    "codSer",
    "conIns",
    "ctaFin",
    "datPag",
    "datRec",
    "dedIns",
    "depIrf",
    "flowInstanceID",
    "flowName",
    "gridPensaoJudicial",
    "gridPlanodeSaude",
    "gridRateios",
    "gruCon",
    "insTrp",
    "irfRet",
    "natDes",
    "nomOpe",
    "nroRpa",
    "numCad",
    "numEmp",
    "numLoc",
    "outDes",
    "outIns",
    "penJud",
    "perGrp",
    "perIss",
    "proIRR",
    "proIns",
    "renBru",
    "seqPte",
    "srvTer",
    "tipOpe",
    "valIse",
    "valIss",
    "vlrPla"
})
public class TerceirosPagtosFisicaIn {

    @XmlElementRef(name = "assIrf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assIrf;
    @XmlElementRef(name = "basIns", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basIns;
    @XmlElementRef(name = "basIrf", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basIrf;
    @XmlElementRef(name = "cmpPte", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpPte;
    @XmlElementRef(name = "cnpjOp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnpjOp;
    @XmlElementRef(name = "codCCU", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCCU;
    @XmlElementRef(name = "codCid", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codCid;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFil;
    @XmlElementRef(name = "codIse", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codIse;
    @XmlElementRef(name = "codLim", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codLim;
    @XmlElementRef(name = "codNtg", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codNtg;
    @XmlElementRef(name = "codOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codOpe;
    @XmlElementRef(name = "codRed", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codRed;
    @XmlElementRef(name = "codRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codRet;
    @XmlElementRef(name = "codSer", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codSer;
    @XmlElementRef(name = "conIns", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> conIns;
    @XmlElementRef(name = "ctaFin", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ctaFin;
    @XmlElementRef(name = "datPag", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datPag;
    @XmlElementRef(name = "datRec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datRec;
    @XmlElementRef(name = "dedIns", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dedIns;
    @XmlElementRef(name = "depIrf", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> depIrf;
    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElement(nillable = true)
    protected List<TerceirosPagtosFisicaInGridPensaoJudicial> gridPensaoJudicial;
    @XmlElement(nillable = true)
    protected List<TerceirosPagtosFisicaInGridPlanodeSaude> gridPlanodeSaude;
    @XmlElement(nillable = true)
    protected List<TerceirosPagtosFisicaInGridRateios> gridRateios;
    @XmlElementRef(name = "gruCon", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gruCon;
    @XmlElementRef(name = "insTrp", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> insTrp;
    @XmlElementRef(name = "irfRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> irfRet;
    @XmlElementRef(name = "natDes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> natDes;
    @XmlElementRef(name = "nomOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomOpe;
    @XmlElementRef(name = "nroRpa", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nroRpa;
    @XmlElementRef(name = "numCad", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCad;
    @XmlElementRef(name = "numEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numEmp;
    @XmlElementRef(name = "numLoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numLoc;
    @XmlElementRef(name = "outDes", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> outDes;
    @XmlElementRef(name = "outIns", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> outIns;
    @XmlElementRef(name = "penJud", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> penJud;
    @XmlElementRef(name = "perGrp", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perGrp;
    @XmlElementRef(name = "perIss", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perIss;
    @XmlElementRef(name = "proIRR", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> proIRR;
    @XmlElementRef(name = "proIns", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> proIns;
    @XmlElementRef(name = "renBru", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> renBru;
    @XmlElementRef(name = "seqPte", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> seqPte;
    @XmlElementRef(name = "srvTer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> srvTer;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "valIse", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valIse;
    @XmlElementRef(name = "valIss", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valIss;
    @XmlElementRef(name = "vlrPla", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vlrPla;

    /**
     * Obtém o valor da propriedade assIrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssIrf() {
        return assIrf;
    }

    /**
     * Define o valor da propriedade assIrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssIrf(JAXBElement<String> value) {
        this.assIrf = value;
    }

    /**
     * Obtém o valor da propriedade basIns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasIns() {
        return basIns;
    }

    /**
     * Define o valor da propriedade basIns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasIns(JAXBElement<Double> value) {
        this.basIns = value;
    }

    /**
     * Obtém o valor da propriedade basIrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasIrf() {
        return basIrf;
    }

    /**
     * Define o valor da propriedade basIrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasIrf(JAXBElement<Double> value) {
        this.basIrf = value;
    }

    /**
     * Obtém o valor da propriedade cmpPte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpPte() {
        return cmpPte;
    }

    /**
     * Define o valor da propriedade cmpPte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpPte(JAXBElement<String> value) {
        this.cmpPte = value;
    }

    /**
     * Obtém o valor da propriedade cnpjOp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCnpjOp() {
        return cnpjOp;
    }

    /**
     * Define o valor da propriedade cnpjOp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCnpjOp(JAXBElement<String> value) {
        this.cnpjOp = value;
    }

    /**
     * Obtém o valor da propriedade codCCU.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCCU() {
        return codCCU;
    }

    /**
     * Define o valor da propriedade codCCU.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCCU(JAXBElement<String> value) {
        this.codCCU = value;
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
     * Obtém o valor da propriedade codIse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodIse() {
        return codIse;
    }

    /**
     * Define o valor da propriedade codIse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodIse(JAXBElement<Integer> value) {
        this.codIse = value;
    }

    /**
     * Obtém o valor da propriedade codLim.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodLim() {
        return codLim;
    }

    /**
     * Define o valor da propriedade codLim.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodLim(JAXBElement<Integer> value) {
        this.codLim = value;
    }

    /**
     * Obtém o valor da propriedade codNtg.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodNtg() {
        return codNtg;
    }

    /**
     * Define o valor da propriedade codNtg.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodNtg(JAXBElement<Integer> value) {
        this.codNtg = value;
    }

    /**
     * Obtém o valor da propriedade codOpe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodOpe() {
        return codOpe;
    }

    /**
     * Define o valor da propriedade codOpe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodOpe(JAXBElement<Integer> value) {
        this.codOpe = value;
    }

    /**
     * Obtém o valor da propriedade codRed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodRed() {
        return codRed;
    }

    /**
     * Define o valor da propriedade codRed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodRed(JAXBElement<Integer> value) {
        this.codRed = value;
    }

    /**
     * Obtém o valor da propriedade codRet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodRet() {
        return codRet;
    }

    /**
     * Define o valor da propriedade codRet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodRet(JAXBElement<Integer> value) {
        this.codRet = value;
    }

    /**
     * Obtém o valor da propriedade codSer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodSer() {
        return codSer;
    }

    /**
     * Define o valor da propriedade codSer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodSer(JAXBElement<Integer> value) {
        this.codSer = value;
    }

    /**
     * Obtém o valor da propriedade conIns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getConIns() {
        return conIns;
    }

    /**
     * Define o valor da propriedade conIns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setConIns(JAXBElement<Double> value) {
        this.conIns = value;
    }

    /**
     * Obtém o valor da propriedade ctaFin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCtaFin() {
        return ctaFin;
    }

    /**
     * Define o valor da propriedade ctaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCtaFin(JAXBElement<Double> value) {
        this.ctaFin = value;
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
     * Obtém o valor da propriedade datRec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatRec() {
        return datRec;
    }

    /**
     * Define o valor da propriedade datRec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatRec(JAXBElement<String> value) {
        this.datRec = value;
    }

    /**
     * Obtém o valor da propriedade dedIns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDedIns() {
        return dedIns;
    }

    /**
     * Define o valor da propriedade dedIns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDedIns(JAXBElement<Double> value) {
        this.dedIns = value;
    }

    /**
     * Obtém o valor da propriedade depIrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDepIrf() {
        return depIrf;
    }

    /**
     * Define o valor da propriedade depIrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDepIrf(JAXBElement<Integer> value) {
        this.depIrf = value;
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
     * Gets the value of the gridPensaoJudicial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gridPensaoJudicial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGridPensaoJudicial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosPagtosFisicaInGridPensaoJudicial }
     * 
     * 
     */
    public List<TerceirosPagtosFisicaInGridPensaoJudicial> getGridPensaoJudicial() {
        if (gridPensaoJudicial == null) {
            gridPensaoJudicial = new ArrayList<TerceirosPagtosFisicaInGridPensaoJudicial>();
        }
        return this.gridPensaoJudicial;
    }

    /**
     * Gets the value of the gridPlanodeSaude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gridPlanodeSaude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGridPlanodeSaude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosPagtosFisicaInGridPlanodeSaude }
     * 
     * 
     */
    public List<TerceirosPagtosFisicaInGridPlanodeSaude> getGridPlanodeSaude() {
        if (gridPlanodeSaude == null) {
            gridPlanodeSaude = new ArrayList<TerceirosPagtosFisicaInGridPlanodeSaude>();
        }
        return this.gridPlanodeSaude;
    }

    /**
     * Gets the value of the gridRateios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gridRateios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGridRateios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerceirosPagtosFisicaInGridRateios }
     * 
     * 
     */
    public List<TerceirosPagtosFisicaInGridRateios> getGridRateios() {
        if (gridRateios == null) {
            gridRateios = new ArrayList<TerceirosPagtosFisicaInGridRateios>();
        }
        return this.gridRateios;
    }

    /**
     * Obtém o valor da propriedade gruCon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGruCon() {
        return gruCon;
    }

    /**
     * Define o valor da propriedade gruCon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGruCon(JAXBElement<String> value) {
        this.gruCon = value;
    }

    /**
     * Obtém o valor da propriedade insTrp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getInsTrp() {
        return insTrp;
    }

    /**
     * Define o valor da propriedade insTrp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setInsTrp(JAXBElement<Double> value) {
        this.insTrp = value;
    }

    /**
     * Obtém o valor da propriedade irfRet.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getIrfRet() {
        return irfRet;
    }

    /**
     * Define o valor da propriedade irfRet.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setIrfRet(JAXBElement<Double> value) {
        this.irfRet = value;
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
     * Obtém o valor da propriedade nomOpe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomOpe() {
        return nomOpe;
    }

    /**
     * Define o valor da propriedade nomOpe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomOpe(JAXBElement<String> value) {
        this.nomOpe = value;
    }

    /**
     * Obtém o valor da propriedade nroRpa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNroRpa() {
        return nroRpa;
    }

    /**
     * Define o valor da propriedade nroRpa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNroRpa(JAXBElement<Integer> value) {
        this.nroRpa = value;
    }

    /**
     * Obtém o valor da propriedade numCad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCad() {
        return numCad;
    }

    /**
     * Define o valor da propriedade numCad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCad(JAXBElement<Integer> value) {
        this.numCad = value;
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
     * Obtém o valor da propriedade outDes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOutDes() {
        return outDes;
    }

    /**
     * Define o valor da propriedade outDes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOutDes(JAXBElement<Double> value) {
        this.outDes = value;
    }

    /**
     * Obtém o valor da propriedade outIns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOutIns() {
        return outIns;
    }

    /**
     * Define o valor da propriedade outIns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOutIns(JAXBElement<Double> value) {
        this.outIns = value;
    }

    /**
     * Obtém o valor da propriedade penJud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPenJud() {
        return penJud;
    }

    /**
     * Define o valor da propriedade penJud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPenJud(JAXBElement<Double> value) {
        this.penJud = value;
    }

    /**
     * Obtém o valor da propriedade perGrp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerGrp() {
        return perGrp;
    }

    /**
     * Define o valor da propriedade perGrp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerGrp(JAXBElement<Double> value) {
        this.perGrp = value;
    }

    /**
     * Obtém o valor da propriedade perIss.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerIss() {
        return perIss;
    }

    /**
     * Define o valor da propriedade perIss.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerIss(JAXBElement<Double> value) {
        this.perIss = value;
    }

    /**
     * Obtém o valor da propriedade proIRR.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProIRR() {
        return proIRR;
    }

    /**
     * Define o valor da propriedade proIRR.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProIRR(JAXBElement<Integer> value) {
        this.proIRR = value;
    }

    /**
     * Obtém o valor da propriedade proIns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getProIns() {
        return proIns;
    }

    /**
     * Define o valor da propriedade proIns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setProIns(JAXBElement<Integer> value) {
        this.proIns = value;
    }

    /**
     * Obtém o valor da propriedade renBru.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRenBru() {
        return renBru;
    }

    /**
     * Define o valor da propriedade renBru.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRenBru(JAXBElement<Double> value) {
        this.renBru = value;
    }

    /**
     * Obtém o valor da propriedade seqPte.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSeqPte() {
        return seqPte;
    }

    /**
     * Define o valor da propriedade seqPte.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSeqPte(JAXBElement<Integer> value) {
        this.seqPte = value;
    }

    /**
     * Obtém o valor da propriedade srvTer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSrvTer() {
        return srvTer;
    }

    /**
     * Define o valor da propriedade srvTer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSrvTer(JAXBElement<String> value) {
        this.srvTer = value;
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
     * Obtém o valor da propriedade valIse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValIse() {
        return valIse;
    }

    /**
     * Define o valor da propriedade valIse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValIse(JAXBElement<Double> value) {
        this.valIse = value;
    }

    /**
     * Obtém o valor da propriedade valIss.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValIss() {
        return valIss;
    }

    /**
     * Define o valor da propriedade valIss.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValIss(JAXBElement<Double> value) {
        this.valIss = value;
    }

    /**
     * Obtém o valor da propriedade vlrPla.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVlrPla() {
        return vlrPla;
    }

    /**
     * Define o valor da propriedade vlrPla.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVlrPla(JAXBElement<Double> value) {
        this.vlrPla = value;
    }

}
