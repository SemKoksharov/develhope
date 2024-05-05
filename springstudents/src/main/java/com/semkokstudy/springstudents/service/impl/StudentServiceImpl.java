package com.semkokstudy.springstudents.service.impl;

import com.semkokstudy.springstudents.model.Student;
import com.semkokstudy.springstudents.repository.StudentRepository;
import com.semkokstudy.springstudents.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Primary
@AllArgsConstructor
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        repository.save(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
       return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudentByEmail(String email) {
        repository.deleteStudentByEmail(email);
    }
}
