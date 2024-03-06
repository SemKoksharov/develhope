package Videolezioni.introOOP;

import java.util.Arrays;

public abstract class Carello {
   //  private double prezzoFinale;
    private Articolo[] articoli;

    public Carello(Articolo[] articoli){

        setArticoli(articoli);
    }
    public Articolo[] getArticoli() {

        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    protected abstract boolean isIva();
    public double getPrezzoFinale() {
        double prezzoFinale = 0.0;

        for (Articolo articolo : getArticoli()) {
            prezzoFinale += articolo.getPrezzo(isIva());
        }
        return prezzoFinale;
    }


    @Override
    public String toString() {
        return "Carello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                '}';
    }
}


