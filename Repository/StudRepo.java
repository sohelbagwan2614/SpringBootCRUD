package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student;

@Repository
public interface StudRepo extends JpaRepository<Student, Integer>
{
	@Query(value="select * from student where id=?1",nativeQuery = true)
	Student getId(int id);
	
}
