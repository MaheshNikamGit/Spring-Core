package com.spring.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.dto.Student;
import com.spring.service.StudentService;

@Controller("studentController")
public class StudentControllerImpl implements StudentController {

	BufferedReader br = null;
	
	@Autowired
	private StudentService studentService;
	
	public StudentControllerImpl() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void addStudent() {
		try {
			System.out.println("Student Id		: ");
			String sid = br.readLine();
			System.out.println("Student Name	: ");
			String sname = br.readLine();
			System.out.println("Student Address	: ");
			String saddr = br.readLine();
			
			Student student = new Student();
			student.setSid(sid);
			student.setSname(sname);
			student.setSaddr(saddr);
			
			String status = studentService.addStudent(student);
			
			if(status.equals("existed")) {
				System.out.println("Student already existed");
			}
			
			if(status.equals("success")) {
				System.out.println("Student insertion success");
			}
			
			if(status.equals("failure")) {
				System.out.println("Student insertion failure");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void searchStudent() {
		try {
			System.out.println("Student Id	: ");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			
			if(student == null) {
				System.out.println("Student not existed");
			} else {
				System.out.println("Student Details");
				System.out.println("----------------------");
				System.out.println("Studen Id      : " + student.getSid());
				System.out.println("Studen Name    : " + student.getSname());
				System.out.println("Studen Address : " + student.getSaddr());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateStudent() {
		try {
			System.out.println("Student Id	: ");
			String sid = br.readLine();
			Student student = studentService.searchStudent(sid);
			if(student == null) {
				System.out.println("Student not existed");
			} else {		
				//System.out.println("Student Id		:	" + student.getSid());
				System.out.print("Student Name		:	Old Value	: " + student.getSname() + "	New Value	:");
				String sname = br.readLine();
				System.out.print("Student Address	:	Old Value	: " + student.getSaddr() + "	New Value	:");
				String saddr = br.readLine();
				student.setSname(sname);
				student.setSaddr(saddr);
				
				String status = studentService.updateStudent(student);
				
				if(status.equals("success")) {
					System.out.println("Student updated successfully");
				} else {
					System.out.println("Failed to update student");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent() {
		try {
			System.out.println("Student Id	: ");
			String sid = br.readLine();
			String status = studentService.deleteStudent(sid);
			
			if(status.equals("success")) {
				System.out.println("Student deleted successfully");
			} else if(status.equals("failure")) {
				System.out.println("Student deletion failed");
			} else if(status.equals("notexisted")) {
				System.out.println("Student not existed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
