package network;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class movieInfoConn {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            URLConnection conn = new URL("https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.xml?key=850924b2f4a17fcc1b874bb67d067587&targetDt=20241026").openConnection();
            br = new BufferedReader(new InputStreamReader( conn.getInputStream()));

            String line = br.readLine().replaceAll("><",">\n<");

            String[] lines = line.split("\n");
            for(String data : lines){
                if(data.trim().startsWith("<movieNm")){
                    System.out.println(data.trim());
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (br != null) { try { br.close();} catch (IOException e) { } }
        }
    }
}
