package com.spring.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.HelloBean;
import com.spring.beans.StudentBean;
import com.spring.beans.SubjectBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Initialization & Destruction through "init" and "Destroy" methods
		 * */
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		HelloBean bean = (HelloBean)abstractApplicationContext.getBean("helloBean");
		System.out.println(bean.sayHello());
		abstractApplicationContext.registerShutdownHook(); // To call destroy method
		
		/*
		 * Initialization & Destruction through "InitializingBean" and "DisposableBean" callback interfaces
		 * */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		
		StudentBean studBean = (StudentBean)applicationContext.getBean("studBean");
		System.out.println(studBean.getStudentInformation());
		
		/*
		 * Initialization & Destruction through "@PostConstruct" and "@PreDestroy" annotations
		 * */
		SubjectBean subjectBean = (SubjectBean)applicationContext.getBean("subjectBean");
		System.out.println(subjectBean.getSubjectInformation());	
	}

}
