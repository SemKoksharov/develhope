package Videolezioni.introOOP;

import java.util.Arrays;

public class CarelloConIva extends Carello {

    private Articolo[] articoli;

    public CarelloConIva(Articolo[] articoli) {
        setArticoli(articoli);
    }

    @Override
    protected boolean isIva() {
        return true;
    }

    @Override
    public String toString() {
        return "Carello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "  prezzo=" + getPrezzoFinale() +
                '}';
    }
}
