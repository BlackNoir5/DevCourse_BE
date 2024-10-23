package file;

import java.io.File;
import java.util.Date;

public class File3Ex {
    public static void main(String[] args) {
        File file = new File("/Users/apple/java/practice2.txt");
        long fileSize = file.length();
        System.out.println("File size : "+ fileSize);

        long fileDate = file.lastModified();
        System.out.println(fileDate);
        System.out.println(new Date(fileDate).toLocaleString());
    }
}
