
package wsTerceiros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de terceirosServicosTomadosInServicosContidosNF complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="terceirosServicosTomadosInServicosContidosNF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseRetecao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numeroItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipOpe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoServicoTomador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorBruto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terceirosServicosTomadosInServicosContidosNF", propOrder = {
    "baseRetecao",
    "numeroItem",
    "tipOpe",
    "tipoServicoTomador",
    "valorBruto"
})
public class TerceirosServicosTomadosInServicosContidosNF {

    @XmlElementRef(name = "baseRetecao", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> baseRetecao;
    @XmlElementRef(name = "numeroItem", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroItem;
    @XmlElementRef(name = "tipOpe", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipOpe;
    @XmlElementRef(name = "tipoServicoTomador", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoServicoTomador;
    @XmlElementRef(name = "valorBruto", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorBruto;

    /**
     * Obtém o valor da propriedade baseRetecao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBaseRetecao() {
        return baseRetecao;
    }

    /**
     * Define o valor da propriedade baseRetecao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBaseRetecao(JAXBElement<Double> value) {
        this.baseRetecao = value;
    }

    /**
     * Obtém o valor da propriedade numeroItem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumeroItem() {
        return numeroItem;
    }

    /**
     * Define o valor da propriedade numeroItem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumeroItem(JAXBElement<Integer> value) {
        this.numeroItem = value;
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
     * Obtém o valor da propriedade tipoServicoTomador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoServicoTomador() {
        return tipoServicoTomador;
    }

    /**
     * Define o valor da propriedade tipoServicoTomador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoServicoTomador(JAXBElement<String> value) {
        this.tipoServicoTomador = value;
    }

    /**
     * Obtém o valor da propriedade valorBruto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorBruto() {
        return valorBruto;
    }

    /**
     * Define o valor da propriedade valorBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorBruto(JAXBElement<Double> value) {
        this.valorBruto = value;
    }

}
