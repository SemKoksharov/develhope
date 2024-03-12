package es3_trycatch;

/* Scrivere una funzione che provi a dividere un numero per 0
  e catturi l'eccezione leggendone il messaggio. */
public class Main {
    public static void main(String[] args) {

        System.out.println("Risultato: " + divide(6, 0));
        System.out.println("Risultato: " + divide(6, 2));
        System.out.println("Risultato: " + divide(0, 2));
    }

    public static double divide(int num1, int num2) {
        double result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Messagio di errore: " + e.getMessage());
        } catch (Exception e1) {
            System.out.println("Messagio di errore: " + e1.getMessage());
            result = 0;

        }
        if (num2 == 0) {
            return Double.NaN;
        } else return result;
    }
}
