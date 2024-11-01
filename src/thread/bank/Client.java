package thread.bank;

public class Client implements Runnable {
    private Account account;

    public Client(Account account){
        this.account = account;
    }

    @Override
    public void run(){
        while(account.getBalance()>0){
            //인출금액
            //100,200,300
            int money = (int)(Math.random()*3+1)*100;
            account.withDraw(money);

            System.out.println("통장 잔고 : "+account.getBalance());
        }
    }
}
