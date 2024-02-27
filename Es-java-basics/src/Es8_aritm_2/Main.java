package Es8_aritm_2;

public class Main {
    public static void main(String[] args){
        int a = 60;
        int b = 20;
        int c = 10;

        System.out.println("Riultato di divisione tra a/b/c = " + divisionTraTreNumeri(a,b,c));

    }
    public static double divisionTraTreNumeri(int a, int b, int c){
        double result = ((double) a / (double) b) / (double) c;
        return result;
    }
}
