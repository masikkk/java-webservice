package com.masikkk.jws.server.bean;

import java.util.List;

public interface StudentService {
	//根据请求参数studentRequest查询1个学生
	StudentResponse queryStudentResponse(StudentRequest studentRequest);
	
	//根据请求参数studentRequest查询多个学生
	List<StudentResponse> queryStudentResponsesList(StudentRequest studentRequest);
}
