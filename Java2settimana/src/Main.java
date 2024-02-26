public class Main {
    public static void main(String[] args) {
        Articolo article1 = new Articolo();
        article1.nome = "Pizza napoli";
        article1.prezzo = 3.99;

        Articolo article2 = new Articolo();
        article2.nome = "Coca cola";
        article2.prezzo = 0.99;

        System.out.println("Hello and welcome!");
        System.out.println("Articolo 1: " + article1);
        System.out.println("Articolo 2: " + article2);

        Carello carello = new Carello();
        carello.articoli = new Articolo[] {article1, article2};
        carello.prezzoFinale = article1.prezzo + article2.prezzo;

        System.out.println("Carello: " + carello);
    }
}