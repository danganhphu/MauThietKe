package behavioral.observer.topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<ITheoDoiTin> obsTopic = new ArrayList<>();
    List<TinTuc> tinTuc = new ArrayList<>();

    public void taoMoi (TinTuc tt) {
        tinTuc.add(tt);
        for (ITheoDoiTin t : obsTopic) {
            t.taoThongTin(tt);
        }
    }

    public void capNhap (int id, String noiDung) {
        for (ITheoDoiTin itdt : obsTopic)
            itdt.capNhap(id, noiDung);
    }
    static public interface ITheoDoiTin {
        void taoThongTin(TinTuc tinTuc);
        void capNhap(int id, String noiDung);
    }
}
