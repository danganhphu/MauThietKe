package thigiuaki.cau1;

public class Main {

    public static void main(String[] args) {
        Tour.TourBuilder tourBuilder = new Tour.TourBuilder();

        Tour.getInstance();

        Tour tour = tourBuilder
                .addTenTour("Tour 001")
                .addDsdd(new String[]{"vinh ha long, bien nha trang, Ha Noi"})
                .addGia((float) 5.105)
                .addThoiGian("19/04/2022 7h:45")
                .build();

        tour.hienThi();

    }
}
