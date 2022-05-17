package behavioral.observer.topic;

public class TopicA implements Topic.ITheoDoiTin{
    Topic topic;
    public TopicA(Topic topic) {
        this.topic = topic;
    }
    @Override
    public void taoThongTin(TinTuc tinTuc) {
        System.out.println("Topic A:\n" + tinTuc.id + ". "+ tinTuc.noiDung);
    }

    @Override
    public void capNhap(int id, String noiDung) {
        System.out.println(id + "." + noiDung);
    }

}
