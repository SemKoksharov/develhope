/*


    • Realizzare un metodo Cerca che prenda in input
        un’unica stringa e che faccia una ricerca tra
        i libri presenti nella biblioteca in base al titolo e all’autore,
        restituendo una lista di libri coerenti con la ricerca.
    • Realizzare un metodo che stampi i libri contenuti all’interno della Biblioteca.
    • Realizzare un metodo per aggiungere un libro alla lista dei libri presenti.
    •  Bonus  Realizzare un metodo che restituisca
        una mappa avente come chiave il nome dell’autore e come
        valore la lista di libri scritti da quell’autore.


 */

import java.util.Arrays;

public class Biblioteca {
    private String nome;
    private String indirizzo;
    private Libro[] lista = new Libro[0];

    public Biblioteca(String nome, String indirizzo, Libro[] lista) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.lista = lista;
    }

    public Biblioteca(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Libro[] getLista() {
        return lista;
    }

    public void setLista(Libro[] lista) {
        this.lista = new Libro[0];
    }

    public void stampaLibri() {
        if (lista.length == 0){
            System.out.println("Biblioteca `e vuota");
        }
        for (Libro libro : lista) {
            libro.infoDiLibro();
        }
    }

    public String cercaLibro(String daCercare) {
        Libro[] libriTrovati = new Libro[lista.length];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getAutore().toLowerCase().contains(daCercare.toLowerCase()) ||
                    lista[i].getTitolo().toLowerCase().contains(daCercare.toLowerCase())) {
                libriTrovati[i] = lista[i];
            }

        }
        return Arrays.toString(libriTrovati);
    }

    public void addLibro(Libro libro) {
        Libro[] tempArr = new Libro[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            tempArr[i] = lista[i];
        }
        tempArr[tempArr.length - 1] = libro;
        lista = tempArr;
    }

    public void removeLibro(Libro libro) {
        int idxTemp = 0;
        Libro[] tempArr = new Libro[lista.length - 1];
        for (int i = 0; i < lista.length; i++) {
            if (!libro.getTitolo().equalsIgnoreCase(lista[i].getTitolo())) {
                tempArr[idxTemp] = lista[i];
                idxTemp++;
            }
        }
        lista = tempArr;
    }
}

