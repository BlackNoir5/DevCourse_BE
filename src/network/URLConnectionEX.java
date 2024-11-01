package network;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEX {
    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedInputStream bis = null;

        BufferedOutputStream bos = null;

        try {

            //URL url = new URL("https://m.daum.net");
            URLConnection conn1 = new URL("https://img1.daumcdn.net/thumb/R658x0.q70/?fname=https://t1.daumcdn.net/news/202411/01/kppa/20241101131019918qtps.jpg").openConnection();
            bis = new BufferedInputStream(conn1.getInputStream());
            bos = new BufferedOutputStream( new FileOutputStream("./gallery.jpg"));

            URLConnection conn = new URL("https://m.daum.net").openConnection();
            br = new BufferedReader(new InputStreamReader( conn.getInputStream()));

            System.out.println(conn.getContent());
            System.out.println(conn.getContentType());

            int data = 0;
            while((data = bis.read()) != -1){
                bos.write(data);
            }

            System.out.println("저장 완료");

            String line = null;
            while((line = br.readLine() )!= null){
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (br != null) { try { br.close();} catch (IOException e) { } }
            if (bis != null) { try { bis.close();} catch (IOException e) { } }
            if (bos != null) { try { bos.close();} catch (IOException e) { } }
        }
    }
}
