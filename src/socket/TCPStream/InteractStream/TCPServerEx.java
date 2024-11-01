package socket.TCPStream.InteractStream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 준비되었습니다.");

            socket = serverSocket.accept();
            System.out.println("클라이언트와 연결되었습니다..");

            br = new BufferedReader( new InputStreamReader(socket.getInputStream(),"utf-8"));
            bw = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream(),"utf-8"));
            System.out.println("메세지 : " + br.readLine());

            bw.write("안녕 클라이언트"+ System.lineSeparator());
            bw.flush();

            System.out.println("전송완료");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (socket != null) { try { socket.close();} catch (IOException e) { } }
            if (serverSocket != null) { try { serverSocket.close();} catch (IOException e) { } }

            if (br != null) { try { br.close();} catch (IOException e) { } }
            if (bw != null) { try { bw.close();} catch (IOException e) { } }
        }
    }
}
