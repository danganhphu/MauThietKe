package stratery.bt_stratery_pattern.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {
    List<SinhVien> lsSV = new ArrayList<>();
    static ISoSanh<SinhVien> soSanh;


    public void setSoSanh(ISoSanh<SinhVien> value) {
        soSanh = value;
    }

    public List<SinhVien> getLsSV() {
        return lsSV;
    }
    public QuanLySinhVien() {
        lsSV = new ArrayList<SinhVien>();
    }

//    Scanner scan = new Scanner(System.in);
//    byte sl;
//    public QuanLySinhVien(byte sl) {
//        this.sl = sl;
//        for (int i = 0; i < sl; i++) {
//            System.out.print("Nhập họ tên sv thứ " + (i + 1) + ": ");
//            String hoTen = scan.nextLine();
//
//            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//            Date ngaySinh = null;
//            try {
//
//                System.out.print("Nhập ngày sinh: ");
//                ngaySinh = df.parse(scan.nextLine());
//            } catch (ParseException ex) {
//                System.out.println("Nhập sai định dạng");
//            }
//
//            System.out.print("Nhập điểm trung bình: ");
//            float diemTB = scan.nextFloat();
//            scan.nextLine();
//
//            SinhVien sv = new SinhVien(hoTen, ngaySinh, diemTB);
//            lsSV.add(sv);
//        }

//    }

    public void sapXep() {
        lsSV.sort((o1, o2) -> {
            return soSanh.soSanh(o1, o2);
        });
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
