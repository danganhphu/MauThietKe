package behavioral.observer.topic;

import java.util.ArrayList;
import java.util.List;

public class TinTuc {
    int id;
    String noiDung;

    public int getId() {
        return id;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public TinTuc(int id, String noiDung) {
        this.id = id;
        this.noiDung = noiDung;
    }
}
