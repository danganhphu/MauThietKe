package creational.builder.computer;

public class Main {

    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder();
        Computer computer = builder
                .addCPU("core i9")
                .addRAM("32GB")
                .addDisk("SSD")
                .addScreen("17 inches LG 4k")
                .build();

        System.out.println(computer.toString());
    }
}
