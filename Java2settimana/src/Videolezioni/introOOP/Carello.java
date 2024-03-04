package Videolezioni.introOOP;

import java.util.Arrays;

public class Carello {
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

        public double getPrezzoFinale(boolean conIva) {
           double prezzoFinale = 0.0;

            for (Articolo articolo : articoli) {
                prezzoFinale += articolo.getPrezzo(conIva);
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


