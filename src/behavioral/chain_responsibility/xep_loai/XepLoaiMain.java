package behavioral.chain_responsibility.xep_loai;

public class XepLoaiMain {
    public static void main(String[] args) {
        IXepLoai xuatSac = new XepLoai("Xuất sắc", 9);
        IXepLoai gioi = new XepLoai("Giỏi", 8);
        IXepLoai kha = new XepLoai("Khá", 7);
        IXepLoai tbKha = new XepLoai("TB Khá", 6);
        IXepLoai tb = new XepLoai("Trung bình", 5);
        IXepLoai yeu = new XepLoai("Yếu", 0);

        xuatSac.thietLapThapHon(gioi)
                .thietLapThapHon(kha)
                .thietLapThapHon(tbKha)
                .thietLapThapHon(tb)
                .thietLapThapHon(yeu);

        System.out.println("Điểm 6: " + xuatSac.xepLoai(1));
        System.out.println("Điểm: 6.5: " + xuatSac.xepLoai((float) 6.5));
    }
}
