package stratery.bt_stratery_pattern.bai1;

public class Main {
    public static void main(String[] args) {

//        Context context = new Context();
//        ITinh cong = new Cong();
//        ITinh tru = new Tru();
//
//        context.setTinhToan(cong);
//        System.out.println("Kết quả cộng: " + context.tinh(75, 12));
//
//        context.setTinhToan(tru);
//        System.out.println("Kết quả trừ: " + context.tinh(54, 78));
        Context context = new Context(new Cong());
        System.out.println("Addition = " + context.tinh(75, 12));

        context = new Context(new Tru());
        System.out.println("Addition = " + context.tinh(54, 78));
    }
}
