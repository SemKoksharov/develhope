package Videolezioni.introOOP;

import java.util.Arrays;

public class CarelloSenzaIva extends Carello {
    private Articolo[] articoli;

    public CarelloSenzaIva(Articolo[] articoli) {
        setArticoli(articoli);
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
