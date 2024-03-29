package Es11_Arraylist_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Main {

    public static void main(String[] args) {

        //ho creato 4 studenti
        Studente studente1 = new Studente("Vasya", 20);
        Studente studente2 = new Studente("Petya", 27);
        Studente studente3 = new Studente("Vanya", 24);
        Studente studente4 = new Studente("Katya", 21);

        //Inizializzato e riempito ArrayList
        ArrayList<Studente> studenti = new ArrayList<>(Arrays.asList(studente1, studente2, studente3, studente4));

        //stampo lista di studenti
        System.out.println(studenti);
        System.out.println();

        Studente studente5 = new Studente("Alena", 26);
        Studente studente6 = new Studente("Ksenia", 27);
        Studente studente7 = new Studente("Vova", 25);
        Studente studente8 = new Studente("Natasha", 20);
        Studente studente9 = new Studente("Roma", 18);
        Studente studente10 = new Studente("Sergei", 23);
        Studente studente11 = new Studente("Pasha", 30);
        Studente studente12 = new Studente("Alla", 28);


        //ho aggiunto ancora 8 studenti
        studenti.add(studente5);
        studenti.add(studente6);
        studenti.add(studente7);
        studenti.add(studente8);
        studenti.add(studente9);
        studenti.add(studente10);
        studenti.add(studente11);
        studenti.add(studente12);

        //stampo lista di studenti aggiornata
        System.out.println("Lista aggiornata");
        System.out.println(studenti);
        System.out.println();

        //ho creato comparator per confrontare eta di oggetti tipo Studente
        Comparator<Studente> byAge = new Comparator<Studente>() {
            @Override
            public int compare(Studente o1, Studente o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        //ho ordinato lista per eta e la stampato
        Collections.sort(studenti, byAge);
        System.out.println("Lista ordinata per eta:");
        System.out.println(studenti);
    }

}
