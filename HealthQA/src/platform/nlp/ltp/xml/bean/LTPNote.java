//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 01:43:12 PM CST 
//


package platform.nlp.ltp.xml.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LTPNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LTPNote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="word" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ne" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wsd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="srl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LTPNote")
public class LTPNote {

    @XmlAttribute
    protected String sent;
    @XmlAttribute
    protected String word;
    @XmlAttribute
    protected String pos;
    @XmlAttribute
    protected String ne;
    @XmlAttribute
    protected String parser;
    @XmlAttribute
    protected String wsd;
    @XmlAttribute
    protected String srl;

    /**
     * Gets the value of the sent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSent() {
        return sent;
    }

    /**
     * Sets the value of the sent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSent(String value) {
        this.sent = value;
    }

    /**
     * Gets the value of the word property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets the value of the word property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWord(String value) {
        this.word = value;
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
     * Gets the value of the parser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParser() {
        return parser;
    }

    /**
     * Sets the value of the parser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParser(String value) {
        this.parser = value;
    }

    /**
     * Gets the value of the wsd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsd() {
        return wsd;
    }

    /**
     * Sets the value of the wsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsd(String value) {
        this.wsd = value;
    }

    /**
     * Gets the value of the srl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrl() {
        return srl;
    }

    /**
     * Sets the value of the srl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrl(String value) {
        this.srl = value;
    }

}
