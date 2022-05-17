package structural.decorator.bieuthuc;

import static java.lang.Math.abs;

public class TriTuyetDoi extends BieuThucDecorator{
    float toanHang;

    public TriTuyetDoi(BieuThuc b, float toanHang) {
        super(b);
        this.toanHang = toanHang;
    }
    @Override
    public float giaTri() {
        return abs(this.toanHang);
    }
    @Override
    public String bieuThuc() {
        return "|" + bieuThuc.bieuThuc()+"|";
    }


}
