package designPatterns.factory;

import java.util.Scanner;

public class ShapeFactory {
    public static Shape getShape(ShapeType type) {

        return switch (type) {

            case ShapeType.RECTANGLE -> new Rectangle();

            case ShapeType.TRIANGLE -> new Triangle();

            case ShapeType.CIRCLE -> new Circle();

            case null -> null;

        };
    }
}
