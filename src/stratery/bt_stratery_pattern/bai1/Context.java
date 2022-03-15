package stratery.bt_stratery_pattern.bai1;

public class Context {
    private ITinh tinhToan;

    public Context(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public void setTinhToan(ITinh value) {
        tinhToan = value;
    }
    public float tinh(float a, float b) {
        return tinhToan.tinh(a, b);
    }

}
