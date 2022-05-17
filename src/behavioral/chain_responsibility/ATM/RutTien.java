package behavioral.chain_responsibility.ATM;

import creational.singleton.Election;

public class RutTien implements IRutTien{
    int menhGia;
    IRutTien rutTien;

    public RutTien(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public IRutTien thietLapRutTien(IRutTien rutTien) {
        this.rutTien = rutTien;
        return rutTien;
    }

    @Override
    public void demSoTo(int tongTien) {
        if (tongTien >= menhGia) {
            int soTo = (int)tongTien / menhGia;
            System.out.println("mệnh giá: " + menhGia + ": " + soTo);
            if (rutTien != null)
                demSoTo(tongTien % menhGia);
        }
        else
            if (rutTien != null)
                rutTien.demSoTo(tongTien);
    }
}
