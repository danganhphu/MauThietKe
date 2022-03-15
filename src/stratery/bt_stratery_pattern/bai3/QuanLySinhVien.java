package stratery.bt_stratery_pattern.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {
    List<SinhVien> lsSV = new ArrayList<SinhVien>();
    static ISoSanh<SinhVien> soSanh;


    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    
    Scanner scan = new Scanner(System.in);
    byte sl;
    public QuanLySinhVien(byte sl) {
        this.sl = sl;
        for (int i = 0; i < sl; i++) {
            System.out.print("Nhập họ tên sv thứ " + (i + 1) + ": ");
            String hoTen = scan.nextLine();

            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date ngaySinh = null;
            try {
                System.out.print("Nhập ngày sinh: ");
                ngaySinh = df.parse(scan.nextLine());
            } catch (ParseException ex) {
                System.out.println("Nhập sai định dạng");

            }

            System.out.print("Nhập điểm trung bình: ");
            float diemTB = scan.nextFloat();
            scan.nextLine();

            SinhVien sv = new SinhVien(hoTen, ngaySinh, diemTB);
            lsSV.add(sv);
        }

    }

    public static int soSanh(SinhVien sv1, SinhVien sv2) {
        return soSanh.soSanh(sv1, sv2);
    }
    public void sapXep() {
        lsSV.sort(QuanLySinhVien::soSanh);
    }

    public void inDS() {
        if (lsSV.size() == 0)
            System.out.println("\nDanh sách sinh viên rỗng");
        else {
            System.out.println("\n-----------Danh sách sinh viên-------------");
            lsSV.forEach(SinhVien::inThongTin);
        }
    }
}
