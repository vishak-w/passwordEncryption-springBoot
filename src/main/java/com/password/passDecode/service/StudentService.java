package com.password.passDecode.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.password.passDecode.dto.AddressDto;
import com.password.passDecode.dto.StudentDto;
import com.password.passDecode.entity.Address;
import com.password.passDecode.entity.Student;
import com.password.passDecode.jparepo.StudentRepo;

@Service
public class StudentService {

	
	@Autowired
	StudentRepo repo;
	
	@Autowired
	PasswordEncoder bryEncoder;
	ModelMapper mapper=new ModelMapper();
	
	
	public void addDetails(StudentDto student)
	{
		Address add=new Address();
		Student studentEntity=new Student();
		AddressDto addDto=new AddressDto();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		String pass=bryEncoder.encode(student.getAddress().getPassword());
		System.out.println("encrypted password....."+pass);
		addDto.setPassword(pass);
		addDto.setAddress(student.getAddress().getAddress());
		student.setAddress(addDto);
		//studentEntity.setAddress(add);
		mapper.map(student, studentEntity);
		repo.save(studentEntity);
	}
	public List<Student> getStudent()
	{
		List<Student> student=repo.findAll();
		
		return student;
		
	}
}
