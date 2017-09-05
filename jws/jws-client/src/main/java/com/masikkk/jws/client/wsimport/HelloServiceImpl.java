
package com.masikkk.jws.client.wsimport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloServiceImpl", targetNamespace = "http://server.jws.masikkk.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloName", targetNamespace = "http://server.jws.masikkk.com/", className = "com.masikkk.jws.client.wsimport.SayHelloName")
    @ResponseWrapper(localName = "sayHelloNameResponse", targetNamespace = "http://server.jws.masikkk.com/", className = "com.masikkk.jws.client.wsimport.SayHelloNameResponse")
    @Action(input = "http://server.jws.masikkk.com/HelloServiceImpl/sayHelloNameRequest", output = "http://server.jws.masikkk.com/HelloServiceImpl/sayHelloNameResponse")
    public String sayHelloName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://server.jws.masikkk.com/", className = "com.masikkk.jws.client.wsimport.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://server.jws.masikkk.com/", className = "com.masikkk.jws.client.wsimport.SayHelloResponse")
    @Action(input = "http://server.jws.masikkk.com/HelloServiceImpl/sayHelloRequest", output = "http://server.jws.masikkk.com/HelloServiceImpl/sayHelloResponse")
    public String sayHello();

}
