package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO4Ex {
    public static void main(String[] args) {
        BufferedReader br = null;
//      FileReader fr = null;


        try{
//          fr = new FileReader("/Users/apple/java/test.txt");
            br = new BufferedReader( new FileReader("/Users/apple/java/test.txt"));

//            int data=0;
//            while((data=br.read())!=-1){
//                System.out.println((char) data);
//            }
            String line = null;
            while((line= br.readLine())!=null){
                System.out.println(line);
            }
        } catch (
                IOException e){
            System.out.println("[에러]"+e.getMessage());
        } finally {
            if(br != null){try{br.close();} catch (IOException e) {} }
        }
    }
}
