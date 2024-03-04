package Videolezioni.Ereditarieta;

public class Main {
    public static void main(String[] args) {
        Animale animale = new Animale();
        Cane cane = new Cane();
        Labrador labrador = new Labrador();
        PastoreTedesco pastoreTedesco = new PastoreTedesco();
        Gatto gatto = new Gatto();

        System.out.println("Animale = " + animale);
        System.out.println("Animale = " + cane);
        System.out.println("Animale = " + labrador);
        System.out.println("Animale = " + pastoreTedesco);
        System.out.println("Animale = " + gatto);
    }
}
