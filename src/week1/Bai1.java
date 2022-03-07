package week1;
import javax.swing.JOptionPane;

public class Bai1 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("Nhi", (byte) 23, "Khánh Hòa",  8.7, 77);
        System.out.println("Thông tin nhân viên 1");
        System.out.println(nv1.getThongTin() + "\tTiền thưởng: "+ nv1.tinhThuong());
        System.out.println("Thông tin nhân viên 2");
        System.out.println(nv2.getThongTin() + "\tTiền thưởng: "+ nv2.tinhThuong());
    }
}
