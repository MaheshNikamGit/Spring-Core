package com.spring.scopes;

import java.util.HashMap;

public class CustomThreadLocal extends ThreadLocal<Object> {
	@Override
	protected Object initialValue() {
		// TODO Auto-generated method stub
		return new HashMap<String, Object>();
	}
}
