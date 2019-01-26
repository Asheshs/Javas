import java.util.*;
public class KeyValue{
    public static void main(String [] args){
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("name", "ACHS");
        hm.put("address", "putalisadak");
        hm.put("name", "naparjuna");
        hm.put(null , "something");
        //for(Map.Entry x : hm.entrySet())
       // {
           // System.out.println(x.getKey() + " " + x.getValue());
        //}
        System.out.println(hm.get("name")); // getting key's value
        System.out.println(hm.get("address"));
        System.out.println(hm.get("name"));
        System.out.println(hm.get(null));
    }
}