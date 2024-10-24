package stream;

import java.io.IOException;
import java.io.InputStream;

public class ScannerSysEx {
    public static void main(String[] args) {
        InputStream is = null;

        try {
            is = System.in;

            System.out.print("입력 : ");
            int data = is.read();
            System.out.println("입력값 : "+ (char)data);
            data = is.read();
            System.out.println("입력값 : "+ (char)data);
            data = is.read();
            System.out.println("입력값 : "+ (char)data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(is != null) { try {is.close();} catch (IOException e) { } }
        }
    }
}
