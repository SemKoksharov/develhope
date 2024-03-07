package Es_8_interface;

//Poligono generico
public class Forma implements Es_8_interface.interfaceForma.Forma {
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

    @Override
    public void calcolaArea() {
        System.out.println("Area di Forma(Poligono) = " + (numeroDiLato * lunghezzaDiLato * altezza) / 2);
    }

    @Override
    public String toString() {
        return "Forma{" +
                "numeroDiLato=" + numeroDiLato +
                ", lunghezzaDiLato=" + lunghezzaDiLato +
                ", altezza=" + altezza +
                '}';
    }


}
