package com.spring.beans;

public class Course {
	private String cId;
	private String cName;
	private int cCost;
	
	public Course(String cId, String cName, int cCost) {
		this.cId = cId;
		this.cName = cName;
		this.cCost = cCost;
	}
	
	
	public void getCourseDetails() {
		System.out.println("Course Details");
		System.out.println("--------------------------");
		System.out.println("Course Id		: "+ cId);
		System.out.println("Course Name		: "+ cName);
		System.out.println("Course Cost		: "+cCost);
	}
}
