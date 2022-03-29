package creational.factory_method;

public class ShapeFactory{

    private ShapeFactory() {}

    public static Shape createShape(ShapeType shapeType) {
        return switch (shapeType) {
            case RECTANGLE -> Rectangle.getInstance();
            case TRIANGLE -> Triangle.getInstance();
            case CIRCLE -> Circle.getInstance();
            default -> null;
        };
    }
}
