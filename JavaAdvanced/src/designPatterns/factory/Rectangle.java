package designPatterns.factory;

public class Rectangle implements Shape {

    String name;
    double width;
    double height;

    public Rectangle() {
        this.name = "Rectangle";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I draw a " + this.name);
        System.out.println("Width = " + this.width);
        System.out.println("Height = " + this.height);

    }
}
