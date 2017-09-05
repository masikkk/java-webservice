package com.masikkk.jws.server;

public interface HelloService {
	//返回你好
	public String sayHello();
	
	//返回你好+姓名
	public String sayHelloName(String name);
	
	//被隐藏的方法
	public String hideMethod();
}
