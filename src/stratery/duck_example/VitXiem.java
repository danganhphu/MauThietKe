package stratery.duck_example;

public class VitXiem extends Duck{

    @Override
    public void display() {
        System.out.println("Tôi là vịt xiêm, tôi có thể bay, kêu và bơi.");
        performFly();
        performQuack();
    }
}
