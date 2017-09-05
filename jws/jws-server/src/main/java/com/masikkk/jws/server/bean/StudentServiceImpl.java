package com.masikkk.jws.server.bean;

import javax.jws.WebService;
import java.util.List;

@WebService
public class StudentServiceImpl implements StudentService {
	//根据请求参数studentRequest查询1个学生
	public StudentResponse queryStudentResponse(StudentRequest studentRequest) {
		StudentResponse studentResponse = new StudentResponse();
		return studentResponse;
	}

	//根据请求参数studentRequest查询多个学生
	public List<StudentResponse> queryStudentResponsesList(StudentRequest studentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
