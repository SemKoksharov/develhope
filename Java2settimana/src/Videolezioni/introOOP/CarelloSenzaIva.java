package Videolezioni.introOOP;

import java.util.Arrays;

public class CarelloSenzaIva extends Carello {
    public CarelloSenzaIva(Articolo[] articoli) {
        super(articoli);
    }

    @Override
    protected boolean isIva() {
        return false;
    }

    @Override
    public String toString() {
        return "Carello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "  prezzo=" + getPrezzoFinale() +
                '}';
    }
}
