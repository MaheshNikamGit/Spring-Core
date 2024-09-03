package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Employee employee = (Employee)context.getBean("employee");
		employee.getEmployeeDetails();
	}

}


/**
O/P 1 -

Employee Details
---------------------------
Employee Id    		: E-111
Employee Name    	: Vikrant Rona
Employee Salary    	: 35000
Employee Address    : Mumbai

Account Details
---------------------------
Account Number      : abc123
Account Name        : Java Spring
Account Type      	: Savings
Account Balance     : 250000

O/P 2 -

Employee Details
---------------------------
Employee Id    		: E-111
Employee Name    	: Vikrant Rona
Employee Salary    	: 35000
Employee Address    : Mumbai

Account Details
---------------------------
Account Number      : xyz123
Account Name        : Advance Java
Account Type      	: Current
Account Balance     : 350000
*/