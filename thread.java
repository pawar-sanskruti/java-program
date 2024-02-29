import java.io.*;

class th implements Runnable
{
String filename;
Thread t;
public th(String s,String fname)
{
    t=new Thread(this,s);
    filename=fname;
    t.start();
}
    public void run()
    {
      File f=new File(filename);
      if(f.exists())
      System.out.println(filename+"File is exists");
      else
      System.out.println(filename+"File is not exists");
    }

}
class filewatcher
{
static int j=0;
public static File[] filelist(String dir)
{
File f=new File(dir);
File[] list=f.listFiles();
File[] list2 = new File[100];
for(int i=0;i<list.length;i++)
{
    if(list[i].isFile())
    {
        list2[j]=list[i];
        j++;
    }
}
    return list2;
}
}
public class thread
{
public static void main(String[] arg) throws Exception
{
String s=".";
File[] list=filewatcher.filelist(s);
for(int i=0;i<filewatcher.j;i++)
new th("first",list[i].getName());
}
}



