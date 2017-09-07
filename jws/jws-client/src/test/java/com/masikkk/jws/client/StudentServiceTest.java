package com.masikkk.jws.client;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.masikkk.jws.client.bean.StudentRequest;
import com.masikkk.jws.client.bean.StudentResponse;
import com.masikkk.jws.client.bean.StudentServiceImpl;
import com.masikkk.jws.client.bean.StudentServiceImplService;

public class StudentServiceTest {
	@Test
	public void testqueryStudentResponse() {
		System.out.println("测试queryStudentResponse：");
		StudentServiceImplService studentServiceImplService = new StudentServiceImplService();
		StudentServiceImpl studentServiceImpl = studentServiceImplService.getStudentServiceImplPort();
		StudentResponse studentResponse = studentServiceImpl.queryStudentResponse(new StudentRequest(),"Java程序员");
		printStudentResponse(studentResponse);
	}

	@Test
	public void testqueryStudentResponsesList() {
		System.out.println("测试queryStudentResponsesList：");
		StudentServiceImplService studentServiceImplService = new StudentServiceImplService();
		StudentServiceImpl studentServiceImpl = studentServiceImplService.getStudentServiceImplPort();
		List<StudentResponse> studentResponseList = studentServiceImpl.queryStudentResponseList(new StudentRequest(),"Java程序员",4);
		printStudentResponse(studentResponseList);		
	}
	
	public void printStudentResponse(List<StudentResponse> studentResponsesList) {
		for (StudentResponse temp : studentResponsesList) {
			System.out.println(temp.getId()+", "+temp.getAge()+", "+temp.getName()+", "+temp.getSchool()+", "+temp.getCity()+", "+temp.getInfo());
		}
	}
	
	public void printStudentResponse(StudentResponse temp) {
		System.out.println(temp.getId()+", "+temp.getAge()+", "+temp.getName()+", "+temp.getSchool()+", "+temp.getCity()+", "+temp.getInfo());
	}	
}
