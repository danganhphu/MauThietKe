package behavioral.template.gio_hang;

public class MatHang {
    String tenMH;
    int soLuong;
    float donGia;

    public MatHang(String tenMH, int soLuong, float donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void getThongTin() {
        System.out.println( "Tên MH: " + tenMH + "\t\tSố lượng: " + soLuong + "\t\tĐơn giá: " + donGia +
                "\t\tThành tiền: " + donGia * soLuong);
    }
}
