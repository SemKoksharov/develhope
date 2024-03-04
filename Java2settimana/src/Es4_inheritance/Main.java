package Es4_inheritance;

public class Main {
    public static void main(String[] args) {
        Gatto gatto = new Gatto("Barsik");
        System.out.println("Mi chiamo " + gatto.getNome());
        gatto.failVerso();
        gatto.setNome("Roma");
        System.out.println("Ho ripensato! Mi chiamo " + gatto.getNome() + '!');
        gatto.failVerso();
    }
}
