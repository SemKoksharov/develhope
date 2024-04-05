package designPatterns.factory;

public class Circle implements Shape {

    String name;
    double diametr;

    public Circle() {
        this.name = "Circle";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public void draw() {
        System.out.println("I draw a " + this.name);
        System.out.println("Diametr = " + this.diametr);
    }
}
