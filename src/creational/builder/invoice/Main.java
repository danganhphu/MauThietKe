package creational.builder.invoice;

public class Main {

    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDonBuilder()
                .addHoaDonHeader("HD01", "29-03-2022","Anh Phú")
                .addCTHD("Đồng hồ", 2, 800000, (float)0.05)
                .addCTHD("khuyên tai", 1,400000 , (float) .01)
                .build();

        hoaDon.showInfo();
    }
}
