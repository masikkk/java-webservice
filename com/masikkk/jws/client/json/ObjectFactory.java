
package com.masikkk.jws.client.json;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.masikkk.jws.client.json package. 
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

    private final static QName _QueryJsonResponse_QNAME = new QName("http://json.server.jws.masikkk.com/", "queryJsonResponse");
    private final static QName _QueryJson_QNAME = new QName("http://json.server.jws.masikkk.com/", "queryJson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.masikkk.jws.client.json
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryJsonResponse }
     * 
     */
    public QueryJsonResponse createQueryJsonResponse() {
        return new QueryJsonResponse();
    }

    /**
     * Create an instance of {@link QueryJson }
     * 
     */
    public QueryJson createQueryJson() {
        return new QueryJson();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://json.server.jws.masikkk.com/", name = "queryJsonResponse")
    public JAXBElement<QueryJsonResponse> createQueryJsonResponse(QueryJsonResponse value) {
        return new JAXBElement<QueryJsonResponse>(_QueryJsonResponse_QNAME, QueryJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://json.server.jws.masikkk.com/", name = "queryJson")
    public JAXBElement<QueryJson> createQueryJson(QueryJson value) {
        return new JAXBElement<QueryJson>(_QueryJson_QNAME, QueryJson.class, null, value);
    }

}
