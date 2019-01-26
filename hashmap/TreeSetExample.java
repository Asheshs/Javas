import java.util.*;
public class TreeSetExample{
    //treeset is used for ascending to descending sorting.
    public static void main(String[] args){
        TreeSet<String> ts= new TreeSet<String>();
        ts.add("ram");
        ts.add("ram");
        ts.add("hari");
        ts.add("abhimanyu");
        ts.add("cleopatra");

        for(String s: ts){
            System.out.println(s);
        }
    }
}