package DirectoriesEx;

import java.io.File;
import java.io.FilenameFilter;

public class DirEx {
    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName) -> {
          return fileName.contains(".");
        };

        String[] contents = new File(".").list(filter);
        for(String file : contents){
            System.out.println(file);
        }

        new File("CreatingDirectory").mkdir();
    }
}

