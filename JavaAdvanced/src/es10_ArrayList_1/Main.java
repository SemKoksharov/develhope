package es10_ArrayList_1;
/*
Esercizio
ArrayList - 1
dropdown menu
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */

import java.util.ArrayList;
import java.util.Arrays;


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

        //ho aggiunto ancora 4 studenti
        studenti.add(studente5);
        studenti.add(studente6);
        studenti.add(studente7);
        studenti.add(studente8);

        //stampo lista di studenti aggiornata
        System.out.println(studenti);


    }

}
