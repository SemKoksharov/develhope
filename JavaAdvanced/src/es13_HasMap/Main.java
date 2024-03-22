package es13_HasMap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[]args){

        Frutta frutta1 = new Frutta("Banana");
        Frutta frutta2 = new Frutta("Arancia");
        Frutta frutta3 = new Frutta("Kiwi");


        Map<String, Frutta> fruttaMap = new HashMap<>();

        fruttaMap.put("Giallo", frutta1);
        fruttaMap.put("Arancione", frutta2);
        fruttaMap.put("Verde", frutta3);


        Map<String, Frutta> fruttaMap1 = Map.of("Giallo", frutta1, "Arancione", frutta2, "Verde", frutta3);


        Map<String,Frutta> fruttaMap2 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Giallo", frutta1),
                new AbstractMap.SimpleEntry<>("Arancione", frutta2),
                new AbstractMap.SimpleEntry<>("Verde", frutta3)
        );

        System.out.println("Inizializzazione 1");
        System.out.println(fruttaMap);
        System.out.println();

        System.out.println("Inizializzazione 1");
        System.out.println(fruttaMap1);
        System.out.println();

        System.out.println("Inizializzazione 3");
        System.out.println(fruttaMap2);
        System.out.println();
    }
}
