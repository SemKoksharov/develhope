package es4_trycatch;
import java.util.Random;
/* Scrivere una funzione che accetti un array in input
e provi a dividere un numero dell'array per 0 e gestisca
sia l'eccezione della divisione che quella di indice non presente nell'array,
 leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 */
public class Main {
    public static void main(String[] args) {
        int[] numArr = {2, 0, 67, 3};
        Random rand = new Random();
        // Generate random integers in range 0 to 999

        for (int i = 0; i < 50; i++) {
            int idx = rand.nextInt(8);
            divideArrayNum(numArr, idx);
        }
    }

   public static double divideArrayNum(int[] array, int idx) throws IndexOutOfBoundsException {
     try{
        double result = array[idx]/0;
        return result;
     } catch (ArithmeticException e){
         System.out.println("Errore: "+e.getMessage());
       }catch (IndexOutOfBoundsException e){
         System.out.println("Index error");
     }
     return Double.NaN;
   }
}

