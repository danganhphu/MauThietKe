package behavioral.chain_responsibility.tien_dien;

public interface ITinhTienDien {
    ITinhTienDien thietLapBac(ITinhTienDien loaiBac);
    float tinhTienDien(float soKwh);
}
