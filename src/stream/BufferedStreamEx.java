package stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreamEx {
    public static void main(String[] args) {
        //FileInputStream fis = null;
        BufferedInputStream bis = null;

        try{
            //fis = new FileInputStream("/Users/apple/java/test.txt");
            //bis = new BufferedInputStream(fis);
            bis = new BufferedInputStream(new FileInputStream("/Users/apple/java/test.txt"));

            int data = 0;
            while ((data = bis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e){
            System.out.println("[에러]"+e.getMessage());
        }finally {
            //if(fis != null) { try {fis.close();}catch (IOException e){}}
            if(bis != null) { try {bis.close();}catch (IOException e){}}
        }
    }
}
