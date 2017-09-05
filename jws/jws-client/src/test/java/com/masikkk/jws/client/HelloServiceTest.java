package com.masikkk.jws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;

import com.masikkk.jws.client.simple.HelloServiceImpl;
import com.masikkk.jws.client.simple.HelloServiceImplService;

public class HelloServiceTest {
	@Test
	public void testHelloService(){
		System.out.println("默认URL测试：");
		HelloServiceImplService helloServiceImplService = new HelloServiceImplService();//默认URL
		HelloServiceImpl helloServiceImpl = helloServiceImplService.getHelloServiceImplPort();
		List<String> arrayList = helloServiceImpl.sayHelloList("masikkk", 5);
		System.out.println(helloServiceImpl.sayHello());
		System.out.println(helloServiceImpl.sayHelloName("masikkk"));
		System.out.println(arrayList);
	}
	
	@Test
	public void testHelloServiceURL() throws MalformedURLException{
		System.out.println("指定URL测试：");
		URL url = new URL("http://localhost:8899/HelloService?wsdl");
		HelloServiceImplService helloServiceImplService = new HelloServiceImplService(url);//指定URL
		HelloServiceImpl helloServiceImpl = helloServiceImplService.getHelloServiceImplPort();
		List<String> arrayList = helloServiceImpl.sayHelloList("masikkk", 5);		
		System.out.println(helloServiceImpl.sayHello());
		System.out.println(helloServiceImpl.sayHelloName("masikkk"));	
		System.out.println(arrayList);
	}
}
