package com.semkokstudy.springstudents.controller;

import com.semkokstudy.springstudents.model.Student;

import com.semkokstudy.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students/")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudent() {
        //todo закончить метод
        return studentService.findAllStudents();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "------------ Success! ------------" +
                "\nSaved Student: " + student.getName() + " " + student.getSurname()+ " " +
                "\nEmail: " + student.getEmail();
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return studentService.finByEmail(email);
    }

    @PutMapping
    public Student updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    private void deleteStudent(@PathVariable("email") String email) {
        studentService.deleteStudent(email);
    }


}
