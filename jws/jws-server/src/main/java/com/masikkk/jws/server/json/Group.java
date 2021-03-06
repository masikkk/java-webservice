package com.masikkk.jws.server.json;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Long id;
    private String name;
    private List<User> users;

    public Group() {
    	this.id = 0L;
    	this.name = "default";
    	this.users = new ArrayList<User>();
    }
    
    public Group(Long id, String name) {
    	this.id = id;
    	this.name = name;
    	this.users = new ArrayList<User>();
    }    
    
    public Group(Long id, String name, List<User> users) {
    	this.id = id;
    	this.name = name;
    	this.users = users;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public void addUser(User user) {
        users.add(user);
    }
    
    public String toString() {
    	String resultString = "group id: " + id + "\n";
    	resultString += "group name: " + name + "\n";
    	resultString += "users: " + "\n";
    	for (User user : users) {
			resultString += "     id: "+user.getId()+", name: "+user.getName()+"\n";
		}
    	return resultString;
    }
    
}
