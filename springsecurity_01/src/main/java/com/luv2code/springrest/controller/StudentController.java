package com.luv2code.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springrest.students.Students;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("/students")
	public List<Students> getStudents() {
		 
		List<Students> students = new ArrayList<>();
		students.add(new Students("Abebe", "Ayele"));
		students.add(new Students("Kebede", "demeke"));
		students.add(new Students("Alemu", "Serawit"));
		students.add(new Students("Alemayehu", "Kebede"));
		students.add(new Students("Zinaw", "Bekele"));
		return students;
	}
}
