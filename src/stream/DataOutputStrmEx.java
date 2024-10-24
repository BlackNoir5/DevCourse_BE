package stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStrmEx {
    public static void main(String[] args) {
        DataOutputStream dos = null;

        try {
            dos = new DataOutputStream(new FileOutputStream("./data.dat"));

            dos.writeInt(2024);
            dos.writeUTF("문자열 형식");
            dos.writeFloat(1.8f);

            System.out.println("출력 완료");
        } catch ( IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if( dos != null ){ try{ dos.close(); } catch (IOException e) { } }
        }
    }
}
