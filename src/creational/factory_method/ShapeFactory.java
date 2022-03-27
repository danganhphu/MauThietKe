package creational.factory_method;

public class ShapeFactory{
    private static Shape theOnlyShape;


    private ShapeFactory() {}

    public static synchronized Shape createShape(ShapeType shapeType) {
        if (theOnlyShape != null)
            return theOnlyShape;
        switch (shapeType) {
            case RECTANGLE -> theOnlyShape = new Rectangle();
            case CIRCLE -> theOnlyShape = new Circle();
            case TRIANGLE -> theOnlyShape = new Triangle();
            default -> throw new IllegalArgumentException("This shape type is unsupported");
        }
        return theOnlyShape;
    }
}
