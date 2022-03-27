package creational.factory_method;

public class Main {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape(ShapeType.CIRCLE);
        System.out.println(shape.draw());
    }
}
