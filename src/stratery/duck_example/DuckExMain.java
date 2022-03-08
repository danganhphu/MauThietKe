package stratery.duck_example;

public class DuckExMain {
    public static void main(String[] args) {
        ///sửa
        VitXiem vx = new VitXiem();
        IFlyBehavior fly = new FlyNoWay();
        IQuackBehavior quack = new SQuack();
        vx.setFlyBehavior(fly);
        vx.setQuackBehavior(quack);
        vx.display();
    }
}
