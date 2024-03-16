package es6_unbox_autobox;


public class Main {
    public static void main(String[] args) {

        printSum(5, 3); // int
        printChar('A'); //char
        printSumInteger(10, 20); // Integer
        printCharacter('B'); //Character

        int intValue = 10;
        double doubleValue = 3.5;
        char charValue = 'X';

        // Autoboxing
        Integer integer = intValue;
        Double doubleVal = doubleValue;
        Character charVal = charValue;

        // Unboxing
        int unboxInteger = integer;
        double unboxDouble = doubleVal;
        char unboxChar = charVal;

        System.out.println("Unboxed Integer: " + unboxInteger);
        System.out.println("Unboxed Double: " + unboxDouble);
        System.out.println("Unboxed Character: " + unboxChar);
    }

    public static void printSum(int num1, int num2) {
        System.out.println("Somma: " + (num1 + num2));
    }

    public static void printChar(char ch) {
        System.out.println("Char: " + ch);
    }

    public static void printSumInteger(Integer num1, Integer num2) {
        System.out.println("Somma Integer: " + (num1 + num2));
    }

    public static void printCharacter(Character ch) {
        System.out.println("Character: " + ch);
    }
}


