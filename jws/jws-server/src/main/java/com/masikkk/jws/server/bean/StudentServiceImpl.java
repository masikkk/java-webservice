package com.masikkk.jws.server.bean;

import javax.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService
public class StudentServiceImpl implements StudentService {
	//根据请求参数studentRequest和info生成1个学生实例并返回
	public StudentResponse queryStudentResponse(StudentRequest studentRequest, String info) {
		int id = studentRequest.getId();
		int age = studentRequest.getAge();
		String name = studentRequest.getName();
		String school = studentRequest.getSchool();
		String city = studentRequest.getCity();
		StudentResponse studentResponse = new StudentResponse(id,age,name,school,city,info);
		return studentResponse;
	}

	//根据请求参数studentRequest和info生成num个学生实例并返回
	public List<StudentResponse> queryStudentResponseList(StudentRequest studentRequest, String info, int num) {
		List<StudentResponse> studentResponsesList = new ArrayList<StudentResponse>();
		for (int i = 0; i < num; i++) {
			int id = studentRequest.getId()+i;
			int age = studentRequest.getAge()+i;
			String name = studentRequest.getName()+i;
			String school = studentRequest.getSchool()+i;
			String city = studentRequest.getCity()+i;
			StudentResponse studentResponse = new StudentResponse(id,age,name,school,city,info+i);			
			studentResponsesList.add(studentResponse);
		}
		return studentResponsesList;
	}

}
