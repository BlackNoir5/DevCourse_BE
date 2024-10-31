package lambda;

import java.io.File;
import java.util.stream.Stream;

public class FileStreamEx {
    public static void main(String[] args) {
        File file1 = new File("ext.java");
        File file2 = new File("ext.bak");
        File file3 = new File("ext1.java");
        File file4 = new File("ext2");
        File file5 = new File("ext.txt");

        File[] fileArr = {file1,file2,file3,file4,file5};

        Stream<File> fileStream = Stream.of(fileArr);
        //fileStream.map(File::getName).forEach(System.out::println);

        //확장자 추출
        //확장자 없는 제외
        //중복제거
        fileStream.map(File::getName)
                .filter(s->s.indexOf('.')!=-1)
                .peek(s-> System.out.println("peek "+s))
                .map(s->s.substring(s.indexOf('.')+1))
                .distinct()
                .forEach(System.out::println);
    }
}
