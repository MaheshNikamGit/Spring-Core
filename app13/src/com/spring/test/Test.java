package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Employee employee = (Employee)context.getBean("empBean");
		employee.getEmpDetails();
				
	}

}
