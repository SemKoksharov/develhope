package Es_8_interface;

//Poligono generico
public abstract class Forma  {
    private int numeroDiLato;
    private double lunghezzaDiLato;
    private double altezza;

    public Forma(int numeroDiLato, double lunghezzaDiLato, double altezza) {
        this.numeroDiLato = numeroDiLato;
        this.lunghezzaDiLato = lunghezzaDiLato;
        this.altezza = altezza;
    }

    public int getNumeroDiLato() {
        return numeroDiLato;
    }

    public void setNumeroDiLato(int numeroDiLato) {
        this.numeroDiLato = numeroDiLato;
    }

    public double getLunghezzaDiLato() {
        return lunghezzaDiLato;
    }

    public void setLunghezzaDiLato(double lunghezzaDiLato) {
        this.lunghezzaDiLato = lunghezzaDiLato;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public abstract void calcolaArea();

    @Override
    public String toString() {
        return "Forma{" +
                "numeroDiLato=" + numeroDiLato +
                ", lunghezzaDiLato=" + lunghezzaDiLato +
                ", altezza=" + altezza +
                '}';
    }


}
