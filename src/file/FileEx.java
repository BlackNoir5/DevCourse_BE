package file;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        //Directory

        //경로 절대/상대
        //경로를 통해서 File 객체 생성
        //디렉토리에 대한 File 객체 생성
        //File dir = new File
        File dir = new File("/Users/apple/java");
        System.out.println(dir);

        File file = new File("/Users/apple/java/text.txt");
        System.out.println(file);
        File file2 = new File("/Users/apple/java","test.txt");
        System.out.println(file2);

        System.out.println(dir.exists());
        System.out.println(file.exists());

    }
}
