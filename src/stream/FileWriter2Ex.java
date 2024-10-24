package stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2Ex {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            // 덮어쓰기
            fw = new FileWriter("./test.txt", true);
            fw.write("Hello");
            fw.write(System.lineSeparator());
            fw.write("Hello");

            System.out.println("출력 완료");
        } catch ( IOException e ) {
            System.out.println(e.getMessage());
        } finally {
            if (fw != null) { try { fw.close(); } catch (IOException e) {} }
        }
    }
}
