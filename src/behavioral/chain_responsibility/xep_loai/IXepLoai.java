package behavioral.chain_responsibility.xep_loai;

public interface IXepLoai {
    IXepLoai thietLapThapHon(IXepLoai xepLoai);
    String xepLoai(float diem);
}
