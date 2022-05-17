package behavioral.observer.tigia;

public class NhaDauTuA implements TiGia.IThayDoiTiGia{
    TiGia tg;
    float tiGia;
    public void attach() {
        this.tiGia = tg.tiGia;
        tg.attach(this);
    }

    public void detach() {
        tg.detach(this);
    }
    @Override
    public void capNhatTigia(float tiGiaMoi) {
        if(tiGiaMoi > 0)
            System.out.println("bán ra");
        else {
            if (tiGiaMoi == 0)
                System.out.println("Ngồi chờ");
            else
                System.out.println("mua vào");
        }
    }
}
