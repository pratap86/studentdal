package com.pratap.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.pratap.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
