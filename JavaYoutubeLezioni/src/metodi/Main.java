package metodi;
/*Metodi

Cosa sono i metodi
Creiamo un semplice metodo void
Parametri dei metodi
il return
 */
public class Main {
    public static void main(String[] args) {

        faiPasta();
        faiPasta();
        faiPasta();
        faiPasta();

        cucinaPranzo("carne");

        addizione(2,423);
        int totaleSpeso = addizione(102,3);
        System.out.println(totaleSpeso);
    }
    static void faiPasta(){
        System.out.println("Sto cucinando pasta");
    }


    static void cucinaPranzo(String cibo){
        System.out.println("Sto cucinando " + cibo);
    }

    static int addizione(int num1, int num2){
        int risultato = num1+num2;
        return risultato;
    }
}
