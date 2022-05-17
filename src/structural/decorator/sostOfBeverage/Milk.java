package structural.decorator.sostOfBeverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage, String description) {
        super(beverage, description);
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
