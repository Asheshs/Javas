import java.util.*;

public class HashSetExample{
//HashSet only takes unique elements
//HashSet doesn't maintain insertion order
    public static void main(String[] args){
        HashSet<String> hs= new HashSet<String>();
        hs.add("hello");
        hs.add("hi");
        hs.add("see you");
        hs.add("so on");
        hs.add("so on");


        for(String s: hs){
            System.out.println(s);
        }
    }
}