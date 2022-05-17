package behavioral.template.data;

public class SinhVienMain {

    public static void main(String[] args) {
        QLDaTa<SinhVien> sv = new QLSinhVien();

        sv.them(new SinhVien(10, "sv01", "Anh Phú", "10-10-2001", "Quy Nhơn"));
        sv.them(new SinhVien(11, "sv02", "Văn Tình", "01-09-2000", "Phù Cát"));
        sv.them(new SinhVien(12, "sv03", "Anh Thi", "12-09-2001", "Hoài Nhơn"));

        sv.hienThi();
        sv.capNhap(new SinhVien(10, "sv01", "phu", "10-10-2001", "Quy Nhơn"));

        System.out.println("-----------------------");
        sv.hienThi();
    }
}
