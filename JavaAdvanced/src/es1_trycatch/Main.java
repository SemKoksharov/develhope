package es1_trycatch;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(controlAndCreateException(18));
        } catch (ArithmeticException ae) {
            System.out.println("Errore: " + ae.getMessage());
            // ho fatto sout per far vedere che metodo rest. TRUE se num `e tra 1 e 17
        }
    }

    public static boolean controlAndCreateException(int num) throws ArithmeticException {
        if (num >= 1 && num <= 17) {
            return true;
        } else throw new ArithmeticException("Il numero deve essere tra 1 e 17!");
    }
}