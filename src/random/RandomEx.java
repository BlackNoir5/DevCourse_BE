package random;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random rand1 = new Random(System.currentTimeMillis());

        System.out.println( rand1.nextInt(100));
        System.out.println(rand1.nextDouble());

        System.out.println( rand1.nextInt(45)+1);


    }
}
