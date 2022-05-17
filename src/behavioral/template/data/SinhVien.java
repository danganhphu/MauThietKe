package behavioral.template.data;

public class SinhVien {
    int id;
    String mssv, ten, ngaySinh, queQuan;

    public SinhVien(int id, String mssv, String ten, String ngaySinh, String queQuan) {
        this.id = id;
        this.mssv = mssv;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void getThongTin() {
        System.out.println("Id: " + id + "\tMssv: " + mssv + "\tTên: " + ten + "\tNgày Sinh: " + ngaySinh + "\tQuê quán: " + queQuan);
    }
}
