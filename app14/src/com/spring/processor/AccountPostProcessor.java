package com.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.spring.beans.Account;

public class AccountPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		Account acc = (Account)bean;
		if(acc.getAccType() == null) {
			acc.setAccType("Saving");
		}
		return acc;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		// TODO Auto-generated method stub
		Account acc = (Account)bean;
		String email = acc.getAccHolderEmail();
		String mobileNo = acc.getAccHolderMobileNo();
		
		if(!email.contains("@")) {
			acc.setAccHolderEmail(email + "@gmail.com");
		}
		
		if(!mobileNo.startsWith("91-")) {
			acc.setAccHolderMobileNo("91-"+mobileNo);
		}
		
		return acc;
	}

}
