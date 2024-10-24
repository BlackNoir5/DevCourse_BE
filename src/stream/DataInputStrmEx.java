package stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStrmEx {
    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new FileInputStream("./data.dat"));

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readFloat());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(dis !=null) { try { dis.close(); } catch ( IOException e ) { } };
        }

    }
}
