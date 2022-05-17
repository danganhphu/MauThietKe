package behavioral.chain_responsibility.xep_loai;

public class YeuKem implements IXepLoai{
    String nhan;
    float min;


    @Override
    public IXepLoai thietLapThapHon(IXepLoai xepLoai) {
        return null;
    }

    @Override
    public String xepLoai(float diem) {
        if (diem >= min)
            return nhan;
        return "Ngoài phạm vi xếp loại";
    }
}
