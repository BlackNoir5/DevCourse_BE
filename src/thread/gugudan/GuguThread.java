package thread.gugudan;

public class GuguThread {
    public static void main(String[] args) {
        Gugudan g1 = new Gugudan(4);
        Gugudan g2 = new Gugudan(6);

        System.out.println("시작");

        g1.setName("4단 시작");
        g1.setName("6단 시작");

        g1.start();
        g2.start();

        System.out.println("끝");
    }
}
