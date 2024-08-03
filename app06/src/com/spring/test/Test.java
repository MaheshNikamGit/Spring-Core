package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");

		// Get bean by id
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		bean.sayHello();

		// Get bean by name
		HelloBean bean1 = (HelloBean) context.getBean("helloBean1");
		bean1.sayHello();

		// Get bean by name
		HelloBean bean2 = (HelloBean) context.getBean("helloBean2");
		bean2.sayHello();

		// Get bean by name
		HelloBean bean3 = (HelloBean) context.getBean("helloBean3");
		bean3.sayHello();

		// Get bean by name
		HelloBean bean4 = (HelloBean) context.getBean("helloBean4");
		bean4.sayHello();
	}

}

/**
 O/P
 
	Hello Mahesh!
	Hello Mahesh!
	Hello Mahesh!
	Hello Mahesh!
	Hello Mahesh!
 
 */
