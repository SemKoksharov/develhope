import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(123, "Luca", "Rossi",
                "Via dei cani maledetti");
        Student student1 = new Student(22, "Paolo", "Merde",
                "Via dei figli della putana");
        Corso a = new Corso("A",111);
        Corso b = new Corso("B",112);

        ArrayList<Corso> corsi = new ArrayList<>(Arrays.asList(a,b));
        a.aggStudent(student);
       // b.aggStudent(student1);
        a.tuttiStudenti();
        Corso.creditiDiCorsiTotali(corsi);
        a.checkStudentReg(student);
        b.checkStudentReg(student1);
        System.out.println("Risultato di ricerca: " + a.cercaStudente("123"));
    }

}