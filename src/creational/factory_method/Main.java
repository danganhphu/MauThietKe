package creational.factory_method;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape(ShapeType.RECTANGLE);
        Shape shape2 = ShapeFactory.createShape(ShapeType.TRIANGLE);
        Shape shape3 = ShapeFactory.createShape(ShapeType.CIRCLE);

        System.out.println(shape1.draw());
        System.out.println(shape2.draw());
        System.out.println(shape3.draw());
    }
}
