

public class Main {
    public static void main(String[] args) {

        Corso corsoA = new Corso("inglese", 6);
        Corso corsoB = new Corso("informatica", 8);
        Corso corsoC = new Corso("storia della filosofia",4);


        Studente studente1 = new Studente("Giorgio", "Albertazzi");
        Studente studente2 = new Studente("Vladimir", "Putin");
        Studente studente3 = new Studente("Giorgio", "Vanni");
        corsoB.aggiungiStudente(studente1);
        corsoB.controllaStudente(studente1);
        corsoA.aggiungiStudente(studente2);
        corsoA.controllaStudente(studente2);
        corsoC.aggiungiStudente(studente3);
        corsoC.controllaStudente(studente3);


        corsoA.listaStudenti();
        corsoB.listaStudenti();
        corsoC.cercaStudente("giorgio");
        corsoA.listaStudenti();
        corsoA.eliminaStudente(studente2);
        corsoA.listaStudenti();
    }
}
