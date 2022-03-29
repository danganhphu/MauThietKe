package creational.factory_method;

public class Triangle extends Shape{
    private static Triangle instance;

    private Triangle() {
        super();
    }

    public synchronized static Triangle getInstance() {
        if (instance == null)
            instance = new Triangle();
        return instance;
    }

    @Override
    public String draw() {
        return "I'm Triangle painted by " + brush + " in " + paper + " with " + frame;
    }
}
