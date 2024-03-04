package Videolezioni.introOOP;

import java.util.Arrays;

public class CarelloConIva extends Carello{
    public CarelloConIva(Articolo[] articoli) {
        super(articoli);
    }

    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(true);
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
