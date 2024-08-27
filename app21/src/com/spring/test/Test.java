package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		
		// Constructor Dependency Injection
		Student student = (Student)context.getBean("studentBean");
		student.getStudentDetails();
		
		// Constructor Dependency injection using C-Namspace and parameter name
		Student student1 = (Student)context.getBean("studentBean1");
		student1.getStudentDetails();
		
		// Constructor Dependency injection using C-Namspace and parameter index
		Student student2 = (Student)context.getBean("studentBean2");
		student2.getStudentDetails();
				
	}

}

/*
 O/P
 
Student Details
---------------	---------
Student Id		: S-111
Student Name	: ABC
Student Address	: Mumbai
Course Details
Course Id		: C-111
Course Name		: Java
Course Cost		: 10000

Student Details
---------------	---------
Student Id		: S-222
Student Name	: XYZ
Student Address	: Pune
Course Details
Course Id		: C-222
Course Name		: Advance Java
Course Cost		: 7000

Student Details
---------------	---------
Student Id		: S-333
Student Name	: PQR
Student Address	: Satara
Course Details
Course Id		: C-333
Course Name		: Spring AND Spring Boot
Course Cost		: 5000

 */