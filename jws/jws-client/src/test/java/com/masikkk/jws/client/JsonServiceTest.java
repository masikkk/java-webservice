package com.masikkk.jws.client;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.masikkk.jws.client.json.Group;
import com.masikkk.jws.client.json.JsonServiceImpl;
import com.masikkk.jws.client.json.JsonServiceImplService;

public class JsonServiceTest {
	@Test
	public void testqueryJson() {
		JsonServiceImplService jsonServiceImplService = new JsonServiceImplService();
		JsonServiceImpl jsonServiceImpl = jsonServiceImplService.getJsonServiceImplPort();
		String request = "{\"id\":0,\"name\":\"admin\",\"users\":[{\"id\":2,\"name\":\"guest\"},{\"id\":3,\"name\":\"root\"}]}";
		System.out.println("发送给服务器的json请求参数： " + request);
		String response = jsonServiceImpl.queryJson(request);
		System.out.println("服务器返回json结果： " + response);
		Group group = JSON.parseObject(response, Group.class);
		System.out.println("服务器返回结果解析为对象：");
		System.out.println(group.toString());
	}
}
