package com.example.demo.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudRepo;
import com.example.demo.Service.MyService;

@Component
public class ServiceImpl implements MyService
{
	@Autowired StudRepo studrepo;
	
	@Override
	public Student addStudent(Student student) 
	{
		Student stud=studrepo.save(student);
		return stud;
	}

	@Override
	public List<Student> getstudent()
	{
		
		return (List<Student>) studrepo.findAll();
	}

	@Override
	public Student updateStudent(Student student) 
	{
		
		return studrepo.save(student);
	}

	@Override
	public String deleteStudent(@PathVariable int id) 
	{
		Student stud=studrepo.getId(id);
		studrepo.delete(stud);
		return "Student Deleted";
	}

	@Override
	public Student getSingle(int id)
	{
		
		return studrepo.getId(id);
	}
	
}