package behavioral.template.gio_hang;

public class ThanhToanOnline extends GioHang{
    @Override
    public double tinhChietKhau() {
        return (tinhTien() < 1000000) ? (tinhTien() * 0.03) : (tinhTien() * 0.05);
    }
}
