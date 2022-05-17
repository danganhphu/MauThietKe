package thigiuaki.cau1;

import java.util.Arrays;

public class Tour {
    String tenTour;
    String[] dsdd;
    float gia;
    String thoiGian;

    private static Tour instance;
    private Tour() {
        super();
    }

    public synchronized static Tour getInstance() {
        if (instance == null)
            instance = new Tour();
        return instance;
    }

    private Tour(TourBuilder tourBuilder) {
        this.tenTour = tourBuilder.tenTour;
        this.dsdd = tourBuilder.dsdd;
        this.gia = tourBuilder.gia;
        this.thoiGian = tourBuilder.thoiGian;
    }

    public void hienThi() {
        System.out.println("Tên tour: " + tenTour + ", Dsdd: " + Arrays.toString(dsdd) +
                ", Giá: " + gia + ", Thời gian: " + thoiGian);
    }

    public static class TourBuilder {
        String tenTour;
        String[] dsdd;
        float gia;
        String thoiGian;

        public TourBuilder addTenTour(String tenTour) {
            this.tenTour = tenTour;
            return this;
        }

        public  TourBuilder addDsdd(String[] dsdd) {
            this.dsdd = dsdd;
            return this;
        }

        public TourBuilder addGia(float gia) {
            this.gia = gia;
            return this;
        }

        public TourBuilder addThoiGian(String thoiGian) {
            this.thoiGian = thoiGian;
            return this;
        }

        public Tour build() {
            return new Tour (this);
        }
    }
}
