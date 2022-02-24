package IO;

import java.io.*;

public class TrywithResources {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new StringReader("Hello VVS"));StringWriter writer = new StringWriter();){
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        }catch (IOException e){

        }

    }
}
