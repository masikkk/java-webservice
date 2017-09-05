package com.masikkk.jws.server.bean;

public class StudentRequest {
	private int id; //学号
	private int age; //年龄
	private String name; //姓名
	private String school; //学校
	private String city; //城市
	
	public StudentRequest(int id, int age, String name, String school, String city) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.school = school;
		this.city = city;
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
}
