package Es11_confr;
/*
Scrivi un programma che contiene un metodo che dati 2 interi
in ingresso ed un valore di confronto verifichi se il numero
di confronto è compreso tra due valori specifici e stampi
il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)
 */
public class Main {
    public static void main(String args[]){
        int limitSuper = 200;
        int limitInfer = 73;
        int numDiConf = 201;
        System.out.println("Limite superiore =" + limitSuper + "\nLimit inferiore = " + limitInfer + "\nRisultato di confrontazione = " + confront(limitSuper, limitInfer, numDiConf));
    }
    public static boolean confront(int limitSuper, int limitInfer, int numDiConf){
        return (numDiConf <= limitSuper) && (numDiConf >= limitInfer);
    }
}
