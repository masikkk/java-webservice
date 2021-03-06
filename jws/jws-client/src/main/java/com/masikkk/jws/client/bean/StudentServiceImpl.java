
package com.masikkk.jws.client.bean;

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
@WebService(name = "StudentServiceImpl", targetNamespace = "http://bean.server.jws.masikkk.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentServiceImpl {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.masikkk.jws.client.bean.StudentResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryStudentResponse", targetNamespace = "http://bean.server.jws.masikkk.com/", className = "com.masikkk.jws.client.bean.QueryStudentResponse")
    @ResponseWrapper(localName = "queryStudentResponseResponse", targetNamespace = "http://bean.server.jws.masikkk.com/", className = "com.masikkk.jws.client.bean.QueryStudentResponseResponse")
    @Action(input = "http://bean.server.jws.masikkk.com/StudentServiceImpl/queryStudentResponseRequest", output = "http://bean.server.jws.masikkk.com/StudentServiceImpl/queryStudentResponseResponse")
    public StudentResponse queryStudentResponse(
        @WebParam(name = "arg0", targetNamespace = "")
        StudentRequest arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.masikkk.jws.client.bean.StudentResponse>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryStudentResponseList", targetNamespace = "http://bean.server.jws.masikkk.com/", className = "com.masikkk.jws.client.bean.QueryStudentResponseList")
    @ResponseWrapper(localName = "queryStudentResponseListResponse", targetNamespace = "http://bean.server.jws.masikkk.com/", className = "com.masikkk.jws.client.bean.QueryStudentResponseListResponse")
    @Action(input = "http://bean.server.jws.masikkk.com/StudentServiceImpl/queryStudentResponseListRequest", output = "http://bean.server.jws.masikkk.com/StudentServiceImpl/queryStudentResponseListResponse")
    public List<StudentResponse> queryStudentResponseList(
        @WebParam(name = "arg0", targetNamespace = "")
        StudentRequest arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
