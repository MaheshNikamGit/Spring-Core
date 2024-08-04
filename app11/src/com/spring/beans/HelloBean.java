package com.spring.beans;

public class HelloBean {
	private String name;
	private String message;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("HelloBean - setName() method");
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("HelloBean - setMessage() method");
		this.message = message;
	}
	
	public void init() {
		System.out.println("HelloBean - init() method");
		name = "Java";
		message = "Good afternoon";
	}
	
	public void destroy() {
		System.out.println("HelloBean - destroy() method");
		name = "";
		message = "";
	}
	
	public String sayHello() {
		return "Hello "+name+", "+message;
	}
	
	
}
