package creational.builder.invoice;

import java.util.ArrayList;

public class CTHD {
    private String sanPham;
    private int soLuong;
    private float donGia;

    public CTHD(String sanPham, int soLuong, float donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    private float chietKhau;

//    private ArrayList<CTHD> cthdList = new ArrayList<CTHD>();

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CT hóa đơn [sản phẩm: " + sanPham + ", số lượng: " + soLuong +", đơn giá: "
                + donGia + ", chiết khấu: " + chietKhau + "]";
    }
}
