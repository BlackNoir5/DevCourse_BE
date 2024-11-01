package socket.TCPStream.InteractStream;

import java.io.*;
import java.net.Socket;

public class TCPClientEx {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedWriter bw =null;
        BufferedReader br = null;

        try {
            System.out.println("서버와 연결을 시작합니다.");

            socket = new Socket("localhost",7777);
            System.out.println("서버와 연결되었습니다.");

            bw = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
            br = new BufferedReader( new InputStreamReader(socket.getInputStream(), "utf-8"));

            // 서버로 메시지 전송
            bw.write("안녕 소켓" + System.lineSeparator());
            bw.flush(); // 스트림 비우기

            // 서버로부터 에코 메시지 수신
            String response = br.readLine();
            System.out.println("[에코메시지] " + response);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(socket!=null){ try { socket.close();} catch (IOException e) { } }

            if(br!=null){ try { br.close();} catch (IOException e) { } }
            if(bw!=null){ try { bw.close();} catch (IOException e) { } }
        }
    }
}
