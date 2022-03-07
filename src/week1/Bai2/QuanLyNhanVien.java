package week1.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien implements IQuanLy{
    static List<NhanVien> lsNV = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    byte sl;
    public QuanLyNhanVien () {
        sl = 0;
    }
    public QuanLyNhanVien(byte sl) {
        this.sl = sl;
        for (int i = 0; i < sl; i ++) {
            System.out.print("Nhập tên: ");
            String ten = scan.nextLine();
            System.out.print("Nhập tuổi: ");
            byte tuoi = scan.nextByte();
            System.out.print("Nhập địa chỉ: ");
            String diaChi = scan.nextLine();
            System.out.print("Nhập tiền lương: ");
            double tienLuong = scan.nextDouble();
            System.out.print("Nhập ngày công: ");
            int tongGioLam = scan.nextInt();
            NhanVien nv = new NhanVien(ten, tuoi, diaChi, tienLuong, tongGioLam);
            lsNV.add(nv);
        }
    }
    @Override
    public void them(NhanVien nv) {
        System.out.print("Nhập số nhân viên cần thêm: ");
        byte n = scan.nextByte();
        for (int i = 0; i < n; i++) {
            nv = new NhanVien();
            System.out.println("\nNhập nhân viên thứ: " + (i + 1));
            nv.Nhap();
            lsNV.add(nv);
        }
    }
    @Override
    public void inDS() {
        if (lsNV.size() == 0)
            System.out.println("Danh sách nhân viên rỗng");
        else {
            System.out.println("-----------Danh sách nhân viên-------------");
            for (NhanVien nv : lsNV)
                System.out.println(nv.getThongTin());
        }
    }
}
