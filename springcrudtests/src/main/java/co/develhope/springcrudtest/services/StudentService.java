package co.develhope.springcrudtest.services;

import co.develhope.springcrudtest.entities.Student;
import co.develhope.springcrudtest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {

        //UN PO DI FANTASIA PER CAPIRE SE SI FA COSI
        //ASPETTO UN FEEDBACK

        List<Student> allNotNull = new ArrayList<>();

        allNotNull = studentRepository.findAll().stream()
                .filter(student -> student != null)
                .collect(Collectors.toList());

        return allNotNull;
    }

    public Optional<Student> getStudentById(Long id) {
        if (studentRepository.findById(id).isPresent()) {
            return studentRepository.findById(id);
        } else {
            return Optional.empty();
        }
    }

    public Student saveStudent(Student student) {
        if (student != null) {
            return studentRepository.save(student);
        } else {
            return null;
        }
    }

    public Optional<Student> updateIsWorking(Long id, Boolean working) {
        if (id > 0 && getStudentById(id).isPresent()) {
            return getStudentById(id).map(student -> {
                student.setWorking(working);
                return studentRepository.save(student);
            });
        } else {
            return Optional.empty();
        }
    }


    public Optional<Student> updateStudent(Long id, Student studentDetails) {
        if (id <= 0) {
            return Optional.empty();
        }
        if (getStudentById(id).isPresent()) {
            return studentRepository.findById(id).map(student -> {
                if (studentDetails.getName() != null) {
                    student.setName(studentDetails.getName());
                }
                if (studentDetails.getSurname() != null) {
                    student.setSurname(studentDetails.getSurname());
                }
                if (studentDetails.getWorking() != null) {
                    student.setWorking(studentDetails.getWorking());
                }
                return studentRepository.save(student);
            });
        } else {
            return Optional.empty();
        }


    }

    public boolean deleteStudentById(Long id) {
        return studentRepository.findById(id).map(student -> {
            studentRepository.delete(student);
            return true;
        }).orElse(false);
    }

    public void deleteAllStudents() {
        studentRepository.deleteAll();
    }
}


