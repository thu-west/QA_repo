//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 01:43:12 PM CST 
//


package platform.nlp.ltp.xml.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Xml4Nlp_QNAME = new QName("", "xml4nlp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LTPRoot }
     * 
     */
    public LTPRoot createLTPRoot() {
        return new LTPRoot();
    }

    /**
     * Create an instance of {@link LTPWord }
     * 
     */
    public LTPWord createLTPWord() {
        return new LTPWord();
    }

    /**
     * Create an instance of {@link LTPSentence }
     * 
     */
    public LTPSentence createLTPSentence() {
        return new LTPSentence();
    }

    /**
     * Create an instance of {@link LTPParagraph }
     * 
     */
    public LTPParagraph createLTPParagraph() {
        return new LTPParagraph();
    }

    /**
     * Create an instance of {@link LTPNote }
     * 
     */
    public LTPNote createLTPNote() {
        return new LTPNote();
    }

    /**
     * Create an instance of {@link LTPArg }
     * 
     */
    public LTPArg createLTPArg() {
        return new LTPArg();
    }

    /**
     * Create an instance of {@link LTPDocument }
     * 
     */
    public LTPDocument createLTPDocument() {
        return new LTPDocument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LTPRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xml4nlp")
    public JAXBElement<LTPRoot> createXml4Nlp(LTPRoot value) {
        return new JAXBElement<LTPRoot>(_Xml4Nlp_QNAME, LTPRoot.class, null, value);
    }

}
