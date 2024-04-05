package es23_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
(Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
Crei un metodo per calcolare l'operazione richiesta  e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
 */
public class Main {

    public static void main(String[] args) {

        BigDecimal num1 = BigDecimal.valueOf(14.88);
        BigDecimal num2 = BigDecimal.valueOf(46.69);

        System.out.println("Num1 = " + num1 + ", Num2 = " + num2);

        try {
            System.out.println("Risultato = " + calcolaBigDecimal(num1, num2, Operazione.ADDIZIONE));
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

    public static BigDecimal calcolaBigDecimal(BigDecimal num1, BigDecimal num2, Operazione operazione) throws ArithmeticException, NullPointerException {
        if (num1 != null && num2 != null) {
            switch (operazione) {

                case ADDIZIONE -> {
                    return num1.add(num2);
                }
                case SOTTRAZIONE -> {
                    return num1.subtract(num2);
                }
                case MOLTIPLICAZIONE -> {
                    return num1.multiply(num2);
                }
                case DIVISIONE -> {
                    if (num2.compareTo(BigDecimal.ZERO) != 0) {
                        return num1.divide(num2, RoundingMode.HALF_UP);
                    } else throw new ArithmeticException("Divisione per 0!");
                }
                case MIN -> {
                    return num1.min(num2);
                }
                case MAX -> {
                    return num1.max(num2);
                }
                case null -> throw new NullPointerException("Operazione puo essere null!");
            }
        } else throw new NullPointerException("Il valore di num1 e/o num2 non puo essere null!");

    }
}