package co.develhope.springcrudtest.controllers;

import co.develhope.springcrudtest.entities.Student;
import co.develhope.springcrudtest.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        Optional<Student> student = studentService.getStudentById(id);
        return student.isPresent() ? ResponseEntity.ok(student.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        return savedStudent != null ? ResponseEntity.ok(savedStudent) : ResponseEntity.badRequest().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        Optional<Student> updatedStudent = studentService.updateStudent(id, studentDetails);
        return updatedStudent.isPresent() ? ResponseEntity.ok(updatedStudent.get()) : ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}/working")
    public ResponseEntity<?> updateIsWorking(@PathVariable Long id, @RequestParam Boolean working) {
        Optional<Student> updatedStudent = studentService.updateIsWorking(id, working);
        return updatedStudent.isPresent() ? ResponseEntity.ok(updatedStudent.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Long id) {
        boolean isDeleted = studentService.deleteStudentById(id);
        return isDeleted ? ResponseEntity.ok().body("Student deleted") : ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllStudents() {
        studentService.deleteAllStudents();
        return ResponseEntity.ok().body("Deleted all students");
    }
}
