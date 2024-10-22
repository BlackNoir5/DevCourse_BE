package wrapper;

public class WrapperExx {
    public static void main(String[] atgs){
        //지금
        Integer i1 = Integer.valueOf(10);
        //예전
        //Integer i2 = new Integer(10);

        //AutoBoxing
        Integer i2 = 10;

        //UnBoxing
        int i3 = i1;
        int sum = i1+i2;

        System.out.println(sum);
    }
}
