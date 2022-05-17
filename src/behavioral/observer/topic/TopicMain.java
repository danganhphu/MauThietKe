package behavioral.observer.topic;

public class TopicMain {
    public static void main(String[] args) {
        TinTuc tinTuc = new TinTuc(1, "Hom nay hoc mau thiet ke");

        Topic topic = new Topic();
        TopicA phu = new TopicA(topic);
        TopicB anh = new TopicB(topic);

        topic.taoMoi(tinTuc);
        phu.taoThongTin(tinTuc);
        anh.taoThongTin(tinTuc);

        System.out.println("Cap nhat topic A");
        phu.capNhap(1, "Hom nay la thu ba");
    }
}
