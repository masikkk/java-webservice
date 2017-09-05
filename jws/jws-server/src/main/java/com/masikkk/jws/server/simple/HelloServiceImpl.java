package com.masikkk.jws.server.simple;

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

	@WebMethod(exclude=true)
	public String hideMethod() {
		return "此方法被exclude隐藏";
	}
}
