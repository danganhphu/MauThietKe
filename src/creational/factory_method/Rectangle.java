package creational.factory_method;

public class Rectangle extends Shape{
    private static Rectangle instance;

    private Rectangle() {
        super();
    }

    public synchronized static Rectangle getInstance() {
        if (instance == null)
            instance = new Rectangle();
        return instance;
    }

    @Override
    public String draw() {
        return "I'm Rectangle painted by " + brush + " in " + paper + " with " + frame;
    }
}
