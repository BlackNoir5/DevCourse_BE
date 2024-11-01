package thread;

public class Come1 implements Runnable{
    public void run(){
        for( int i=1;i<=10;i++){
            System.out.println("Come : "+i);
        }
    }
}
