package structural.decorator.sostOfBeverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage, String description) {
        super(beverage, description);
    }
    @Override
    public int cost() {
        return beverage.cost() + 3;
    }
}
