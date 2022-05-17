package behavioral.template.gio_hang;

import java.util.ArrayList;
import java.util.List;

public abstract class GioHang {
    List<MatHang> gioHang = new ArrayList<>();

    public GioHang() {
        gioHang.add(new MatHang("áo thun nam", 2, (float) 350000));
        gioHang.add(new MatHang("Giày AF1 Pari", 1, (float) 800000));
        gioHang.add(new MatHang("balo nam", 1, (float) 150000));
    }
    public double tinhTien() {
        float tongTien = 0;
        for (MatHang mh:gioHang) {
           tongTien += mh.donGia * mh.soLuong;
        }
        return tongTien;
    }

    public abstract double tinhChietKhau();

    public void hienThiGioHang() {
        if (gioHang.size() == 0)
            System.out.println("Danh sách hàng hóa trong giỏ hàng rỗng");
        else {
            System.out.println("-----------Danh sách hàng hóa trong giỏ hàng-------------");
            gioHang.forEach(MatHang::getThongTin);
        }

        System.out.println("Tổng tiền mua hàng: " + tinhTien());
        System.out.println("Tiền chiết khấu: " + tinhChietKhau());
        System.out.println("Tiền khách hàng cần thanh toán: " + (tinhTien() - tinhChietKhau()));
    }
}
