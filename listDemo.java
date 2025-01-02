import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo {

    public static void main(String[] args){

        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(10);
        l.add(null);
        l.add(null);

        //System.out.println(l);
        
        Iterator itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    
}
