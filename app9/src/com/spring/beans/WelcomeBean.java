package com.spring.beans;

public class WelcomeBean {
	private String name;
	
	static {
		System.out.println("WelcomeBean class loading...");
	}
	
	public WelcomeBean() {
		System.out.println("WelcomeBean class Instantiation...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWelcomeMessage() {
		return "Hello "+this.name+"!, Welcome to Java Spring";
	}
}
