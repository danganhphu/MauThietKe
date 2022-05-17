package structural.composite.caythumuc;

public class File extends AbstractFile{

    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    public String getStringTreeFolder() {
        return this.ore + ten;
    }

    @Override
    public void addItem(AbstractFile f) {

    }

    @Override
    public void removeItem(AbstractFile f) {

    }

    @Override
    public String getPath() {
        return super.getPath();
    }
}
