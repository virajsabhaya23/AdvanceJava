package DirectoriesEx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassEx {
    public static void main(String[] args) {

        Path path = Paths.get("Hello World.txt");
        try{
            Files.deleteIfExists(path);
        }catch (IOException ex){

        }
    }
}
