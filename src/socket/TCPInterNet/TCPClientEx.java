package socket.TCPInterNet;

import java.io.IOException;
import java.net.Socket;

public class TCPClientEx {
    public static void main(String[] args) {
        Socket socket = null;
        System.out.println("서버와 연결을 시작합니다.");

        try {
            socket = new Socket("localhost",7777);
            System.out.println("서버와 연결되었습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(socket!=null){ try { socket.close();} catch (IOException e) { } }
        }
    }
}
