package creational.factory_method;

public class Circle extends Shape{
    private static Circle instance;

    private Circle() {
        super();
    }

    public synchronized static Circle getInstance() {
        if (instance == null)
            instance = new Circle();
        return instance;
    }

    @Override
    public String draw() {
        return "I'm Circle painted by " + brush + " in " + paper + " with " + frame;
    }
}
