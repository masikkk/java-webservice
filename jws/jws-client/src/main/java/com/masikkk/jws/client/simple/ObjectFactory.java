
package com.masikkk.jws.client.simple;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.masikkk.jws.client.simple package. 
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

    private final static QName _SayHelloNameResponse_QNAME = new QName("http://simple.server.jws.masikkk.com/", "sayHelloNameResponse");
    private final static QName _SayHelloList_QNAME = new QName("http://simple.server.jws.masikkk.com/", "sayHelloList");
    private final static QName _SayHelloListResponse_QNAME = new QName("http://simple.server.jws.masikkk.com/", "sayHelloListResponse");
    private final static QName _SayHelloName_QNAME = new QName("http://simple.server.jws.masikkk.com/", "sayHelloName");
    private final static QName _SayHello_QNAME = new QName("http://simple.server.jws.masikkk.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://simple.server.jws.masikkk.com/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.masikkk.jws.client.simple
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloListResponse }
     * 
     */
    public SayHelloListResponse createSayHelloListResponse() {
        return new SayHelloListResponse();
    }

    /**
     * Create an instance of {@link SayHelloList }
     * 
     */
    public SayHelloList createSayHelloList() {
        return new SayHelloList();
    }

    /**
     * Create an instance of {@link SayHelloNameResponse }
     * 
     */
    public SayHelloNameResponse createSayHelloNameResponse() {
        return new SayHelloNameResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloName }
     * 
     */
    public SayHelloName createSayHelloName() {
        return new SayHelloName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.server.jws.masikkk.com/", name = "sayHelloNameResponse")
    public JAXBElement<SayHelloNameResponse> createSayHelloNameResponse(SayHelloNameResponse value) {
        return new JAXBElement<SayHelloNameResponse>(_SayHelloNameResponse_QNAME, SayHelloNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.server.jws.masikkk.com/", name = "sayHelloList")
    public JAXBElement<SayHelloList> createSayHelloList(SayHelloList value) {
        return new JAXBElement<SayHelloList>(_SayHelloList_QNAME, SayHelloList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.server.jws.masikkk.com/", name = "sayHelloListResponse")
    public JAXBElement<SayHelloListResponse> createSayHelloListResponse(SayHelloListResponse value) {
        return new JAXBElement<SayHelloListResponse>(_SayHelloListResponse_QNAME, SayHelloListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.server.jws.masikkk.com/", name = "sayHelloName")
    public JAXBElement<SayHelloName> createSayHelloName(SayHelloName value) {
        return new JAXBElement<SayHelloName>(_SayHelloName_QNAME, SayHelloName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.server.jws.masikkk.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.server.jws.masikkk.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
