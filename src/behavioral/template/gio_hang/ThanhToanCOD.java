package behavioral.template.gio_hang;

public class ThanhToanCOD extends GioHang{
    @Override
    public double tinhChietKhau() {
        return (tinhTien() >= 1000000) ? (tinhTien() * 0.05) : 0;
    }
}
