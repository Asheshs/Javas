public class CompareDemo {
 
    public static void main(String []args) {
 
        
 
        String Str1 = "Equals to compare Strings";
 
        String Str2 = "equals to compare strings";
 
 
 
        String Str3 = "Equals to compare Strings";
 
 
 
        System.out.println("Str1 and Str2 are equal? " + Str1.equals(Str2));
 
        System.out.println("Str1 and Str3 are equal? " + Str1.equals(Str3));

         
        System.out.println("");
         System.out.println("str1.compareTo(str2) Returned: " + Str1.compareTo(Str2));
 
        System.out.println("str3.compareTo(str1) Returned value: " + Str3.compareTo(Str1));
 
        System.out.println("str1.compareTo(str3) Returned value: " + Str1.compareTo(Str3));
 
 }    
 
}