package com.masikkk.jws.server.json;

import javax.xml.ws.Endpoint;

public class JsonServiceMain {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8899/JsonService", new JsonServiceImpl());
		System.out.println("JsonService发布成功，WSDL地址：http://localhost:8899/JsonService?wsdl");
		System.out.println("使用JDK中的wsimport工具的如下命令生成客户端代码：");
		System.out.println("wsimport -keep -p com.masikkk.jws.client.json http://localhost:8899/JsonService?wsdl");
	}
}
