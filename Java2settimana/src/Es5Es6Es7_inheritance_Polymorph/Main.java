package Es5Es6Es7_inheritance_Polymorph;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(24.5, 11.1);
        Rettangolo rettangolo2 = new Rettangolo(2, 12);
        rettangolo.calcolaArea();
        rettangolo2.calcolaArea();

        Triangolo triangolo1 = new Triangolo(13,29);
        System.out.println("Base di triangolo = " + triangolo1.getBase());
        System.out.println("Area di triangolo getter = " + triangolo1.getArea());
        System.out.println("Area di triangolo metodo calcoloArea:");
        triangolo1.calcolaArea();

    }
}
