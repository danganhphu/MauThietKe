package behavioral.chain_responsibility.ATM;

public class RutTienATM {
    public static void main(String[] args) {
        RutTien rutTien100 = new RutTien(100);
        RutTien rutTien50 = new RutTien(50);
        RutTien rutTien20 = new RutTien(20);
        RutTien rutTien5 = new RutTien(5);

        rutTien100.thietLapRutTien(rutTien50)
                .thietLapRutTien(rutTien20)
                .thietLapRutTien(rutTien5);

        System.out.println("Số tờ rút 2675: ");
        rutTien100.demSoTo(2675);
//        System.out.println("Tờ 50: " +  rutTien50.demSoTo(2675));
//        System.out.println("Tờ 20: " + rutTien20.demSoTo(2675));
//        System.out.println("Tờ 5: " +rutTien5.demSoTo(2675));

    }
}
