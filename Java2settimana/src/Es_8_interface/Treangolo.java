package Es_8_interface;

public class Treangolo extends Forma implements Es_8_interface.interfaceForma.Forma {
    public Treangolo(double lunghezzaDiLato, double altezza) {
        super(3, lunghezzaDiLato, altezza);
    }
    @Override
    public void calcolaArea() {
        System.out.println("Area di Treangolo = " + (getLunghezzaDiLato() * getAltezza()) / 2);
    }
    @Override
    public String toString() {
        return "Treangolo{" +
                "numeroDiLato=" + getNumeroDiLato() +
                ", lunghezzaDiLato=" + getLunghezzaDiLato() +
                ", altezza=" + getAltezza() +
                '}';
    }
}
