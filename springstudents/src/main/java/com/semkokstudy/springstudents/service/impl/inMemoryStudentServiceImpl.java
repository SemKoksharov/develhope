package com.semkokstudy.springstudents.service.impl;

import com.semkokstudy.springstudents.model.Student;
import com.semkokstudy.springstudents.repository.InMemoryStudentDAO;
import com.semkokstudy.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class inMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public void saveStudent(Student student) {
        repository.saveStudent(student);
    }

    @Override
    public Student finByEmail(String email) {
        return repository.finByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
