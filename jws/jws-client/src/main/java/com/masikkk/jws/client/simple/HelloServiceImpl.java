
package com.masikkk.jws.client.simple;

import java.util.List;
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
@WebService(name = "HelloServiceImpl", targetNamespace = "http://simple.server.jws.masikkk.com/")
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
    @RequestWrapper(localName = "sayHelloName", targetNamespace = "http://simple.server.jws.masikkk.com/", className = "com.masikkk.jws.client.simple.SayHelloName")
    @ResponseWrapper(localName = "sayHelloNameResponse", targetNamespace = "http://simple.server.jws.masikkk.com/", className = "com.masikkk.jws.client.simple.SayHelloNameResponse")
    @Action(input = "http://simple.server.jws.masikkk.com/HelloServiceImpl/sayHelloNameRequest", output = "http://simple.server.jws.masikkk.com/HelloServiceImpl/sayHelloNameResponse")
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
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://simple.server.jws.masikkk.com/", className = "com.masikkk.jws.client.simple.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://simple.server.jws.masikkk.com/", className = "com.masikkk.jws.client.simple.SayHelloResponse")
    @Action(input = "http://simple.server.jws.masikkk.com/HelloServiceImpl/sayHelloRequest", output = "http://simple.server.jws.masikkk.com/HelloServiceImpl/sayHelloResponse")
    public String sayHello();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloList", targetNamespace = "http://simple.server.jws.masikkk.com/", className = "com.masikkk.jws.client.simple.SayHelloList")
    @ResponseWrapper(localName = "sayHelloListResponse", targetNamespace = "http://simple.server.jws.masikkk.com/", className = "com.masikkk.jws.client.simple.SayHelloListResponse")
    @Action(input = "http://simple.server.jws.masikkk.com/HelloServiceImpl/sayHelloListRequest", output = "http://simple.server.jws.masikkk.com/HelloServiceImpl/sayHelloListResponse")
    public List<String> sayHelloList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}