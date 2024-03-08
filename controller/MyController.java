package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.MyService;

@RestController
public class MyController 
{
	@Autowired MyService service;
	
	@PostMapping("/addstudent")
	public boolean addStudent(@RequestBody Student student)
	{
		System.out.println("Student Added Successfully"+student);
		service.addStudent(student);
		return true;
	}
	
	@GetMapping("/getstudents")
	public List<Student> getStudents(Student student)
	{
		return service.getstudent();
	}
	
	@GetMapping("/getsingle/{studentId}")
	public Student getsingle(@PathVariable int studentId)
	{
		return service.getSingle(studentId);
	}
	

	@PutMapping("/updatestudent")
	public Student updateStudent(Student student)
	{
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/deletestudent/{studentId}")
	public String deleteStudent(@PathVariable int studentId)
	{
		
		try {
				service.deleteStudent(studentId);
				return "Student Deleted";
			} 
			catch (Exception e)
		{
			e.printStackTrace();
			return "";
		}
		
		
	}
}
