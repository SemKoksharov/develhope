package Es5_inheritance_1;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma(37,16.3);
        Rettangolo rettangolo = new Rettangolo(24.5,11.1);
        Rettangolo rettangolo2 = new Rettangolo(222,112);

        System.out.println("Area di forma = "+ forma.calcolaArea());
        System.out.println("Area di rettangolo = " + rettangolo.calcolaArea());
        System.out.println("Area di rettangolo 2 = " + rettangolo2.calcolaArea());
    }
}
