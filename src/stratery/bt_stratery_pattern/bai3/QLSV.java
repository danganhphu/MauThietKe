package stratery.bt_stratery_pattern.bai3;

import java.util.List;

public class QLSV {
    List<SinhVien> dsSV;
    ISoSanh<SinhVien> soSanh;

    public QLSV(List<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public void sapXep() {
        dsSV.sort((o1, o2) -> {
            return soSanh.soSanh(o1, o2);
        });
    }

    public void inDS() {
        if (dsSV.size() == 0)
            System.out.println("\nDanh sách sinh viên rỗng");
        else {
            System.out.println("\n-----------Danh sách sinh viên-------------");
            dsSV.forEach(SinhVien::inThongTin);
        }
    }
}
