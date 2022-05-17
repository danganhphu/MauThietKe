package behavioral.observer.atm;

public class ATM {

    private ITaiKhoanATM taiKhoan;
    public void attach(ITaiKhoanATM taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    public void detach() {
        this.taiKhoan = null;
    }

    private boolean kiemTraTienRut(int soTienRut) {
        return taiKhoan.kiemTraSoDu(soTienRut);
    }

    public void rutTien(int soTienRut) {
        if (taiKhoan != null) {
            if (kiemTraTienRut(soTienRut))
                taiKhoan.nhanThongBao(soTienRut, true);
            else
                taiKhoan.nhanThongBao(soTienRut, false);
        }
        else
            System.out.println("Không có thẻ trong máy!!!");
    }

    public static interface ITaiKhoanATM {
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienRut, boolean thanhCong);
    }

}
