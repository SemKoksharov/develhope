package Videolezioni.introOOP;

public class Main {
    public static void main(String[] args) {
        Articolo article1 = new Articolo("Pizza napoli", 3.99, 0.1);
        Articolo article2 = new Articolo("Coca cola", 0.99, 0.22);
        Articolo[] articoli = new Articolo[]{article1, article2};

        Carello carello = new Carello(articoli);
        System.out.println("### Carello do base ###");
        System.out.println("Numero di articoli: " + carello.getArticoli().length);
        System.out.println("Prezzo finale: " + carello.getPrezzoFinale());
        System.out.println("toString: " + carello);

        CarelloSenzaIva carelloSenzaIva = new CarelloSenzaIva(articoli);
        System.out.println("### Carello senza IVA ###");
        System.out.println("Numero di articoli: " + carelloSenzaIva.getArticoli().length);
        System.out.println("Prezzo finale: " + carelloSenzaIva.getPrezzoFinale());
        System.out.println("toString: " + carelloSenzaIva);

        CarelloConIva carelloConIva = new CarelloConIva(articoli);
        System.out.println("### Carello con IVA ###");
        System.out.println("Numero di articoli: " + carelloConIva.getArticoli().length);
        System.out.println("Prezzo finale: " + carelloConIva.getPrezzoFinale());
        System.out.println("toString: " + carelloConIva);
    }
}