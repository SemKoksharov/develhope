package es12_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // ho creato istanze di Frutta
        Frutta frutta = new Frutta("Banana");
        Frutta frutta1 = new Frutta("Kiwi");
        Frutta frutta2 = new Frutta("Mango");
        Frutta frutta3 = new Frutta("Pesca");
        Frutta frutta4 = new Frutta("Arancia");
        Frutta frutta5 = new Frutta("Mandarino");

        //ho creato LinkedList e ArrayList
        LinkedList<Frutta> fruttaLinkedList = new LinkedList<>(Arrays.asList(frutta, frutta1));
        ArrayList<Frutta> fruttaArrayList = new ArrayList<>(Arrays.asList(frutta4, frutta5));

        System.out.println(fruttaLinkedList);
        //ho aggiunto elementi a primo e ultimo posti
        fruttaLinkedList.addFirst(frutta2);
        fruttaLinkedList.addLast(frutta3);

        System.out.println("LinkedList aggiornata");
        System.out.println(fruttaLinkedList);

        // ho fatto una prova anche con addAll
        fruttaLinkedList.addAll(fruttaArrayList);

        System.out.println("Ho provato aggiungere fruttaArrayList in fruttaLinkedList");
        System.out.println(fruttaLinkedList);

    }
}
