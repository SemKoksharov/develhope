package Es4_inheritance;

public class Main {
    public static void main(String[] args) {
        Animale animale = new Animale("Some animal");
        Gatto gatto = new Gatto("Barsik");

        animale.failVerso();

        System.out.println("Nome del gatto: " + gatto.nome);
        gatto.failVerso();

    }
}
