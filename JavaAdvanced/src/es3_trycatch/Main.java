package es3_trycatch;

/* Scrivere una funzione che provi a dividere un numero per 0
  e catturi l'eccezione leggendone il messaggio. */
public class Main {
    public static void main(String[] args) {

        System.out.println("Risultato: " + divide(6, 0));
        System.out.println("Risultato: " + divide(6, 2));
    }

    public static double divide(int num1, int num2) {
        double result;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
            return Double.NaN;
        }
        return result;
    }
}
