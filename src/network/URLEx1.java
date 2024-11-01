package network;

import org.w3c.dom.ls.LSOutput;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

public class URLEx1 {
    public static void main(String[] args) {
        //URL ( Uniform Resource Locator )
        //브라우저 표현

        //문자열 => 각 요소별로 맴버 필드에 저장 URL.

        String strUrl = "http:/www.coechobo.com/sample/hello.html?referer=codechobo#index1";

        //protocol/ 도메인추출
        //split, StringTokenize

        try {
            URL url = new URL(strUrl);

            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}
