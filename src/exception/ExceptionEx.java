package exception;

public class ExceptionEx {

    public void method1( int num ){
        System.out.println("시작");

        if(num >= 100){
            System.out.println("정상 입력");
        }else{
            System.out.println("비정상 입력");
        }

        System.out.println("끝");
    }

    // 처리에 대한 위임
    public void method2( int num ) throws Exception {
        System.out.println( "시작" );

        // 입력값에 대한 검사
        if (num >= 100) {
            System.out.println("정상 입력");
        } else {
            //System.out.println( "비정상 입력" );
            throw new Exception("비정상 입력");
        }
        System.out.println( "끝" );
    }

    public static void main(String[] args) {
        ExceptionEx ex = new ExceptionEx();
        ex.method1( 10 );

        try {
            ex.method2(10);
        } catch (Exception e ) {
            System.out.println( e.getMessage() );
        }

        String[] datas = { "1","2","3"};

        System.out.println(datas[0]);
        System.out.println(datas[1]);

        //System.out.println(datas[3]);  Array Out of bounds Exception
        //Date date = null;              NullPointer Exception

        //강제 Exception 발생 throws

        try{
            if(args.length ==1){
                System.out.println("정상 실행");
            }else{
                System.out.println("실행 오류");
                throw new Exception("정상적인 입력을 받아야합니다.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
