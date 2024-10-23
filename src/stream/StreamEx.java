package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx {
    public static void main(String[] args) {
        //파일 내용 복사
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("/Users/apple/java/test.txt");
            fos = new FileOutputStream("/Users/apple/java/newTest.txt");

            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("복사 완료");

        } catch (IOException e ){
            System.out.println("[에러]" + e.getMessage());
        }finally{
            if(fis != null) { try {fis.close();}catch (IOException e){}}
            if(fos != null) { try {fos.close();}catch (IOException e){}}
        }
    }
}
