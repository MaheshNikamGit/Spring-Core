package com.spring.beans;

public class HelloBean {
	private String name;
	static {
		System.out.println("HelloBean class loading...");
	}
	
	public HelloBean() {
		System.out.println("HelloBean class Instantiation...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello "+this.name+", Goodmorning!";
	}
}
