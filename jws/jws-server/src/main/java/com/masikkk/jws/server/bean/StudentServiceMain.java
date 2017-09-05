package com.masikkk.jws.server.bean;

import javax.xml.ws.Endpoint;

public class StudentServiceMain {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8899/StudentService", new StudentServiceImpl());
		System.out.println("HelloService发布成功，WSDL地址：http://localhost:8899/StudentService?wsdl");
	}
}
