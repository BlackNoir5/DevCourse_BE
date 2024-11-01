package thread;

public class ThreadEx {
    public static void main(String[] args) {
//        Go1 g = new Go();
//        Come1 c = new Come();

        System.out.println("시작");
        //순차처리
//        g.run();
//        c.run();

        //스레드 실행 메서드
        //start() -> run()
//        g.start();
//        c.start();

        //Runable 처리
        Thread t1 = new Thread(new Go1());
        Thread t2 = new Thread(new Come1());

        t1.start();
        t2.start();

        System.out.println("끝");
    }
}
