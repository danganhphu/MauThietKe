package creational.builder.hoadon;

public class CTHD {
    String sanPham;
    int soLuong;
    int donGia;
    float chietKhau;

    public CTHD(String sanPham, int soLuong, int donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "sanPham=" + sanPham + ", soLuong=" + soLuong + ", donGia=" + donGia + ", chietKhau=" + chietKhau;
    }

}
