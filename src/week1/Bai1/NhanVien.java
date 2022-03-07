package week1.Bai1;

public class NhanVien {
    String ten;
    byte tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    //constructor
    public NhanVien() {
        ten = "Anh Phú";
        tuoi = 22;
        diaChi = "Nha Trang";
        tienLuong = 8.8;
        tongGioLam = 150;
    }

    public NhanVien(String ten, byte tuoi, String diaChi, double tienLuong, int tongGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }

    //phương thức
    public String getThongTin() {
        return "Tên: " + ten + "\tTuổi: " + tuoi + "\tĐịa chỉ: " + diaChi + "\tLương: " + tienLuong + "\tTổng GL: " + tongGioLam;
    }

    public double tinhThuong() {
        if (tongGioLam >= 200)
            return tienLuong * 0.2;
        else {
            if (tongGioLam >= 100)
                return tienLuong * 0.1;
            else
                return 0;
        }
    }
}
