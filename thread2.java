class th implements Runnable
{
Thread t;
int i,no,sum;
int a[]=new int[100];
public th(String s,int n)
{
    t=new Thread(this,s);
    no=n;
    int j=0;
    for(i=1;i<=100;i++)
    {
    a[j]=i;
    j++;
    }
    t.start();
}
    public void run() {
       for(i=0;i<20;i++)
       {
       sum=sum+a[no];
       no++;
       }
   }

}
 public class thread2
{
public static void main(String[] arg) throws InterruptedException
{
th t=new th("g",0);
t.t.join();
th t2=new th("r",20);
t2.t.join();
th t3=new th("s",40);
t3.t.join();
th t4=new th("t",60);
t4.t.join();
th t5=new th("p",80);
t5.t.join();
int to=t.sum+t2.sum+t3.sum+t4.sum+t5.sum;
System.out.println("total of 100 numbers="+to);
double avg=to/5;
System.out.println("average of 100 numbers="+avg);
}
}


