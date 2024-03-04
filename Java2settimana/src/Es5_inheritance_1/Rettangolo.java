package Es5_inheritance_1;

public class Rettangolo extends Forma{
    Rettangolo(double base, double altezza) {
        super(base, altezza);
    }
    @Override
    double calcolaArea() {
        return base * altezza;
    }
}
