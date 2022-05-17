package structural.decorator.sostOfBeverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public CondimentDecorator(Beverage beverage ,String description) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }

    @Override
    public int cost() {
        return 0;
    }
}
