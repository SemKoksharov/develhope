package Es5Es6_inheritance_Polymorph;

public class Rettangolo extends Forma{
    private double base;
    private double altezza;
    private double area;


    public Rettangolo(double base, double altezza) {
        super();
        this.base=base;
        this.altezza=altezza;
        this.area = base*altezza;
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
        System.out.println("Area di rettangolo: " + area);
    }

}
