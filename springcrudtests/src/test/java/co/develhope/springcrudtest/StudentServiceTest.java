package co.develhope.springcrudtest;

import co.develhope.springcrudtest.entities.Student;
import co.develhope.springcrudtest.repositories.StudentRepository;
import co.develhope.springcrudtest.services.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(value = "test")
public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void setStudentService() {

        Student student = new Student();
        student.setName("Sem");
        student.setSurname("Kok");
        student.setWorking(true);

        Student studentDB = studentRepository.save(student);
        assertThat(studentDB.getId()).isNotNull();

        Student studentFromService = studentService.updateIsWorking(student.getId(), false).get();
        assertThat(studentFromService.getId()).isNotNull();
        assertThat(studentFromService.getWorking()).isFalse();

        Student stufentFromRepo = studentRepository.findById(student.getId()).get();
        assertThat(stufentFromRepo.getId()).isNotNull();
        assertThat(stufentFromRepo).isNotNull();
        assertThat(stufentFromRepo.getWorking()).isFalse();
        assertThat(stufentFromRepo.getId()).isEqualTo(studentDB.getId());
        assertThat(stufentFromRepo.getId()).isEqualTo(student.getId());
    }
}
