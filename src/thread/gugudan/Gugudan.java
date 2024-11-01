package thread.gugudan;

public class Gugudan extends Thread{
    private int dan;

    public Gugudan(int dan){
        this.dan = dan;
    }

    @Override
    public void run(){
        for(int i=0;i<=300;i++){
            System.out.printf("%s X %s = %s\n",dan,i,dan*i);
        }
    }
}
