package behavioral.template.gio_hang;

public class GioHangMain {

    public static void main(String[] args) {
        System.out.println("------Giỏ hàng thanh toán COD------");
        GioHang gioHang = new ThanhToanCOD();
        gioHang.hienThiGioHang();

        System.out.println("\n------Giỏ hàng thanh toán online------");
        gioHang = new ThanhToanOnline();
        gioHang.hienThiGioHang();
    }
}
