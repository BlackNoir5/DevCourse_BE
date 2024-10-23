package file;

import java.io.File;
import java.io.IOException;

public class File2Ex {
    public static void main(String[] args) {
        File file = new File(" /Users/apple/java/dir1");
        System.out.println(file.mkdir());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        System.out.println(file.exists());

        File file2 = new File("/Users/apple/java/dir2");
        System.out.println(file2.isHidden());

        System.out.println(file2.exists());

        File file3 = new File(".");
        System.out.println(file3.getName());
        System.out.println(file3.getParent());
        System.out.println(file3.getPath());

        try{
            System.out.println(file3.getCanonicalPath());
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
