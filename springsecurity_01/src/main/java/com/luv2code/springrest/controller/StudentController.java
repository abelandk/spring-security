package com.luv2code.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springrest.students.Students;

@RestController
@RequestMapping("/api")
public class StudentController {

	List<Students> students = new ArrayList<>();
	
	@PostConstruct
	public void loadData() {
		
		//@PostConstruct is only called once
		students.add(new Students("Abebe", "Ayele"));
		students.add(new Students("Kebede", "demeke"));
		students.add(new Students("Alemu", "Serawit"));
		students.add(new Students("Alemayehu", "Kebede"));
		students.add(new Students("Zinaw", "Bekele"));
	}
	@GetMapping("/students")
	public List<Students> getStudents() {
		
		return students;
	}
	
	@GetMapping("/students/{studentId}")
	public Students getStudent(@PathVariable int studentId) {
		
		if(studentId > students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student Id not found: " + studentId);
		}
		return students.get(studentId);
	}
}
