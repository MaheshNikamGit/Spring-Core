package com.spring.beans;

public class Student {
	private Branch branch;
	
	/*
	 public Student(Branch branch) { this.branch = branch; }
	 */
	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	public void getStudentName() {
		System.out.println("Vikrant Rona");
	}

	
}
