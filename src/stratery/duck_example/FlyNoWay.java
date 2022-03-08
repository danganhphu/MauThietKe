package stratery.duck_example;

public class FlyNoWay implements IFlyBehavior{
    @Override
    public String fly() {
        return "oh no! Tôi không bay được";
    }
}
