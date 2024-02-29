import javax.sql.rowset.spi.SyncResolver;

class customer
{
    int amount=10000;
    synchronized void withdraw (int amount)
    {
        System.out.println("going to withdraw");
        if(this.amount<amount)
        {
            System.out.println("less balance:wating for deposite");
            try{
                wait();
            }catch(Exception e)
            {}

        }
        this.amount-=amount;
    System.out.println("withdraw completed");
}

synchronized void deposite(int amount)
{
    System.out.println("going to deposite");
    this.amount+=amount;
    System.out.println("deposit completed");
    notify();

}
}
class test{
    public static void main(String args[]){
        final customer c= new customer();
        new Thread()
        {
            public void run()
            {
                c.withdraw(15000);
            }
        }.start();
        new Thread()
        {
            public void run()
            {

            c.deposite(10000);
        }
    }.start();
}
}