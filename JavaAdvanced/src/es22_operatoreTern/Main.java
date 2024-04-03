package es22_operatoreTern;

//Copia il seguente programma Java e sostutuisci il costrutto if-else con l'operatore ternario

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(checkValue(i));
        }
    }

    private static String checkValue(int value) {
        return value % 5 == 0 ? "FizzBuzz" : "Buzz";
    }

}
