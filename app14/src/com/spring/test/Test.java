package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Account;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new  ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Account account = (Account)context.getBean("accBean");
		account.getAccountDetails();
	}

}
