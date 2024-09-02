package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Employee employee = (Employee)context.getBean("empBean");
		employee.getEmployeeDetails();
	}

}

/*
 O/P
 
 Employee Details
-------------------------
Employee Id			: E-111
Employee Name		: Anil
Employee Salary		: 25000.0

Account Details
-------------------------
Account Number		: xyz123
Account Name		: Anil
Account Type		: Savings
Account Balance		: 450000.0

Address Details
-------------------------
House No			: 102B
Street				: 23/245R
City				: Mumbai
State				: Maharashtra

 
 */