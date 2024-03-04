package Es5_inheritance_1;

public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    public Rettangolo(double base, double area) {
        super();
        this.base=base;
        this.altezza=altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    void calcolaArea() {
        System.out.println("Area di rettangolo: " + base*altezza);
    }

}
