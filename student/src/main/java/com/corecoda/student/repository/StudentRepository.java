package com.corecoda.student.repository;

import com.corecoda.student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllBySchoolId(String schoolId);
}
