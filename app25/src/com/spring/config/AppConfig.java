package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.controller.StudentController;
import com.spring.controller.StudentControllerImpl;
import com.spring.dao.StudentDao;
import com.spring.dao.StudentDaoImpl;
import com.spring.service.StudentService;
import com.spring.service.StudentServiceImpl;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public OracleDataSource dataSource() {
		OracleDataSource dataSource = null;
		
		try {
			dataSource = new OracleDataSource();
			dataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			dataSource.setURL("system");
			dataSource.setPassword("admin");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return dataSource;
	}
	
	@Bean
	public StudentDao studentDao() {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao;
	}
	
	@Bean
	public StudentService studentService() {
		StudentService studentService = new StudentServiceImpl();
		return studentService;
	}
	
	@Bean
	public StudentController studentController() {
		StudentController studentController = new StudentControllerImpl();
		return studentController;
	}
	
	
}
