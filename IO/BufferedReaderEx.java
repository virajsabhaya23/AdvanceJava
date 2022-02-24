package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
    public static void main(String[] args) {

        File myFile = new File("Example.txt");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(myFile));

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
        }


    }
}
