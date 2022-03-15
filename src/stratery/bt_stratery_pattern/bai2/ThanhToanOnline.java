package stratery.bt_stratery_pattern.bai2;

public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        return (tienHang < 10) ? (tienHang * 0.02) : (tienHang * 0.07);
    }
}
