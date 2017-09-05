package com.masikkk.jws.server.simple;

import javax.xml.ws.Endpoint;

public class ServerMain {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8899/HelloService", new HelloServiceImpl());
		System.out.println("HelloService发布成功，WSDL地址：http://localhost:8899/HelloService?wsdl");
	}
}
