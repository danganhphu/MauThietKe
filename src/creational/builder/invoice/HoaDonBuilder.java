package creational.builder.invoice;

import java.util.ArrayList;

public class HoaDonBuilder implements IHoaDonBuilder{
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> dsCthd = new ArrayList<>();
    @Override
    public HoaDonBuilder addHoaDonHeader(String maHD, String ngayBan, String tenKH) {
        hoaDonHeader = new HoaDonHeader(maHD, ngayBan, tenKH);
        return this;
    }

    @Override
    public HoaDonBuilder addCTHD(String sanPham, int soLuong, float donGia, float chietKhau) {
        dsCthd.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
        return this;
    }

    @Override
    public HoaDon build() {
        return new HoaDon(hoaDonHeader, dsCthd);
    }
}
