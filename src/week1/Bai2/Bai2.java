package week1.Bai2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVien objNV = new NhanVien();
        qlnv.them(objNV);
        qlnv.inDS();
    }
}
