package file;

import java.io.File;
import java.io.IOException;

public class File4Ex {
    public static void main(String[] args) {
        try{
            File file = new File("Users/apple/java/test2.txt");
            file.createNewFile();
        } catch ( IOException e ){
            e.getMessage();
        }
    }
}
