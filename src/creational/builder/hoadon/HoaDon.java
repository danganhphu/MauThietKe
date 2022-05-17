package creational.builder.hoadon;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List <CTHD> ds;

    public HoaDon(HoaDonHeader hoaDonHeader, List<CTHD> ds) {
        this.hoaDonHeader = hoaDonHeader;
        this.ds = ds;
    }
    public void showInfo(){
        System.out.println(hoaDonHeader.toString());
        for(CTHD ct: ds)
            System.out.println(ct.toString());
    }


    public static class Builder{
        HoaDonHeader hoaDonHeader;
        List <CTHD> ds= new ArrayList<>();

        public Builder(){

        }
        public Builder addHoaDonHeader(String maHD, String ngayBan, String tenKH){
            hoaDonHeader = new HoaDonHeader(maHD, ngayBan, tenKH);
            return this;
        }
        public Builder addCTHD(String sanPham, int soLuong, int donGia, float chietKhau){
            ds.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(hoaDonHeader, ds);
        }
    }
}
