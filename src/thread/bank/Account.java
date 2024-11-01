package thread.bank;

public class Account {
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    //synchronized - 동기화 ( = 쓰레드 하나만 들어와.. )
    public synchronized void withDraw(int money){
        //잔고 > 인증
        if(balance >= money){
            // 실제 인출

            try {
                Thread.sleep(1000);
                balance -= money;
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("잔고가 없음");
        }
    }
}
