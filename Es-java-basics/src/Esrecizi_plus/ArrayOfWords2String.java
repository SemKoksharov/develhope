package Esrecizi_plus;

import java.util.Arrays;

public class ArrayOfWords2String {
    public static void main(String[] args) {
    String [] myWords = {"Suka","Sobaka","Obezyana","Makaka", "Poka-poka loh!", "  x "};
        System.out.println(smash(myWords));

    }
    public static String smash (String[] words){
        return String.join(" ", words);
    }
}
