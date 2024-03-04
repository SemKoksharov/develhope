package Videolezioni.introOOP;

import java.util.Arrays;

public class CarelloSenzaIva extends Carello {
    public CarelloSenzaIva(Articolo[] articoli) {
        super(articoli);
    }

    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(false);
        }
        return prezzoFinale;
    }
    @Override
    public String toString() {
        return "Carello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                "  prezzo=" + getPrezzoFinale() +
                '}';
    }
}
