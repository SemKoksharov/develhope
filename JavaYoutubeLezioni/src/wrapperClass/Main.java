package wrapperClass;
//  premettono di utilizzare dati primitivi come reference
//  boolean => Boolean
//  char => Character
//  int => Integer
//  double => Double
public class Main {
    public static void main(String[] args){

        Boolean vero = true;
        boolean falso = true;

        Character carattere = 'a';
        Integer numero = 5;
        Double virgola = 5.23;
        String stringa = "bel corso";

        boolean a = true;
        char  b = 'a';
        int c = 5;
        double d = 5.23;

        if (numero == c){
            System.out.println("prova");
        }
    }
}
