package creational.builder.invoice;

public class Main {

    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDonBuilder()
                .addHoaDonHeader("HD01", "06-04-2021","Đức Huy")
                .addCTHD("Đồng hồ", 2, 800000, (float)0.05)
                .addCTHD("Vòng tay", 1,400000 , 0)
                .build();

        hoaDon.showInfo();
    }
}
