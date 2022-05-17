package structural.composite.caythumuc;

public abstract class AbstractFile {
    String ten;
    String ngayTao;
    String path;
    String ore = " ";

    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.path = ten;
    }

    public abstract void addItem(AbstractFile f);
    public abstract void removeItem(AbstractFile f);
    public abstract String getStringTreeFolder();

    public String getPath() {
        return path;
    }
}
