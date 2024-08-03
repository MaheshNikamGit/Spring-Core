package com.spring.beans;

public class HelloBean {
	static {
		System.out.println("HelloBean class loading...");
	}
	
	public HelloBean() {
		System.out.println("HelloBean class Instantiation...");
	}
	
	public String sayHello() {
		return "Hello user!";
	}
	
	/*
	 * static factory method to instantiate HelloBean class
	 * */
	public static HelloBean getBeanInstance() {
		System.out.println("Static Factory Method");
		return new HelloBean();
	}
}
