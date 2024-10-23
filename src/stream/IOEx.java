package stream;

import java.io.*;

public class IOEx {
    public static void main(String[] args) {
        //파일 내용 복사
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream("/Users/apple/java/test.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("/Users/apple/java/newTest.txt"));

            int data = 0;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            System.out.println("복사 완료");

        } catch (IOException e ){
            System.out.println("[에러]" + e.getMessage());
        }finally{
            if(bis != null) { try {bis.close();}catch (IOException e){}}
            if(bos != null) { try {bos.close();}catch (IOException e){}}
        }
    }
}
