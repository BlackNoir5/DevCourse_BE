package stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        FileWriter fw = null;

        try{
            fw = new FileWriter("/Users/apple/java/newtest.txt");

            fw.write("Hello");
            fw.write("\n");
            fw.write(System.lineSeparator());
            fw.write("Hello");

            System.out.println("입력 완료");
        } catch (IOException e ){
            System.out.println("[에러]"+e.getMessage());
        } finally {
            if(fw != null){ try{fw.close();} catch (IOException e){} }
        }
    }
}
