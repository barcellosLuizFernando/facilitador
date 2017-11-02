
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
 * <p>Classe Java de terceirosServicosTomadosIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosServicosTomadosIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atiIss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bas15a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bas20a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bas25a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="basCof" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="basCsl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="basCsr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="basIrf" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="basIss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="basPis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="basRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cmpPoe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEdc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFil" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codNtg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codOem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSnf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctaFin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="datEmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datPag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forTri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gruCon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="irfRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="natDes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCNO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outDes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="perCof" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="perCsl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="perCsr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="perIrf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="perIss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="perPis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rateios" type="{http://services.senior.com.br}terceirosServicosTomadosInRateios" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="renBru" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="retCof" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="retCsl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="retCsr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="retGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retPis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seqPoe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serFis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serObr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="servicosContidosNF" type="{http://services.senior.com.br}terceirosServicosTomadosInServicosContidosNF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipRen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valCof" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valCsl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valCsr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valDed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valIss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valMat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valNRe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valPis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valREm" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valRet" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "terceirosServicosTomadosIn", propOrder = {
    "atiIss",
    "bas15A",
    "bas20A",
    "bas25A",
    "basCof",
    "basCsl",
    "basCsr",
    "basIrf",
    "basIss",
    "basPis",
    "basRet",
    "cmpPoe",
    "codCcu",
    "codEdc",
    "codFil",
    "codNtg",
    "codOem",
    "codPro",
    "codRed",
    "codRet",
    "codSnf",
    "codTns",
    "ctaFin",
    "datEmi",
    "datPag",
    "flowInstanceID",
    "flowName",
    "forTri",
    "gruCon",
    "insPro",
    "irfRet",
    "natDes",
    "nroDoc",
    "numCNO",
    "numEmp",
    "numLoc",
    "outDes",
    "perCof",
    "perCsl",
    "perCsr",
    "perIrf",
    "perIss",
    "perPis",
    "rateios",
    "renBru",
    "retCof",
    "retCsl",
    "retCsr",
    "retGrp",
    "retPis",
    "seqPoe",
    "serFis",
    "serObr",
    "servicosContidosNF",
    "tipOpe",
    "tipPro",
    "tipRen",
    "valCof",
    "valCsl",
    "valCsr",
    "valDed",
    "valIss",
    "valMat",
    "valNRe",
    "valPis",
    "valREm",
    "valRet",
    "valSer"
})
public class TerceirosServicosTomadosIn {

