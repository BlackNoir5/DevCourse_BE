package thread;

import thread.gugudan.Gugudan;

public class ThreadEx3 {
    public static void main(String[] args) {
        Gugudan g1 = new Gugudan(4);
        Gugudan g2 = new Gugudan(6);

        System.out.println("시작");

        g1.setDaemon(true);
        g2.setDaemon(true);

        g1.setPriority(1);
        g2.setPriority(9);

        System.out.println(g1.getPriority());
        System.out.println(g2.getPriority());

        g1.setName("4단 시작");
        g1.setName("6단 시작");

        g1.start();
        g2.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("끝");
    }
}
