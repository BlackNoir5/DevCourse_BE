package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx4 {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            URL url = new URL("https://news.daum.net/");
            br = new BufferedReader(new InputStreamReader( url.openStream()));

//            int data = 0;
//            while( (data = br.read()) != -1){
//                System.out.print((char)data);
//            }
            String line = null;
            boolean flag = false;
            while((line = br.readLine())!=null){ //원하는 데이터 긁어오기..!
                if(line.contains("class=\"link_txt\" data-tiara-layer=\"article_main\"")){
                    flag = true;
                    continue;
                }
                if(line.contains("</a>")){
                    flag = false;
                }
                if(flag){
                    System.out.println(line);
                }
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(br != null){ try{br.close(); } catch (IOException e) { } }
        }
    }
}
