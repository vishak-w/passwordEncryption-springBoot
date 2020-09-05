package com.password.passDecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.password.passDecode.dto.StudentDto;
import com.password.passDecode.entity.Student;
import com.password.passDecode.service.StudentService;
import com.sun.el.stream.Optional;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	@RequestMapping(value="/register")
	public void save(@RequestBody StudentDto student)
	{
		service.addDetails(student);
		
	}
	
	@RequestMapping(value="/getStudent")
	
	public List<Student> getStudent()
	{
		 List<Student> list=service.getStudent();
		return list;
	}

}
