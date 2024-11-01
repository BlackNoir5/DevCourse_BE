package socket.TCPStream.TCPInterNet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCPClientEx {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedWriter bw =null;

        try {
            System.out.println("서버와 연결을 시작합니다.");

            socket = new Socket("localhost",7777);
            System.out.println("서버와 연결되었습니다.");

            bw = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
            bw.write("안녕 소켓 "+System.lineSeparator());

            bw.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(socket!=null){ try { socket.close();} catch (IOException e) { } }
            if(bw!=null){ try { bw.close();} catch (IOException e) { } }
        }
    }
}
