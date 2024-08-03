package com.spring.beans;

public class Student {
	private int sId;
	private String sName;
	private String sAddr;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	
	public void getStudentInfo() {
		System.out.println("Student Information");
		System.out.println("------------------------");
		System.out.println("Student Id			:" + this.sId);
		System.out.println("Student Name		:" + this.sName);
		System.out.println("Student Address		:" + this.sAddr);
	}
	
}
