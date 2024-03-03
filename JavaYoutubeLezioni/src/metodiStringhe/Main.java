package metodiStringhe;
/* Java 17
Metodi Stringhe
euqals, equalsIgnoreCase, length, charAt
indexOf, isEmpty, toUpperCase, toLowerCase
trim, replace. toCharArray
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String name = "   Leonardo   ";
        boolean  result= name.equals("Leonardo");
        System.out.println(result+" equals(Leonardo)");

        boolean  result1= name.equalsIgnoreCase("leonardo");
        System.out.println(result1+" equalsIgnoreCase");

        int result2 = name.length();
        System.out.println(result2+" length()");

        char result3 = name.charAt(7);
        System.out.println(result3+" charAt(7)");

        boolean result4 = name.isEmpty();
        System.out.println(result4+" isEmpty()");

        String result5 = name.toUpperCase();
        System.out.println(result5+" toUpperCase()");

        String result6 = name.toLowerCase();
        System.out.println(result6+" toLowerCase()");

        String result7 = name.trim();
        System.out.println(result7+" trim()");

        String result8 = name.replace('o','W');
        System.out.println(result8+" replace(o,W).");

        char[] result9 = name.toCharArray();
        System.out.println(Arrays.toString(result9)+" toCharArray()");
    }

}