package com.masikkk.jws.server.simple;

import java.util.ArrayList;
import java.util.List;

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

	//返回由length个name构成的字符串数组
	public List<String> sayHelloList(String name, int length) {
		List<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < length; i++) {
			arrayList.add(name+"."+i);
		}
		return arrayList;
	}
}
