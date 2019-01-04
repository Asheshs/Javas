public class Father extends Son
{
    public static void main(String... args)
    {
        Son s = new Son();
        int [] a = {1,2,3,4};
        s.printArray(a);
        System.out.println("Passing single value");
        s.printArray(20);
         System.out.println("Passing Multiple value");
         s.printArray(20,40,30);
         System.out.println("Passing no value");
         s.printArray();
    }
    
}
class Son
    {
       public void printArray(int... a)
       {
           for(Integer s:a)
           {
               System.out.println(s);
           }
       }
    }