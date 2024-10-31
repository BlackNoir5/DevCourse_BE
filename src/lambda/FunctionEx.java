package lambda;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        //formatting
        Function<Integer, String> intToStr = t -> "해답은 " + String.valueOf(t);
        String data = intToStr.apply(5);
        System.out.println(data);
    }
}
