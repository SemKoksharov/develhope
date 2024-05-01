package com.semkokstudy.springstudents.service;

import com.semkokstudy.springstudents.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();

    void saveStudent(Student student);
    Student finByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
