package com.masikkk.jws.server.simple;

import java.util.List;

public interface HelloService {
	//返回你好
	public String sayHello();
	
	//返回你好+姓名
	public String sayHelloName(String name);
	
	//返回由length个name构成的字符串数组
	public List<String> sayHelloList(String name, int length);
	
	//被隐藏的方法
	public String hideMethod();
}
