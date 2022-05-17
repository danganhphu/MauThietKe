package creational.builder.hoadon;

public class Main {

    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .addHoaDonHeader("HD01", "10-03-2022","Anh Phú")
                .addCTHD("Đồng hồ", 2, 800000, (float)0.05)
                .addCTHD("Khuyên tai", 1,400000 , (float) 0.02)
                .build();

        hoaDon.showInfo();
    }

}
