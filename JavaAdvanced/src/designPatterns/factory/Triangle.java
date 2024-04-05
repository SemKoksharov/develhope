package designPatterns.factory;

public class Triangle implements Shape {

    String name;
    double sidaA;
    double sideB;
    double sideC;

    public Triangle() {
        this.name = "Triangle";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSidaA() {
        return sidaA;
    }

    public void setSidaA(double sidaA) {
        this.sidaA = sidaA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        System.out.println("I draw a " + this.name);
        System.out.println("Side A = " +  this.sidaA);
        System.out.println("Side B = " + this.sideB);
        System.out.println("Side C = " + this.sideC);
    }
}
