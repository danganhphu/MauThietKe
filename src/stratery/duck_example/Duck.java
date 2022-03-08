package stratery.duck_example;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performQuack() {
        System.out.println("Vịt kêu: " + quackBehavior.quack());
    }

    void performFly() {
        System.out.println("Vịt bay: " + flyBehavior.fly());
    }

    public abstract void display();
}
