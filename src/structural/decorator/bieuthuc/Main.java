package structural.decorator.bieuthuc;

public class Main {

    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(6);
        bieuThuc = new Cong(bieuThuc, 9);
        bieuThuc = new Nhan(bieuThuc, 8);
        bieuThuc = new Cong(bieuThuc, 5);
        System.out.println(bieuThuc.bieuThuc() + " = " + bieuThuc.giaTri());

        BieuThuc bieuThuc2 = new BieuThucDonGian(8);
        bieuThuc2 = new Cong(bieuThuc2, 6);
        bieuThuc2 = new Chia(bieuThuc, 2);
        bieuThuc2 = new Nhan(bieuThuc2, 5);
        bieuThuc2 = new Cong(bieuThuc2, 8);
        bieuThuc2 = new Tru(bieuThuc2, 4);
        bieuThuc = new TriTuyetDoi(bieuThuc, bieuThuc.giaTri());
        System.out.println(bieuThuc2.bieuThuc() + " = " + bieuThuc2.giaTri());

    }
}
