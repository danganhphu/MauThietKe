package behavioral.template.data;


public class QLSinhVien extends QLDaTa<SinhVien>{

    @Override
    protected int khoa(SinhVien sinhVien) {
        return sinhVien.getId();
    }

    @Override
    public void hienThiDoiTuong(SinhVien sinhVien) {
        sinhVien.getThongTin();
    }
}
