package behavioral.chain_responsibility.tien_dien;

import java.util.Scanner;

public class TienDienMain {

    public static void main(String[] args) {

        ITinhTienDien bac6 = new TinhTienDien("Bậc 6: từ 401 kwh",  400, Float.MAX_VALUE, (float) 2.927);
        ITinhTienDien bac5 = new TinhTienDien("Bậc 5: từ 301 - 400 kwh", 300, 400, (float) 2.834);
        ITinhTienDien bac4 = new TinhTienDien("Bậc 4: trên 201 - 300 kwh", 200, 300, (float) 2.536);
        ITinhTienDien bac3 = new TinhTienDien("Bậc 3: trên 101 - 200kwh", 100, 200, (float) 2.014);
        ITinhTienDien bac2 = new TinhTienDien("Bậc 2: trên 51- 10 kwh", 50, 100, (float) 1.734);
        ITinhTienDien bac1 = new TinhTienDien("Bậc 1 (0 đến 50kWh): 1.678 đồng/kWh", 0, 50, (float) 1.678);

        bac1.thietLapBac(bac2)
                .thietLapBac(bac3)
                .thietLapBac(bac4)
                .thietLapBac(bac5)
                .thietLapBac(bac6);

        float soKwh = 200;

        System.out.format("Tiền điện phải trả cho %.1f là: %.4f ", soKwh, bac1.tinhTienDien(soKwh)*1.1);


    }
}
