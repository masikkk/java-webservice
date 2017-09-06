package com.masikkk.jws.server.bean;

//查询结果实体
public class StudentResponse {
	private int id; //学号
	private int age; //年龄
	private String name; //姓名
	private String school; //学校
	private String city; //城市
	private String info; //个人介绍

	public StudentResponse() {
		this.id = 0;
		this.age = 0;
		this.name = "default";
		this.school = "default";
		this.city = "default";
		this.info = "default";
	}
	
	public StudentResponse(int id, int age, String name, String school, String city, String info) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.school = school;
		this.city = city;
		this.info = info;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
