package stratery.bt_stratery_pattern.bai3;

public class SoSanhTheoTen implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien sv1, SinhVien sv2) {
        return (sv1.getHoTen().compareTo(sv2.getHoTen()));
    }
}
