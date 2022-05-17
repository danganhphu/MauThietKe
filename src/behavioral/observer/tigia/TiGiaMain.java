package behavioral.observer.tigia;

public class TiGiaMain {
    public static void main(String[] args) {
        TiGia tg = new TiGia(20500);
        NhaDauTuA a = new NhaDauTuA();
        NhaDauTuB b = new NhaDauTuB();
        a.attach();
        b.attach();
        //dvtg.dangKy(a); viết như vầy sai vì đây là subject đăng kí, phải để observer đăng kí
        tg.notify(21000);
        System.out.println("------------------------------");
        tg.notify(20300);
        b.attach();
        System.out.println("------------------------------");
        tg.notify(20600);
    }
}
