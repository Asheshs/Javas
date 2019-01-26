import java.util.*;
public class StudentName{
    public static void main (String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        //code for non generic collection
        //<> diamond operator ,only use wrapper class(non-primtive datatype) inside it
        //ArrayList always maintanance the insertion order
        a.add(5);
        a.add(2);
        //Iterator i = a.iterator();
        //while(i.hasNext()){
          //  System.out.println(i.next());
        //}
        for(Integer w:a){
            System.out.println(w);
        }
    }
}