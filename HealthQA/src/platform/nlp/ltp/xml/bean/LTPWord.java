//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 01:43:12 PM CST 
//


package platform.nlp.ltp.xml.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LTPWord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LTPWord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg" type="{}LTPArg" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cont" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ne" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parent" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="relate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LTPWord", propOrder = {
    "arg"
})
public class LTPWord {

    @XmlElement(required = true)
    protected List<LTPArg> arg;
    @XmlAttribute
    protected Integer id;
    @XmlAttribute
    protected String cont;
    @XmlAttribute
    protected String pos;
    @XmlAttribute
    protected String ne;
    @XmlAttribute
    protected Integer parent;
    @XmlAttribute
    protected String relate;

    /**
     * Gets the value of the arg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LTPArg }
     * 
     * 
     */
    public List<LTPArg> getArg() {
        if (arg == null) {
            arg = new ArrayList<LTPArg>();
        }
        return this.arg;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the cont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCont() {
        return cont;
    }

    /**
     * Sets the value of the cont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCont(String value) {
        this.cont = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPos(String value) {
        this.pos = value;
    }

    /**
     * Gets the value of the ne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNe() {
        return ne;
    }

    /**
     * Sets the value of the ne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNe(String value) {
        this.ne = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParent(Integer value) {
        this.parent = value;
    }

    /**
     * Gets the value of the relate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelate() {
        return relate;
    }

    /**
     * Sets the value of the relate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelate(String value) {
        this.relate = value;
    }

}
