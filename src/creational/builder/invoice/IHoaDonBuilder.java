package creational.builder.invoice;

public interface IHoaDonBuilder {
    HoaDonBuilder addHoaDonHeader(String maHD, String ngayBan, String tenKH);
    HoaDonBuilder addCTHD(String sanPham, int soLuong, float donGia, float chietKhau);

    HoaDon build();
}