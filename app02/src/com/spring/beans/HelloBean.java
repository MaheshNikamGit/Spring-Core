package com.spring.beans;

public class HelloBean {
	private String name;
	
	public String sayHello() {
		return "Hello " + this.name + "!"; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
