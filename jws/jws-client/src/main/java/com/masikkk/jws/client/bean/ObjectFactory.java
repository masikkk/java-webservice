
package com.masikkk.jws.client.bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.masikkk.jws.client.bean package. 
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

    private final static QName _QueryStudentResponseListResponse_QNAME = new QName("http://bean.server.jws.masikkk.com/", "queryStudentResponseListResponse");
    private final static QName _QueryStudentResponse_QNAME = new QName("http://bean.server.jws.masikkk.com/", "queryStudentResponse");
    private final static QName _QueryStudentResponseList_QNAME = new QName("http://bean.server.jws.masikkk.com/", "queryStudentResponseList");
    private final static QName _QueryStudentResponseResponse_QNAME = new QName("http://bean.server.jws.masikkk.com/", "queryStudentResponseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.masikkk.jws.client.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryStudentResponseListResponse }
     * 
     */
    public QueryStudentResponseListResponse createQueryStudentResponseListResponse() {
        return new QueryStudentResponseListResponse();
    }

    /**
     * Create an instance of {@link QueryStudentResponse }
     * 
     */
    public QueryStudentResponse createQueryStudentResponse() {
        return new QueryStudentResponse();
    }

    /**
     * Create an instance of {@link QueryStudentResponseList }
     * 
     */
    public QueryStudentResponseList createQueryStudentResponseList() {
        return new QueryStudentResponseList();
    }

    /**
     * Create an instance of {@link QueryStudentResponseResponse }
     * 
     */
    public QueryStudentResponseResponse createQueryStudentResponseResponse() {
        return new QueryStudentResponseResponse();
    }

    /**
     * Create an instance of {@link StudentResponse }
     * 
     */
    public StudentResponse createStudentResponse() {
        return new StudentResponse();
    }

    /**
     * Create an instance of {@link StudentRequest }
     * 
     */
    public StudentRequest createStudentRequest() {
        return new StudentRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStudentResponseListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.server.jws.masikkk.com/", name = "queryStudentResponseListResponse")
    public JAXBElement<QueryStudentResponseListResponse> createQueryStudentResponseListResponse(QueryStudentResponseListResponse value) {
        return new JAXBElement<QueryStudentResponseListResponse>(_QueryStudentResponseListResponse_QNAME, QueryStudentResponseListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.server.jws.masikkk.com/", name = "queryStudentResponse")
    public JAXBElement<QueryStudentResponse> createQueryStudentResponse(QueryStudentResponse value) {
        return new JAXBElement<QueryStudentResponse>(_QueryStudentResponse_QNAME, QueryStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStudentResponseList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.server.jws.masikkk.com/", name = "queryStudentResponseList")
    public JAXBElement<QueryStudentResponseList> createQueryStudentResponseList(QueryStudentResponseList value) {
        return new JAXBElement<QueryStudentResponseList>(_QueryStudentResponseList_QNAME, QueryStudentResponseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryStudentResponseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.server.jws.masikkk.com/", name = "queryStudentResponseResponse")
    public JAXBElement<QueryStudentResponseResponse> createQueryStudentResponseResponse(QueryStudentResponseResponse value) {
        return new JAXBElement<QueryStudentResponseResponse>(_QueryStudentResponseResponse_QNAME, QueryStudentResponseResponse.class, null, value);
    }

}
