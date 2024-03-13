package es4_trycatch;

/* Scrivere una funzione che accetti un array in input
e provi a dividere un numero dell'array per 0 e gestisca
sia l'eccezione della divisione che quella di indice non presente nell'array,
 leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.
 */
public class Main {
    public static void main(String[] args) {
        int[] numArr = {2, 0, 67, 3};
        divideArrayNum(numArr);
    }

   public static void divideArrayNum(int[] array) throws IndexOutOfBoundsException {
     try{
        double result = array[5]/0;
         throw new ArithmeticException("Divisione per zero");
     } catch (ArithmeticException e){
         System.out.println("Errore: "+e.getMessage());
       }catch (IndexOutOfBoundsException e){
         System.out.println("Index error");
     }
   }
}

