package es7_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        readSetAndPrintElements(integers);

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
