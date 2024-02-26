import java.util.Arrays;

public class Carello {
    public double prezzoFinale;

    public Articolo[] articoli;

    @Override
    public String toString() {
        return "Carello{" +
                "prezzoFinale=" + prezzoFinale +
                ", articoli=" + Arrays.toString(articoli) +
                '}';
    }
}

