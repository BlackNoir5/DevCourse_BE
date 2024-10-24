package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SysInREx {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("입력 : ");
//            int data = br.read();
//            System.out.println("입력값 : "+ (char)data);
//            data = br.read();
//            System.out.println("입력값 : "+ (char)data);
//            data = br.read();
//            System.out.println("입력값 : "+ (char)data);

            String line = br.readLine();
            System.out.println("입력값 : "+ line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(br != null) { try {br.close();} catch (IOException e) { } }
        }
    }
}
