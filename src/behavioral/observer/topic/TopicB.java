package behavioral.observer.topic;

import java.util.ArrayList;
import java.util.List;

public class TopicB implements Topic.ITheoDoiTin{
    Topic topic;
    List<TinTuc> dsTinTuc = new ArrayList<>();

    public TopicB(Topic topic) {
        this.topic = topic;
    }

    @Override
    public void taoThongTin(TinTuc tinTuc) {
        dsTinTuc.add(tinTuc);
        System.out.println("Topic B:\n" + tinTuc.id + ". " + tinTuc.noiDung);
    }

    @Override
    public void capNhap(int id, String noiDung) {
        for (TinTuc tt: dsTinTuc) {
            if (tt.id == id) {
                tt.noiDung = noiDung;
                break;
            }
        }
        System.out.println(id + ". " + noiDung);
    }
}
