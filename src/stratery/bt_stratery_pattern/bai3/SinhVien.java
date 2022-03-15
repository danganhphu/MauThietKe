package stratery.bt_stratery_pattern.bai3;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String hoTen;
    private Date ngaySinh;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    private float diemTB;

    public SinhVien() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public void inThongTin() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Họ tên: " + hoTen + "\t Ngày sinh: " + df.format(ngaySinh) + "\t Điểm tb: " + diemTB);
    }
}
