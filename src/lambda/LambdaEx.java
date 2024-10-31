package lambda;

public class LambdaEx  {
    public static void main(String[] args) {

//        new LambdaInter(){
//            @Override
//            public void method() {
//                System.out.println("Hello Lambda");
//            }
//
//        }.method();
//
//        LambdaInter f = new LambdaInter() {
//            @Override
//            public void method() {
//                System.out.println("method");
//            }
//
////            @Override
////            public  void method1(){
////                System.out.println("method1");
////            } 메소드 2개일 때
//        };
//        f.method();
//
//        //lambda 변경하는 메서드의 내용은 간단한것.
//        f = () -> { System.out.println("Hello Lambda 3"); };
//        f.method();
//
//        f = () ->  System.out.println("Hello Lambda 4");
//        f.method();


        LambdaInter f ;
        int[] arr1 = {1,2,3,4,5};

        f=( arr ) -> { int sum=0; for(int i:arr)sum+=i; return sum; };
        System.out.println(f.sumArr(arr1));

    }
}
