import java.util.*;
public class ShowName{
    public static void main (String [] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("rameshower yadav");
        a.add("rajesh hamal");
        a.add(0,"nikhil upreti");//setting value at 0th index off arraylist
        String longestName = a.get(0);//getting the 0thindex value of ArrayList
        
        for(String w:a){
            System.out.println(w);
            if(w.length()>longestName.length()){
                longestName=w;            
                }
       
        }
        System.out.println("longest name in array list is : " + longestName);
    }
}