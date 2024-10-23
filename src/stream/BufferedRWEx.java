package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWEx {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
//      FileReader fr = null;


        try{
//          fr = new FileReader("/Users/apple/java/test.txt");
            br = new BufferedReader( new FileReader("/Users/apple/java/zipcode_seoul_utf8_type2.csv.txt"));
            bw = new BufferedWriter( new FileWriter("/Users/apple/java/newTest.txt"));
//            int data=0;
//            while((data=br.read())!=-1){
//                System.out.println((char) data);
//            }
            String line = null;
            while((line= br.readLine())!=null){
                bw.write(line);
            }
        } catch (
                IOException e){
            System.out.println("[에러]"+e.getMessage());
        } finally {
            if(br != null){try{br.close();} catch (IOException e) {} }
            if(bw != null){try{bw.close();} catch (IOException e) {} }
        }
    }
}