    @XmlElementRef(name = "atiIss", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> atiIss;
    @XmlElementRef(name = "bas15a", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bas15A;
    @XmlElementRef(name = "bas20a", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bas20A;
    @XmlElementRef(name = "bas25a", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bas25A;
    @XmlElementRef(name = "basCof", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basCof;
    @XmlElementRef(name = "basCsl", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basCsl;
    @XmlElementRef(name = "basCsr", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basCsr;
    @XmlElementRef(name = "basIrf", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basIrf;
    @XmlElementRef(name = "basIss", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> basIss;
    @XmlElementRef(name = "basPis", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basPis;
    @XmlElementRef(name = "basRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> basRet;
    @XmlElementRef(name = "cmpPoe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpPoe;
    @XmlElementRef(name = "codCcu", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCcu;
    @XmlElementRef(name = "codEdc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codEdc;
    @XmlElementRef(name = "codFil", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codFil;
    @XmlElementRef(name = "codNtg", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codNtg;
    @XmlElementRef(name = "codOem", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codOem;
    @XmlElementRef(name = "codPro", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPro;
    @XmlElementRef(name = "codRed", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codRed;
    @XmlElementRef(name = "codRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codRet;
    @XmlElementRef(name = "codSnf", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codSnf;
    @XmlElementRef(name = "codTns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTns;
    @XmlElementRef(name = "ctaFin", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ctaFin;
    @XmlElementRef(name = "datEmi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datEmi;
    @XmlElementRef(name = "datPag", type = JAXBElement.class, required = false)
    protected JAXBElement<String> datPag;
    @XmlElementRef(name = "flowInstanceID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowInstanceID;
    @XmlElementRef(name = "flowName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flowName;
    @XmlElementRef(name = "forTri", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forTri;
    @XmlElementRef(name = "gruCon", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gruCon;
    @XmlElementRef(name = "insPro", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> insPro;
    @XmlElementRef(name = "irfRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> irfRet;
    @XmlElementRef(name = "natDes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> natDes;
    @XmlElementRef(name = "nroDoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nroDoc;
    @XmlElementRef(name = "numCNO", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCNO;
    @XmlElementRef(name = "numEmp", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numEmp;
    @XmlElementRef(name = "numLoc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numLoc;
    @XmlElementRef(name = "outDes", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> outDes;
    @XmlElementRef(name = "perCof", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perCof;
    @XmlElementRef(name = "perCsl", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perCsl;
    @XmlElementRef(name = "perCsr", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perCsr;
    @XmlElementRef(name = "perIrf", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> perIrf;
    @XmlElementRef(name = "perIss", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> perIss;
    @XmlElementRef(name = "perPis", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perPis;
    @XmlElement(nillable = true)
    protected List<TerceirosServicosTomadosInRateios> rateios;
    @XmlElementRef(name = "renBru", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> renBru;
    @XmlElementRef(name = "retCof", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> retCof;
    @XmlElementRef(name = "retCsl", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> retCsl;
    @XmlElementRef(name = "retCsr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> retCsr;
    @XmlElementRef(name = "retGrp", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retGrp;
    @XmlElementRef(name = "retPis", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> retPis;
    @XmlElementRef(name = "seqPoe", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> seqPoe;
    @XmlElementRef(name = "serFis", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serFis;
    @XmlElementRef(name = "serObr", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serObr;
    @XmlElement(nillable = true)
    protected List<TerceirosServicosTomadosInServicosContidosNF> servicosContidosNF;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "tipPro", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipPro;
    @XmlElementRef(name = "tipRen", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipRen;
    @XmlElementRef(name = "valCof", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valCof;
    @XmlElementRef(name = "valCsl", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valCsl;
    @XmlElementRef(name = "valCsr", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valCsr;
    @XmlElementRef(name = "valDed", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valDed;
    @XmlElementRef(name = "valIss", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> valIss;
    @XmlElementRef(name = "valMat", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valMat;
    @XmlElementRef(name = "valNRe", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valNRe;
    @XmlElementRef(name = "valPis", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valPis;
    @XmlElementRef(name = "valREm", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valREm;
    @XmlElementRef(name = "valRet", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valRet;
    @XmlElementRef(name = "valSer", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valSer;

    /**
     * Obtém o valor da propriedade atiIss.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAtiIss() {
        return atiIss;
    }

    /**
     * Define o valor da propriedade atiIss.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAtiIss(JAXBElement<Integer> value) {
        this.atiIss = value;
    }

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
     * Obtém o valor da propriedade basCof.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasCof() {
        return basCof;
    }

    /**
     * Define o valor da propriedade basCof.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasCof(JAXBElement<Double> value) {
        this.basCof = value;
    }

    /**
     * Obtém o valor da propriedade basCsl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasCsl() {
        return basCsl;
    }

    /**
     * Define o valor da propriedade basCsl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasCsl(JAXBElement<Double> value) {
        this.basCsl = value;
    }

    /**
     * Obtém o valor da propriedade basCsr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasCsr() {
        return basCsr;
    }

    /**
     * Define o valor da propriedade basCsr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasCsr(JAXBElement<Double> value) {
        this.basCsr = value;
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
     * Obtém o valor da propriedade basIss.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBasIss() {
        return basIss;
    }

    /**
     * Define o valor da propriedade basIss.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBasIss(JAXBElement<Integer> value) {
        this.basIss = value;
    }

    /**
     * Obtém o valor da propriedade basPis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBasPis() {
        return basPis;
    }

    /**
     * Define o valor da propriedade basPis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBasPis(JAXBElement<Double> value) {
        this.basPis = value;
    }

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
     * Obtém o valor da propriedade cmpPoe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCmpPoe() {
        return cmpPoe;
    }

    /**
     * Define o valor da propriedade cmpPoe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCmpPoe(JAXBElement<String> value) {
        this.cmpPoe = value;
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
     * Obtém o valor da propriedade codEdc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodEdc() {
        return codEdc;
    }

    /**
     * Define o valor da propriedade codEdc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodEdc(JAXBElement<String> value) {
        this.codEdc = value;
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
     * Obtém o valor da propriedade codOem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodOem() {
        return codOem;
    }

    /**
     * Define o valor da propriedade codOem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodOem(JAXBElement<Integer> value) {
        this.codOem = value;
    }

    /**
     * Obtém o valor da propriedade codPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPro() {
        return codPro;
    }

    /**
     * Define o valor da propriedade codPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPro(JAXBElement<Integer> value) {
        this.codPro = value;
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
     * Obtém o valor da propriedade codSnf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodSnf() {
        return codSnf;
    }

    /**
     * Define o valor da propriedade codSnf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodSnf(JAXBElement<String> value) {
        this.codSnf = value;
    }

    /**
     * Obtém o valor da propriedade codTns.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTns() {
        return codTns;
    }

    /**
     * Define o valor da propriedade codTns.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTns(JAXBElement<String> value) {
        this.codTns = value;
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
     * Obtém o valor da propriedade forTri.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForTri() {
        return forTri;
    }

    /**
     * Define o valor da propriedade forTri.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForTri(JAXBElement<String> value) {
        this.forTri = value;
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
     * Obtém o valor da propriedade insPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInsPro() {
        return insPro;
    }

    /**
     * Define o valor da propriedade insPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInsPro(JAXBElement<Integer> value) {
        this.insPro = value;
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
     * Obtém o valor da propriedade nroDoc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNroDoc() {
        return nroDoc;
    }

    /**
     * Define o valor da propriedade nroDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNroDoc(JAXBElement<String> value) {
        this.nroDoc = value;
    }

    /**
     * Obtém o valor da propriedade numCNO.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCNO() {
        return numCNO;
    }

    /**
     * Define o valor da propriedade numCNO.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCNO(JAXBElement<Integer> value) {
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
     * Obtém o valor da propriedade perCof.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerCof() {
        return perCof;
    }

    /**
     * Define o valor da propriedade perCof.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerCof(JAXBElement<Double> value) {
        this.perCof = value;
    }

    /**
     * Obtém o valor da propriedade perCsl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerCsl() {
        return perCsl;
    }

    /**
     * Define o valor da propriedade perCsl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerCsl(JAXBElement<Double> value) {
        this.perCsl = value;
    }

    /**
     * Obtém o valor da propriedade perCsr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerCsr() {
        return perCsr;
    }

    /**
     * Define o valor da propriedade perCsr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerCsr(JAXBElement<Double> value) {
        this.perCsr = value;
    }

    /**
     * Obtém o valor da propriedade perIrf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPerIrf() {
        return perIrf;
    }

    /**
     * Define o valor da propriedade perIrf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPerIrf(JAXBElement<Integer> value) {
        this.perIrf = value;
    }

    /**
     * Obtém o valor da propriedade perIss.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPerIss() {
        return perIss;
    }

    /**
     * Define o valor da propriedade perIss.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPerIss(JAXBElement<Integer> value) {
        this.perIss = value;
    }

    /**
     * Obtém o valor da propriedade perPis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerPis() {
        return perPis;
    }

    /**
     * Define o valor da propriedade perPis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerPis(JAXBElement<Double> value) {
        this.perPis = value;
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
     * {@link TerceirosServicosTomadosInRateios }
     * 
     * 
     */
    public List<TerceirosServicosTomadosInRateios> getRateios() {
        if (rateios == null) {
            rateios = new ArrayList<TerceirosServicosTomadosInRateios>();
        }
        return this.rateios;
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
     * Obtém o valor da propriedade retCof.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRetCof() {
        return retCof;
    }

    /**
     * Define o valor da propriedade retCof.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRetCof(JAXBElement<Integer> value) {
        this.retCof = value;
    }

    /**
     * Obtém o valor da propriedade retCsl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRetCsl() {
        return retCsl;
    }

    /**
     * Define o valor da propriedade retCsl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRetCsl(JAXBElement<Integer> value) {
        this.retCsl = value;
    }

    /**
     * Obtém o valor da propriedade retCsr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRetCsr() {
        return retCsr;
    }

    /**
     * Define o valor da propriedade retCsr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRetCsr(JAXBElement<Integer> value) {
        this.retCsr = value;
    }

    /**
     * Obtém o valor da propriedade retGrp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetGrp() {
        return retGrp;
    }

    /**
     * Define o valor da propriedade retGrp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetGrp(JAXBElement<String> value) {
        this.retGrp = value;
    }

    /**
     * Obtém o valor da propriedade retPis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRetPis() {
        return retPis;
    }

    /**
     * Define o valor da propriedade retPis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRetPis(JAXBElement<Integer> value) {
        this.retPis = value;
    }

    /**
     * Obtém o valor da propriedade seqPoe.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSeqPoe() {
        return seqPoe;
    }

    /**
     * Define o valor da propriedade seqPoe.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSeqPoe(JAXBElement<Integer> value) {
        this.seqPoe = value;
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
     * {@link TerceirosServicosTomadosInServicosContidosNF }
     * 
     * 
     */
    public List<TerceirosServicosTomadosInServicosContidosNF> getServicosContidosNF() {
        if (servicosContidosNF == null) {
            servicosContidosNF = new ArrayList<TerceirosServicosTomadosInServicosContidosNF>();
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
     * Obtém o valor da propriedade tipRen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipRen() {
        return tipRen;
    }

    /**
     * Define o valor da propriedade tipRen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipRen(JAXBElement<String> value) {
        this.tipRen = value;
    }

    /**
     * Obtém o valor da propriedade valCof.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValCof() {
        return valCof;
    }

    /**
     * Define o valor da propriedade valCof.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValCof(JAXBElement<Double> value) {
        this.valCof = value;
    }

    /**
     * Obtém o valor da propriedade valCsl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValCsl() {
        return valCsl;
    }

    /**
     * Define o valor da propriedade valCsl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValCsl(JAXBElement<Double> value) {
        this.valCsl = value;
    }

    /**
     * Obtém o valor da propriedade valCsr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValCsr() {
        return valCsr;
    }

    /**
     * Define o valor da propriedade valCsr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValCsr(JAXBElement<Double> value) {
        this.valCsr = value;
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
     * Obtém o valor da propriedade valIss.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getValIss() {
        return valIss;
    }

    /**
     * Define o valor da propriedade valIss.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setValIss(JAXBElement<Integer> value) {
        this.valIss = value;
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
     * Obtém o valor da propriedade valPis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValPis() {
        return valPis;
    }

    /**
     * Define o valor da propriedade valPis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValPis(JAXBElement<Double> value) {
        this.valPis = value;
    }

    /**
     * Obtém o valor da propriedade valREm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValREm() {
        return valREm;
    }

    /**
     * Define o valor da propriedade valREm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValREm(JAXBElement<Double> value) {
        this.valREm = value;
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
