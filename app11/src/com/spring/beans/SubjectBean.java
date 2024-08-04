package com.spring.beans;

public class SubjectBean {
	private String subjectName;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectInformation() {
		return "Subject: " + subjectName;
	}
	
	//@PostConstruct
	public void initializeBean() {
		System.out.println("Initialization through @PostConstruct annotation");
		subjectName = "Computer Programming";
	}
	
	//@PreDestroy
	public void destroyBean() {
		System.out.println("Bean destruction through @Predestory annotation");
	}
}
