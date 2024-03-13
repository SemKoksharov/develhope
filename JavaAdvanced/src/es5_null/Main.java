package es5_null;

public class Main {
    public static void main(String[] args) {

        fractionCalc(2, 4);
        fractionCalc(null, 2);
        fractionCalc(4, 0);

    }

    public static void fractionCalc(Integer numerator, Integer denominator) {
        try {
            if (numerator == null || denominator == null) {
                throw new NullPointerException();
            }
            if (denominator == 0) {
                throw new ArithmeticException();
            }
            double result = (double) numerator / denominator;
            System.out.println("Risultato = " + result);
        } catch (NullPointerException e) {
            System.out.println("Numeratore e denominatore non possono essere 'null'");
        } catch (ArithmeticException e) {
            System.out.println("Divisione per 0");
        }
    }
}



