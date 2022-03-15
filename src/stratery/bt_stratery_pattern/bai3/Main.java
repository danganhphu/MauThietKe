package stratery.bt_stratery_pattern.bai3;

public class Main {
    public static void main(String[] args) {

        QuanLySinhVien qlsv = new QuanLySinhVien((byte) 2);
//        ISoSanh ssten = new SoSanhTheoTen();
//        qlsv.sapXep();
//        qlsv.setSoSanh(new SoSanhTheoDiem());
//        qlsv.sapXep();
//        qlsv.sapXep();
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();

        qlsv.inDS();
    }
}
