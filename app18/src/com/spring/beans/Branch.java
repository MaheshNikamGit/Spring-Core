package com.spring.beans;

public class Branch {
	private Student student;
	
	/*
	  public Branch(Student student) { this.student = student; }
	 */
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getBranchName() {
		System.out.println("Computer Science");
	}

}
