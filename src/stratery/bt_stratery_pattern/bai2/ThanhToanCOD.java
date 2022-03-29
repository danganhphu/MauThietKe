package stratery.bt_stratery_pattern.bai2;

public class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        return (tienHang > 2000000) ? (tienHang * 0.02) : (tienHang);
    }
}
