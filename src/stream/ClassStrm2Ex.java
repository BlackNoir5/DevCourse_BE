package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassStrm2Ex {
    public static void main(String[] args) {
        ObjectInputStream ois =null;

        try {
            ois = new ObjectInputStream(new FileInputStream("./serial.dat"));

            Person person = (Person)ois.readObject();
            System.out.println(person.getName());
            System.out.println(person.getPhone());
            System.out.println(person.getAge());
            System.out.println(person.getAddress());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if(ois != null){ try { ois.close(); } catch ( IOException e ) { } }
        }
    }
}
