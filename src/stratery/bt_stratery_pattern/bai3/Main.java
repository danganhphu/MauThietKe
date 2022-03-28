package stratery.bt_stratery_pattern.bai3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        QuanLySinhVien qlsv = new QuanLySinhVien((byte) 2);
        QuanLySinhVien qlsv = new QuanLySinhVien();
//        qlsv.getLsSV().add(new SinhVien("phu", new Date(), 7,8));
//        ISoSanh ssten = new SoSanhTheoTen();
//        qlsv.sapXep();

        qlsv.sapXep();
        qlsv.inDS();

        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
