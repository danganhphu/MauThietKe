package creational.builder.hoadon;

public class HoaDonHeader {
    String maHD;
    String ngayBan;
    String tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "maHD: " + maHD + ", ngayBan: " + ngayBan + ", tenKH: " + tenKH;
    }
}
