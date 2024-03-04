package Es5Es6_inheritance_Polymorph;

public class Triangolo extends Forma {

    private double base;
    private double altezza;
    private double area;

    public Triangolo(double base, double altezza) {
        super();
        this.base = base;
        this.altezza = altezza;
        this.area = base * altezza;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    void calcolaArea() {
        System.out.println("Area di triangolo = " + base*altezza);

    }
}
