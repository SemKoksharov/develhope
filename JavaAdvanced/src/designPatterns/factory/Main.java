package designPatterns.factory;
/*
Crea un'interfaccia Shape e un metodo draw, crea 2 o più classi che implementino Shape.
Cre una enum che abbia tutti i tipi di shape che hai creato ( cerchio, rettangolo etc etc)
Crea una factory class che abbia un metodo che ritorni la forma corretta (shape)
in base all'enum in input.
Stampa a video il risultato della funzione draw di ogni shape creata
 */


public class Main {
    public static void main(String[] args) {

        Shape circle =  ShapeFactory.getShape(ShapeType.CIRCLE);
        if (circle instanceof Circle c){
            c.setDiametr(67.3);
            circle.draw();
        }

        Shape rectangle =  ShapeFactory.getShape(ShapeType.RECTANGLE);
        if (rectangle instanceof Rectangle r) {
            r.setHeight(45.9);
            r.setWidth(111.4);
        }

        System.out.println();

        rectangle.draw();

        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        if (triangle instanceof Triangle t) {
            t.setSidaA(12.1);
            t.setSideB(15.34);
            t.setSideC(23.93);
        }

        System.out.println();

        triangle.draw();
    }


}
