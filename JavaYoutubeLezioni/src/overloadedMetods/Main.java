package overloadedMetods;

/*
Cosa sono
Creiamo diversi medodi con num param differenti
Creiamo diversi medodi con tipi dato differenti
 */
public class Main {
    public static void main(String[] args) {

        int doppioInt = addizione(2,3);
        int triploInt = addizione(2,5,6);
        double doppioDouble =addizione(2.4,4.2);

        System.out.println(doppioInt);
        System.out.println(triploInt);
        System.out.println(doppioDouble);

    }
    static int addizione(int num1, int num2){
        int risultato = num1+num2;
        return risultato;
    }

    static int addizione(int num1, int num2, int num3){
        int risultato = num1+num2+num3;
        return risultato;
    }

    static double addizione(double num1, double num2){
        double risultato = num1+num2;
        return risultato;
    }


}
