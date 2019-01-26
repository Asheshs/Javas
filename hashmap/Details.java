import java.util.*;
public class Details
{
   public static void main(String [] args)
   {
       HashMap<String, District> hm = new HashMap<String, District>();
       hm.put("ktm", new District("Kathmandu", "province3" ));
       hm.put("bkt", new District("bhaktapur", "province3"));
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a districtbcode");
       String code = sc.next();
       System.out.println("The value yo were searching for");
       System.out.println(hm.get(code));
   }
}