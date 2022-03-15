package stratery.bt_stratery_pattern.bai2;

public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public void getThongTin() {
        System.out.println("Tên hh: " + tenHH + "\tGiá: " + gia + "\tMô tả: " + moTa);
    }
}
