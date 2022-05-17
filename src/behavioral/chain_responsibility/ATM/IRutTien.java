package behavioral.chain_responsibility.ATM;

public interface IRutTien {
    IRutTien thietLapRutTien(IRutTien rutTien);
    void demSoTo(int tongTien);
}
