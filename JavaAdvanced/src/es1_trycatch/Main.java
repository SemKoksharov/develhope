package es1_trycatch;

public class Main {
    public static void main(String[] args) {
        try {
            controlAndCreateException(17);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }

    public static boolean controlAndCreateException(int num) throws ArithmeticException {
        if (num >= 1 && num <= 17) {
            System.out.println("17 >=Numero >=1\n" + true);
            return true;
        } else throw new ArithmeticException("Errore! Il numero deve essere tra 1 e 17!");
    }
}