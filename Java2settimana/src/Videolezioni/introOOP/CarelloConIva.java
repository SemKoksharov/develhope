package Videolezioni.introOOP;

import java.util.Arrays;

public class CarelloConIva extends Carello{
    public CarelloConIva(Articolo[] articoli) {
        super(articoli);
    }

    @Override
    public String toString() {
        return "Carello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "prezzo=" + getPrezzoFinale(true) +
                '}';
    }
}
