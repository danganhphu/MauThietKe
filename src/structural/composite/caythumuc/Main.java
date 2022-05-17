package structural.composite.caythumuc;

public class Main {
    public static void main(String[] args) {
        AbstractFile abstractFile = new Folder("Data (D:)", "26/04/2022");
        AbstractFile abstractFile1 = new Folder("TaiLieu", "26/04/2022");
        abstractFile.addItem(abstractFile1);

        AbstractFile abstractFile2 = new Folder("Design Pattern", "26/04/2022");
        abstractFile1.addItem(abstractFile2);
        abstractFile2.addItem(new File("CreationalPattern.pptx", "26/04/2022"));
        abstractFile2.addItem(new File("StructuralPattern.pptx", "26/04/2022"));

        AbstractFile abstractFile3 = new Folder("Lap Trinh Java", "26/04/2022");
        abstractFile1.addItem(abstractFile3);
        abstractFile3.addItem(new File("LapTrinhJavaCoBan.docx", "26/04/2022"));
        abstractFile3.addItem(new File("LapTrinhJavaCoBan.pdf", "26/04/2022"));

        abstractFile1.addItem(new File("NgonNguLapTrinhC.pdf", "26/04/2022"));
        AbstractFile abstractFile4 = new Folder("LapTrinhThietBiDiDong", "26/04/2022");
        abstractFile1.addItem(abstractFile4);
        abstractFile4.addItem(new File("CoBan.pttx", "26/04/2022"));
        abstractFile4.addItem(new File("NangCao.pptx", "26/04/2022"));
        System.out.println(abstractFile.getStringTreeFolder());
        System.out.println(abstractFile4.getPath());
    }
}
