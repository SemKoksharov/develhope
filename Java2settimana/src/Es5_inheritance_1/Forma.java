package Es5_inheritance_1;

public class Forma {
    double base;
    double altezza;

    Forma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    double calcolaArea() {
        return base * altezza;
    }
}

