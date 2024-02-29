class PrintText extends Thread
{
String msg;
int i,no;
public PrintText(String s,String msg,int no)
{
super(s);
this.msg=msg;
this.no=no;
start();
}
    public void run()
    {
    for(i=0;i<no;i++)
        System.out.println(msg);
    }

}

public class thread1
{
public static void main(String[] arg) throws InterruptedException
{
PrintText p=new PrintText("First","I am in FY",10);
p.join();
PrintText p1=new PrintText("Second","I am in SY",20);
p1.join();
PrintText p2=new PrintText("Thrid","I am in TY",30);
p2.join();
}
}









