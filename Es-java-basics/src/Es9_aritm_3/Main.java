package Es9_aritm_3;

public class Main {
    public static void main(String[] agrs){
        double a = 3.7;
        double b = 19.2;
        double c = 23.12;
        System.out.println("Media tra a/b/c = " + media(a, b, c));
    }
    public static double media(double a, double b, double c){
        double d = (a + b + c) / 3;
        return d;
    }
}
