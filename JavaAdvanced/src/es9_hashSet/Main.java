package es9_hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5)); // ho creato HashSet
        readSetAndPrintElements(integers); // leggiamo e stampiamo HasSet
        System.out.println();

        Integer newInteger = 666; // ho creato nuovo oggetto dello stesso tipo
        System.out.println("Elemento " + newInteger + " `e stato aggiunto nell'HashSet ");
        integers.add(newInteger); // ho aggiungo nell'HashSet oggetto newInteger
        System.out.println();

        readSetAndPrintElements(integers); // leggiamo e stampiamo HasSet aggiornato
        System.out.println();
        integers.clear(); // pulisco set
        System.out.println(integers); // stampo risultato

        controllaPresenzaEdEliminare(integers, newInteger); // controllo che newInteger presente nel set
        readSetAndPrintElements(integers); // leggiamo e stampiamo HasSet aggiornato

    }

    public static HashSet<Integer> readSetAndPrintElements(HashSet<Integer> set) {
        int elementNum = 1;
        for (Integer element : set) {
            System.out.println("Element " + elementNum + ": " + element);
            elementNum++;
        }
        return set;
    }
    public static void controllaPresenzaEdEliminare(HashSet<Integer> set, Integer integer){
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            if (element.equals(integer)){
                iterator.remove();
                System.out.println("Elemento " + integer + " eliminato");
                System.out.println();
            }
        }
    }
}
