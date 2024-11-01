package thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        //익명 클래스로 처리
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    System.out.println("t1 Go : "+i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    System.out.println("t2 Come : "+i);
                }
            }
        });

        Thread t3 = new Thread( () -> {
            for(int i=1;i<=100;i++){
                System.out.println("t3 Go : "+i);
            }
        });
        Thread t4 = new Thread( () -> {
            for(int i=1;i<=100;i++){
                System.out.println("t4 ome : "+i);
            }
        });

        System.out.println("시작");

        t1.start();
        t2.start();

        t3.start();
        t4.start();

        System.out.println("끝");
    }

}
