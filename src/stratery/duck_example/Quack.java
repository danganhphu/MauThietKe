package stratery.duck_example;

public class Quack implements IQuackBehavior{
    @Override
    public String quack() {
        return "Quack...";
    }
}
