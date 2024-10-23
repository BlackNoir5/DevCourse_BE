package stream;

import java.io.FileReader;
import java.io.IOException;

public class IO2Ex {
    public static void main(String[] args) {
        FileReader fr = null;

        try{
            fr = new FileReader("/Users/apple/java/test.txt");

            int data=0;
            while((data=fr.read())!=-1){
                System.out.println((char) data);
            }
        } catch (IOException e){
            System.out.println("[에러]"+e.getMessage());
        } finally {
            if(fr != null){try{fr.close();} catch (IOException e) {} }
        }
    }
}
