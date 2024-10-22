package systemEx;

public class System2Ex {
    public static void main(String[] args){
        System.out.println("시작");

        if(args.length!=1){
            System.out.println("비정상 실행");
            System.exit(0);
        }

        System.out.println("정상실행");
        System.out.println("끝");
    }
}
