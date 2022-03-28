package creational.factory_method;

public class Main {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape(ShapeType.CIRCLE);
        Shape shape1 = ShapeFactory.createShape(ShapeType.TRIANGLE);
        System.out.println(shape.draw());
        System.out.println(shape1.draw());
    }
}
