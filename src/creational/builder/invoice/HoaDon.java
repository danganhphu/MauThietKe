package creational.builder.invoice;

import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> dsCthd;

    public HoaDon(HoaDonHeader hoaDonHeader, ArrayList<CTHD> dsCthd) {
        this.hoaDonHeader = hoaDonHeader;
        this.dsCthd = dsCthd;
    }
    public void showInfo(){
        System.out.println(hoaDonHeader.toString());
        for(CTHD ct: dsCthd)
            System.out.println(ct.toString());
    }
}
