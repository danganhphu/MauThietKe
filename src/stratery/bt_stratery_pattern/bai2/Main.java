package stratery.bt_stratery_pattern.bai2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Giỏ hàng 1: ");
        GioHang gh1 = new GioHang((byte) 2);
        System.out.println("\nGiỏ hàng 2 ");
        GioHang gh2 = new GioHang((byte) 3);
        IThanhToan online = new ThanhToanOnline();
        IThanhToan cod = new ThanhToanCOD();

        //danh sách giỏ hàng 1
        gh1.inDS();
        System.out.println("Tổng tiền hàng: " + gh1.get_tienHang());
        gh1.setHinhThucTT(online);
        System.out.println("Số tiền thanh toán Online: " + gh1.thanhToan());
        gh1.setHinhThucTT(cod);
        System.out.println("Số tiền thanh toán COD: " + gh1.thanhToan());

        //danh sách giỏ hàng 2
        gh2.inDS();
        System.out.println("Tổng tiền hàng: " + gh2.get_tienHang());
        gh2.setHinhThucTT(online);
        System.out.println("Số tiền thanh toán Online: " + gh2.thanhToan());
        gh2.setHinhThucTT(cod);
        System.out.println("Số tiền thanh toán COD: " + gh2.thanhToan());
    }
}
