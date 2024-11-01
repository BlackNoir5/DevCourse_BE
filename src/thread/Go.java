package thread;

public class Go extends Thread{
    public void run(){
        for( int i=1;i<=10;i++){
            System.out.println("Go : "+i);
        }
    }
}
