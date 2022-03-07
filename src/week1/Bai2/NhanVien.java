package week1.Bai2;

import java.util.Scanner;

public class NhanVien {

    String ten;
    byte tuoi;
    String diaChi;
    double tienLuong;
    int tongGioLam;

    //đóng gói dữ liệu
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public byte getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongGioLam() {
        return tongGioLam;
    }

    public void setTongGioLam(int tongGioLam) {
        this.tongGioLam = tongGioLam;
    }
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

    public void Nhap() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        ten = scan.nextLine();

        System.out.print("Nhập tuổi: ");
        tuoi = scan.nextByte();
        scan.nextLine();

        System.out.print("Nhập địa chỉ: ");
        diaChi = scan.nextLine();

        System.out.print("Nhập tiền lương: ");
        tienLuong = scan.nextDouble();
        scan.nextLine();

        System.out.print("Nhập ngày công: ");
        tongGioLam = scan.nextInt();
        scan.nextLine();
    }
}

