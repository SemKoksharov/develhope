package Videolezioni.introOOP;

import java.util.Arrays;

interface Carello {
    public Articolo[] getArticoli() {

        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    boolean isIva();
    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(isIva());
        }
        return prezzoFinale;
    }

}


