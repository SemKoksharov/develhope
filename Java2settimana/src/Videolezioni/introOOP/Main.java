package Videolezioni.introOOP;

public class Main {
    public static void main(String[] args) {
        Articolo article1 = new Articolo("Pizza napoli",3.99, 0.1);
        Articolo article2 = new Articolo("Coca cola",  0.99, 0.22);

        Carello carello = new Carello(new Articolo[] {article1, article2});
        System.out.println("### Carello ###");
        System.out.println("Numero di articoli: " + carello.getArticoli().length);
        System.out.println("Prezzo finale senza IVA: " + carello.getPrezzoFinale(false));
        System.out.println("Prezzo finale con IVA: " + carello.getPrezzoFinale(true));

        Articolo article3 = new Articolo("Tiramisu", 2.49, 0.22);
        carello = new Carello(new Articolo[] {article1,article2,article3});

        System.out.println("### Carello aggiornato ###\n");
        System.out.println("Numero di articoli: " + carello.getArticoli().length);
        System.out.println("Prezzo finale senza IVA: " + carello.getPrezzoFinale(false));
        System.out.println("Prezzo finale con IVA: " + carello.getPrezzoFinale(true));
    }
}