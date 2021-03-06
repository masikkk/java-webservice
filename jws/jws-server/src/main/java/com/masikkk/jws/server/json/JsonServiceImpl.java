package com.masikkk.jws.server.json;

import javax.jws.WebService;

import com.alibaba.fastjson.JSON;

@WebService
public class JsonServiceImpl implements JsonService {
	//查询方法，输入输出都是json串
	public String queryJson(String request) {
		System.out.println("收到的客户端请求参数： " + request);
		Group groupRequest = JSON.parseObject(request, Group.class); //解析Json串为Group对象
		System.out.println("请求参数解析为对象： ");
		System.out.println(groupRequest.toString());
		
		Group groupResponse = new Group(222L,"com.masikkk");
		User guestUser = new User(333L,"masikkk_guest");
		User rootUser = new User(444L,"masikkk_admin");
		groupResponse.addUser(guestUser);
		groupResponse.addUser(rootUser);
		
		String responseString = JSON.toJSONString(groupResponse);
		System.out.println("返回给客户端的结果： " + responseString);
		
		return responseString;
	}
}
