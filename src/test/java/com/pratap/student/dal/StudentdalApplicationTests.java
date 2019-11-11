package com.pratap.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pratap.student.dal.entities.Student;
import com.pratap.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("microservices");
		student.setFee(30d);
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		if(student.isPresent()) {
			System.out.println(student.get());
		}
	}

	
	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentRepository.findById(1l);
		if(student.isPresent()) {
			Student std = student.get();
			std.setFee(40d);
			studentRepository.save(std);
		}
	}

}
