package com.masikkk.jws.server.bean;

public class StudentResponse {
	private int id = 0; //学号
	private int age = 0; //年龄
	private String name = "default"; //姓名
	private String school = "default"; //学校
	private String city = "default"; //城市
	private String info = "default"; //个人介绍

	public StudentResponse() {
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
