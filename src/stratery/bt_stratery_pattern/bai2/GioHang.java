package stratery.bt_stratery_pattern.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GioHang {
    IThanhToan hinhThucTT;
    private int _tienHang;

    public int get_tienHang() {
        return _tienHang;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    List<HangHoa> lsHH = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    byte sl;

    public GioHang( byte sl) {
        this.sl = sl;
        for (int i = 0; i < sl; i++) {
            System.out.print("Nhập tên hàng hóa thứ " + (i+1) + ": ");
            String tenHH = scan.nextLine();

            System.out.print("Nhập giá: ");
            int gia = scan.nextInt();
            _tienHang += gia;
            scan.nextLine();

            System.out.print("Nhập mô tả: ");
            String moTa = scan.nextLine();

            HangHoa hh = new HangHoa(tenHH, gia, moTa);
            lsHH.add(hh);
        }
    }

    public void inDS() {
        if (lsHH.size() == 0)
            System.out.println("\nDanh sách hàng hóa trong giỏ hàng rỗng");
        else {
            System.out.println("\n-----------Danh sách hàng hóa trong giỏ hàng-------------");
            for (HangHoa hh : lsHH) {
                hh.getThongTin();
            }
        }
    }

    public double thanhToan() {
        return hinhThucTT.thanhToan(_tienHang);
    }
}
