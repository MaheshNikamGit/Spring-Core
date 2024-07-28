package com.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.beans.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("/com/spring/resources/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee)factory.getBean("employeeBean");
		emp.getEmpDetails();
	}

}
