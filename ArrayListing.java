import java.util.*;

class ArrayListing{
     @SuppressWarnings("unchecked")
    public static void main(String[] args){
       
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("hello");
        a.add(35);
        Iterator i = a.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}