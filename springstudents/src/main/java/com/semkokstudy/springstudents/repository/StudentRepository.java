package com.semkokstudy.springstudents.repository;

import com.semkokstudy.springstudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    String deleteStudentByEmail(String email);

    Student findStudentByEmail(String email);
}
