package creational.factory_method;

public abstract class Shape {
    protected String brush;

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    protected String paper;
    protected String frame;

    public Shape() {
        this.brush = "pencil";
        this.paper = "A2";
        this.frame = "a frame";
    }

    public abstract String draw();
}
