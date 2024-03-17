package es8_hashset;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        HashSet<Integer> integers = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5)); // ho creato HashSet
        readSetAndPrintElements(integers); // leggiamo e stampiamo HasSet
        System.out.println();
        Integer newInteger = 666;
        integers.add(newInteger); // ho aggiungo un nuovo elem.
        System.out.println("Elemento " + newInteger + " `e stato aggiunto nell'HashSet "+ integers);
        System.out.println();
        readSetAndPrintElements(integers); // leggiamo e stampiamo HasSet aggiornato
    }

    public static HashSet<Integer> readSetAndPrintElements(HashSet<Integer> set){
        int idx = 1;
        for (Integer element : set){
            System.out.println("Element " + idx+": "+ element);
            idx++;
        }
        return set;
    }
}
