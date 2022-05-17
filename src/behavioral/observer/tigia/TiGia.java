package behavioral.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {

    List<IThayDoiTiGia> observer = new ArrayList<>();
    float tiGia;


    public TiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public void attach(IThayDoiTiGia o) {
        if(!observer.contains(o)) {
            observer.add(o);
        }
    }

    public void detach(IThayDoiTiGia o) {
        if (observer.contains(o))
            observer.remove(o);
    }

    public void notify(float tiGiaMoi) {
        this.tiGia = tiGiaMoi;
        for (IThayDoiTiGia o: observer)
            o.capNhatTigia(tiGia);
    }

    static public interface IThayDoiTiGia {
        void capNhatTigia(float tiGiaMoi);
    }
}
