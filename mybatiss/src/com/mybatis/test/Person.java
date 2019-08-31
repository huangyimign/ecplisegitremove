package com.mybatis.test;

public class Person {
	private String username;
	private String password;
	private boolean sex;
	private int id;
	public Person() {
		
	}
	public Person(String username, String password,boolean sex,int id) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", password=" + password + ", sex=" + sex + ", id=" + id + "]";
	}
	
	
	
	
	
}	
