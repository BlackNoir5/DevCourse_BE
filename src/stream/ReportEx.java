package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("동이름 입력");
        String strdong = sc.nextLine();
        sc.close();

        //입력 처리
        if(strdong.length()<=1){
            System.out.println("동이름을 입력하셔야합니다.");
            System.exit(0);
        }
        //System.out.println("정상 실행");

        //처리
        ArrayList<String> result = new ArrayList<>();

        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("/Users/apple/Desktop/JavaProject/Java241021/zipcode_seoul_utf8_type2.csv"));
            String line = null;
            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                String[] address = line.split(",");

                //indexOf / contains...가능
                if(address[3].startsWith(strdong)){
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
}
