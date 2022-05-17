package creational.builder.my_string;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStr = new MyStringBuilder()
                .addString("AnhPhu")
                .addString("Hiphop4life").
                addfloat(17).
                addBool(true);
        System.out.println(myStr.toString());
    }
}
