package com.masikkk.jws.server.bean;

import java.util.List;

public interface StudentService {
	//根据请求参数studentRequest和info生成1个学生实例并返回
	public StudentResponse queryStudentResponse(StudentRequest studentRequest, String info);
	
	//根据请求参数studentRequest和info生成num个学生实例并返回
	public List<StudentResponse> queryStudentResponseList(StudentRequest studentRequest, String info, int num);
}
