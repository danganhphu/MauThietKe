package creational.builder.computer;

public class Computer {
    String cpu, ram, disk, screen;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.disk = builder.disk;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Computer[cpu = " + cpu + ", ram = " + ram + ", disk = " + disk + ", screen = " + screen + "]";
    }

    public static class Builder {
        String cpu, ram, disk, screen;

        public Builder addCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder addRAM(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder addDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public Builder addScreen(String screen) {
            this.screen = screen;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
