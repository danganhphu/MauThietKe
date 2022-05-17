package behavioral.observer.atm;

public class ATMMain {

    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan phu = new TaiKhoan("Phú", 5000, atm);
        TaiKhoan anh = new TaiKhoan("anh", 3000, atm);
        System.out.println("Giao dịch 1: ");
        phu.duaTheATM();
        atm.rutTien(2000);
        phu.rutTheATM();

        System.out.println("Giao dịch 2: ");
        anh.duaTheATM();
        atm.rutTien(1000);

        System.out.println("Giao dịch 3");
        atm.rutTien(500);
        anh.rutTheATM();

        System.out.println("Giao dịch 4: ");
        atm.rutTien(800);

    }
}
