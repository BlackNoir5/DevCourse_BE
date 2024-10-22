package stringBuilderEx;

public class StringBuilderEx {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sb2 = new StringBuffer(100);
        StringBuffer sb3 = new StringBuffer("Hello World");

        System.out.println(sb1.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity());

        //Builder, Buffer 정리하기

    }
}
