package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Employee emp = (Employee)context.getBean("empBean");
		emp.getEmployeeDetails();
	}
}

/*
 O/P
 
 Employee Details
------------------------
Employee Id		: E-222
Employee Name	: XYZ
Employee Salary	: 35000.0
Employee Address: Pune
Employee Account Details
------------------------
Account Number	: xyz9999
Account Name	: XYZ
Account Type	: Current
Account Balance	: 75000.0
 
 */