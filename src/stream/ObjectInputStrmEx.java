package stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStrmEx {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("./object.ser"));

            String[] name = (String[]) ois.readObject();
            int[] ages = (int[]) ois.readObject();
            double[] weight = (double[]) ois.readObject();

            System.out.println(Arrays.toString(name));
            System.out.println(Arrays.toString(ages));
            System.out.println(Arrays.toString(weight));
        } catch (IOException e ){
            System.out.println( e.getMessage() );
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage() );
        } finally {
            if(ois !=null){ try{ois.close(); } catch (IOException e) { } }
        }
    }
}
