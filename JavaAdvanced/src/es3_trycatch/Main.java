package es3_trycatch;

/* Scrivere una funzione che provi a dividere un numero per 0
  e catturi l'eccezione leggendone il messaggio. */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Risultato di divisione = " + divide(6,0));
        } catch (ArithmeticException ae) {
            System.out.println("Errore: " + ae.getMessage());
            System.out.println("Risultato di divisione = " + Double.NaN);
        }
    }

    public static double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Divisione per 0!");
        }
        return num1 / num2;
    }
}
