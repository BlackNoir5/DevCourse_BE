package thread;

public class Go1 implements Runnable{
    public void run(){
        for( int i=1;i<=10;i++){
            System.out.println("Go : "+i);
        }
    }
}
