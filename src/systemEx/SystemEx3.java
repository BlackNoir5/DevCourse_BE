package systemEx;

public class SystemEx3 {
    public static void main(String[] args){
        //실행 시간
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        System.out.println();

        // System.lineSeparator(); -> 분할하기

        //환경값
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));

        System.out.println(System.getenv("PATH"));


    }
}
