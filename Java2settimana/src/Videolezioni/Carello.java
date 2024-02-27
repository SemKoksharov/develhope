package Videolezioni;

import java.util.Arrays;

public class Carello {
    private double prezzoFinale;

    private Articolo[] articoli;

    public Carello(Articolo[] articoli){
        this.articoli = articoli;
    }

    @Override
    public String toString() {
        return "Carello{" +
                "prezzoFinale=" + prezzoFinale +
                ", articoli=" + Arrays.toString(articoli) +
                '}';
    }
}

