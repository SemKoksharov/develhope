package Es10_assegn;

public class Main {
    public static void main(String[] args){
        double a = 22.5;
        double b = 17.2;

        System.out.println("Risultato di incrementazione di a/b con multiplicazione tra di loro = " + incrAndMiltiplic(a,b));
    }
    public static double incrAndMiltiplic(double a, double b){
        return (a *= 24) * (b *= 87);
    }
}
