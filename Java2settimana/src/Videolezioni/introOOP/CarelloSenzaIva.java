package Videolezioni.introOOP;

import java.util.Arrays;

public class CarelloSenzaIva extends Carello {
    public CarelloSenzaIva(Articolo[] articoli) {
        super(articoli);
    }

    @Override
    public String toString() {
        return "Carello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "prezzo=" + getPrezzoFinale(false) +
                '}';
    }
}
