package structural.decorator.sostOfBeverage;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast("ca phe");
        beverage = new Milk(beverage, "Sua tuoi");
        beverage = new Soy(beverage, "dau nanh");
        beverage = new Milk(beverage, "ong tho");

        System.out.println("Phu gia: " + beverage.getDescription());
        System.out.println("Gia: " + beverage.cost());
    }
}
