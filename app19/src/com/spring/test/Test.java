package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Student student = (Student)context.getBean("studentBean");
		student.getStudentDetails();
	}

}

/*
 O/P
 
====== Constructor Dependency Injection =======
====== Setter Method Dependency Injection =======
Student Details
----------------------
Student Id		:S-111
Student Name	:MS Dhoni
Student Address	:Patna

Conclusion: If we use both Constructor Dependency Injection and Setter Method Dependency Injection to same bean class 
			then the final output values is of Setter Method Dependency Injection because it override to the values of  
 			Constructor Dependency Injection internally
 * */
