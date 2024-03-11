package es1_trycatch;

public class Main {
    public static void main(String[] args) {
        System.out.println(controlAndCreateException(18));
        System.out.println("Cosi funziona senza errori: "+controlAndCreateException(8));
    }
    public static boolean controlAndCreateException(int num){
       try {if (num >= 1 && num <= 17){
            return true;
        } else throw new ArithmeticException();
       } catch (ArithmeticException e) {
           System.out.println("Errore: " + e);
       } catch (Exception e) {
           System.out.println("Altro errore: " + e);
       } finally {
           System.out.println("Comunque il programma `e stato eseguito");
       }
        return false;
    }
}