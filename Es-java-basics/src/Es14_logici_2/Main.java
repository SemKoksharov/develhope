package Es14_logici_2;

public class Main {
    public static void main(String args[]){
        int num1 = 1000;
        System.out.println("Num1 pari (true/false)? " + num1Pari(num1));
    }
    public static boolean num1Pari(int num1){
        return (num1 & 1) == 0;
    }
}
