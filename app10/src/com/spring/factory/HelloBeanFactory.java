package com.spring.factory;

import com.spring.beans.HelloBean;

public class HelloBeanFactory {
	public HelloBean getHelloBeanInstance() {
		System.out.println("getHelloBeanInstance --> HelloBeanFactory");
		return new HelloBean(); 
	}
}
