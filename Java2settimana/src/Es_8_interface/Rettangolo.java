package Es_8_interface;

public class Rettangolo extends Forma implements Es_8_interface.interfaceForma.Forma {
    public Rettangolo(double lunghezzaDiLato, double altezza) {
        super(4, lunghezzaDiLato, altezza);

    }

    @Override
    public void calcolaArea() {
        System.out.println("Area di Rettangolo = " + getLunghezzaDiLato() * getAltezza());
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "numeroDiLato=" + getNumeroDiLato() +
                ", lunghezzaDiLato=" + getLunghezzaDiLato() +
                ", altezza=" + getAltezza() +
                '}';
    }
}
