package com.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.HelloBean;
import com.spring.beans.WelcomeBean;

//@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig class loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig class Instantiation...");
	}
	
	@Bean
	public WelcomeBean welcomeBean() {
		WelcomeBean welcomeBean = new WelcomeBean();
		welcomeBean.setName("Spring");
		return welcomeBean;
	}
	
	@Bean
	public HelloBean helloBean() {
		HelloBean helloBean = new  HelloBean();
		helloBean.setName("Spring");
		return helloBean;
	}
}
