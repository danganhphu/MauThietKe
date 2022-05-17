package behavioral.chain_responsibility.tien_dien;

public class TinhTienDien implements ITinhTienDien {
    ITinhTienDien bacThapHon;
    String nhan;
    float min, max;
    float gia;

    public TinhTienDien(String nhan, float min, float max, float gia) {
        this.nhan = nhan;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    @Override
    public ITinhTienDien thietLapBac(ITinhTienDien loaiBac) {
        bacThapHon = loaiBac;
        return loaiBac;
    }

    @Override
    public float tinhTienDien(float soKwh) {
        if (soKwh <= max)
            return (soKwh - min) * gia;
        else if(bacThapHon != null)
            return bacThapHon.tinhTienDien(soKwh) + (max - min) * gia;
        return (soKwh - min) * gia;
    }
}
