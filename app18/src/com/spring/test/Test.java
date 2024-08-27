package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Branch;
import com.spring.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		
		Student student = (Student)context.getBean("studBean");
		student.getStudentName();
		
		Branch branch = (Branch)context.getBean("branchBean");
		branch.getBranchName();
	}

}

/*
 O/P
 
Vikrant Rona
Computer Science


Conclusion - Constructor dependency injection is not supported to Circular Dependency Injection 
			but Setter Method dependency injection is supported to Circular Dependency Injection       
 */


