package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Course;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Course course = (Course)context.getBean("courseBean");
		course.getCourseDetails();
	}

}

/**
O/P
Course Details
--------------------------
Course Id		: C-111
Course Name		: Java Spring
Course Cost		: 5000

*/