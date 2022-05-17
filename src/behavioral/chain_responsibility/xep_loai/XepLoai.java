package behavioral.chain_responsibility.xep_loai;

public class XepLoai implements IXepLoai{
    String nhan;
    float min;
    IXepLoai caoHon;


    public XepLoai(String nhan, float min) {
        this.nhan = nhan;
        this.min = min;
    }

    @Override
    public IXepLoai thietLapThapHon(IXepLoai xepLoai) {
        caoHon = xepLoai;
        return xepLoai;
    }

    @Override
    public String xepLoai(float diem) {
        if (diem >= min)
            return nhan;
        return caoHon.xepLoai(diem);
    }
}
