import java.util.Vector;
public class vectordemo {
    public static void main(String args[]){
        Vector v=new Vector();

        v.add("komal");
        v.add("sakshi");
        v.add(30);
        v.addElement("rani");
        v.add(100);
        v.add("saniya");

        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.removeElement("sakshi"));
        v.removeElement(30);
        System.out.println(v.capacity());
         

    }
    
}
