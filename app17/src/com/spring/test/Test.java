package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Student student =  (Student)context.getBean("studentBean");
		student.getStudentDetails(); 
	}

}

/*
 O/P
 
Student Details
------------------------------
Student Id           :   S-111
Student Name         :   Jojo
Student Qualifications : BTech MTech PHD 
Student Courses        : C C++ java Python 
Student Courses and Faculty :{c=K.K.Mishra, c++=Sharma, java=Rathore, python=Vikram}
Student Courses and Cost :{Java=5000, python=7000, c++=2000, c=1000}
Student Address Details
------------------------------
Plot No    :23/3rt
Street     :MG Road
City       :Pune
State      :Maharashtra
Country    :India

 
 */