package com.masikkk.jws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {
	public String sayHello() {
		return "你好！";
	}

	public String sayHelloName(String name) {
		return "你好，"+name;
	}
}
