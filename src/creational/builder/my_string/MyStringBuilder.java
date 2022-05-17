package creational.builder.my_string;

public class MyStringBuilder{
    String str;

    public MyStringBuilder() {
        str = "";
    }
    public MyStringBuilder(String str) {
        this.str = str;
    }

    MyStringBuilder addString(String st) {
            this.str = this.str + st;
            return this;
        }
    MyStringBuilder addfloat(float f) {
            this.str = this.str + f;
            return this;
        }
    MyStringBuilder addBool(boolean b) {
            this.str = this.str + b;
            return this;
        }

    @Override
    public String toString() {
        return "string: " + str;
    }
}
