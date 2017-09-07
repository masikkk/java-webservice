package com.masikkk.jws.server.simple;

import javax.xml.ws.Endpoint;

public class HelloServiceMain {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8899/HelloService", new HelloServiceImpl());
		System.out.println("HelloService发布成功，WSDL地址：http://localhost:8899/HelloService?wsdl");
		System.out.println("使用JDK中的wsimport工具的如下命令生成客户端代码：");
		System.out.println("wsimport -keep -p com.masikkk.jws.client.simple http://localhost:8899/HelloService?wsdl");		
	}
}
