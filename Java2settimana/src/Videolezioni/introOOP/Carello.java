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

        public double getPrezzoFinale() {
            return 0.0;
        }


    @Override
    public String toString() {
        return "Carello{" +
                "articoli=" + Arrays.toString(getArticoli()) +
                '}';
    }
}


