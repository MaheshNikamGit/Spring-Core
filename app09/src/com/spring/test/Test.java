package com.spring.test;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.HelloBean;
import com.spring.beans.WelcomeBean;
import com.spring.config.AppConfig;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		WelcomeBean welBean1 = (WelcomeBean)context.getBean("welcomeBean");
		System.out.println(welBean1.getWelcomeMessage());
		
		WelcomeBean welBean2 = (WelcomeBean)context.getBean(WelcomeBean.class);
		System.out.println(welBean2.getWelcomeMessage());

		System.out.println(welBean1);
		System.out.println(welBean2);
		
		System.out.println(welBean1 == welBean2);
		
		HelloBean helloBean = (HelloBean)context.getBean("helloBean");
		System.out.println(helloBean.sayHello());
		
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName: beanNames) {
			System.out.println(beanName);
		}
	}

}

/**
 O/P
 
 AppConfig class loading...
AppConfig class Instantiation...
WelcomeBean class loading...
WelcomeBean class Instantiation...
HelloBean class loading...
HelloBean class Instantiation...
Hello Spring!, Welcome to Java Spring
Hello Spring!, Welcome to Java Spring
com.spring.beans.WelcomeBean@1bb266b3
com.spring.beans.WelcomeBean@1bb266b3
true
Hello Spring, Goodmorning!
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.annotation.internalRequiredAnnotationProcessor
org.springframework.context.event.internalEventListenerProcessor
org.springframework.context.event.internalEventListenerFactory
appConfig
welcomeBean
helloBean
 
 */
