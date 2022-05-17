package structural.composite.caythumuc;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> abstractFileList = new ArrayList<>();

    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void addItem(AbstractFile folder) {
        if(!abstractFileList.contains(folder)){
            abstractFileList.add(folder);
            folder.path = this.path+ "\\" + folder.ten;
        }
    }

    @Override
    public void removeItem(AbstractFile folder) {
        if(!abstractFileList.contains(folder)) {
            abstractFileList.remove(folder);
        }
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(ore)
                .append(ten);

        for(AbstractFile folder:abstractFileList){
            folder.ore = this.ore + "\t";
            builder.append("\n")
                    .append(folder.getStringTreeFolder());
            folder.ore = "";
        }
        return builder.toString();
    }

}