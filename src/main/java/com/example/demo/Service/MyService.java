package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;

@Service
public interface MyService 
{
	public Student addStudent(Student student);
	public List<Student> getstudent();
	public Student getSingle(int id);
	public Student updateStudent(Student student);
	public String deleteStudent(int id);
	
}
