package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Report2Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("동이름을 입력하세요 입력을 마치려면 'exit' 입력 >");
            String strDong = sc.nextLine();
            if(strDong.equals("exit")){
                break;
            }

            ArrayList<String> result = new ArrayList<>();

            BufferedReader br = null;

            try{
                br = new BufferedReader(new FileReader("/Users/apple/Desktop/JavaProject/Java241021/zipcode_seoul_utf8_type2.csv"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    // System.out.println(line);
                    String[] address = line.split(",");

                    //indexOf / contains...가능
                    if(address[3].startsWith(strDong)){
                        String addresses = String.format("[%s] %s %s %s %s %s",address[0],address[1],address[2],address[3],address[4],address[5]);
                        result.add(addresses);
                    }
                }
            } catch (IOException e){
                System.out.println("[에러]"+e.getMessage());
            } finally {
                if(br != null){ try { br.close(); } catch ( IOException e ) { } }
            }

            for( String data : result ){
                System.out.println(data);
            }
        }

        sc.close();
    }
}
