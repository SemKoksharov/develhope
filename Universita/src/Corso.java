import java.util.ArrayList;

public class Corso {

    private String nome;
    private int creditiFormativi;
    private ArrayList<Student> studentiIscritti = new ArrayList<Student>();

    public Corso(String nome, int creditiFormativi) {
        this.nome = nome;
        this.creditiFormativi = creditiFormativi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditiFormativi() {
        return creditiFormativi;
    }

    public void setCreditiFormativi(int creditiFormativi) {
        this.creditiFormativi = creditiFormativi;
    }

    public ArrayList<Student> getStudentiIscritti() {
        return studentiIscritti;
    }

    public void setStudentiIscritti(ArrayList<Student> studentiIscritti) {
        this.studentiIscritti = studentiIscritti;
    }

    public void tuttiStudenti() {
        System.out.println(studentiIscritti);
    }

    public void aggStudent(Student student) {
        studentiIscritti.add(student);
    }

    public static void creditiDiCorsiTotali(ArrayList<Corso> corsoArrayList) {
        int result = 0;
        for (Corso corso : corsoArrayList) {
            result += corso.getCreditiFormativi();
        }
        System.out.println("Crediti totali di tutti corsi: " + result);

    }

    public void checkStudentReg(Student student) {
        if (studentiIscritti.contains(student)) {
            System.out.println("Studente " + student.getNome() + ' ' +
                    student.getCognome() + " presente sul corso " + this.nome);
        } else {
            System.out.println("Studente " + student.getNome() + ' ' +
                    student.getCognome() + " non presente sul corso " + this.nome);
        }
    }
    public ArrayList<Student> cercaStudente(String keySearch) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : studentiIscritti) {
            if (student.toString().toLowerCase().contains(keySearch.toLowerCase())){
                result.add(student);
            }
        }
        return result;
    }
}
