import java.util.*;
public class HashMapExample{

    public static void main(String[] args){
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("name","Ram");
        hm.put("address","Rampur");

        // for(Map.Entry m : hm.entrySet()){
        //     System.out.println(m.getKey()+ " "+m.getValue());
        // }

        //getting the keys from hashmap
        // Set<String> keys= hm.keySet();
        // for(String key: keys){
        //     System.out.println(key);
        // }

        // Collection<String> values=hm.values();
        // for(String s: values){
        //     System.out.println(s);
        // }

        System.out.println(hm.get("name"));
    }
}