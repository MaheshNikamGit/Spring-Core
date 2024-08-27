package com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String sid;
	private String sname;
	private Address saddr;
	private List<String> squal;
	private Set<String> scourses;
	private Map<String, String> scourses_And_Faculty;
	private Properties scourses_And_Cost;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getSaddr() {
		return saddr;
	}
	public void setSaddr(Address saddr) {
		this.saddr = saddr;
	}
	public List<String> getSqual() {
		return squal;
	}
	public void setSqual(List<String> squal) {
		this.squal = squal;
	}
	public Set<String> getScourses() {
		return scourses;
	}
	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}
	public Map<String, String> getScourses_And_Faculty() {
		return scourses_And_Faculty;
	}
	public void setScourses_And_Faculty(Map<String, String> scourses_And_Faculty) {
		this.scourses_And_Faculty = scourses_And_Faculty;
	}
	public Properties getScourses_And_Cost() {
		return scourses_And_Cost;
	}
	public void setScourses_And_Cost(Properties scourses_And_Cost) {
		this.scourses_And_Cost = scourses_And_Cost;
	}
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("------------------------------");
		System.out.println("Student Id           :   "+ sid);
		System.out.println("Student Name         :   "+ sname);
		System.out.print("Student Qualifications : ");
		for (String qual : squal) {
			System.out.print(qual + " ");
		}
		System.out.println();
		System.out.print("Student Courses        : ");
		for (String course : scourses) {
			System.out.print(course + " ");
		}
		System.out.println();
		System.out.println("Student Courses and Faculty :" + scourses_And_Faculty);
		System.out.println("Student Courses and Cost :" + scourses_And_Cost);
		System.out.println("Student Address Details");
		System.out.println("------------------------------");
		System.out.println("Plot No    :" + saddr.getPno());
		System.out.println("Street     :" + saddr.getStreet());
		System.out.println("City       :" + saddr.getCity());
		System.out.println("State      :" + saddr.getState());
		System.out.println("Country    :" + saddr.getCountry());
		
	}
}
