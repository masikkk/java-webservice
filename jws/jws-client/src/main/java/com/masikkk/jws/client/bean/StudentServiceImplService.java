
package com.masikkk.jws.client.bean;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StudentServiceImplService", targetNamespace = "http://bean.server.jws.masikkk.com/", wsdlLocation = "http://localhost:8899/StudentService?wsdl")
public class StudentServiceImplService
    extends Service
{

    private final static URL STUDENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException STUDENTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName STUDENTSERVICEIMPLSERVICE_QNAME = new QName("http://bean.server.jws.masikkk.com/", "StudentServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8899/StudentService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        STUDENTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public StudentServiceImplService() {
        super(__getWsdlLocation(), STUDENTSERVICEIMPLSERVICE_QNAME);
    }

    public StudentServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public StudentServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, STUDENTSERVICEIMPLSERVICE_QNAME);
    }

    public StudentServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public StudentServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentServiceImpl
     */
    @WebEndpoint(name = "StudentServiceImplPort")
    public StudentServiceImpl getStudentServiceImplPort() {
        return super.getPort(new QName("http://bean.server.jws.masikkk.com/", "StudentServiceImplPort"), StudentServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentServiceImpl
     */
    @WebEndpoint(name = "StudentServiceImplPort")
    public StudentServiceImpl getStudentServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bean.server.jws.masikkk.com/", "StudentServiceImplPort"), StudentServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw STUDENTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return STUDENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
