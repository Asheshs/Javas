public class Names
{
    public static void main(String... args)
    {
        Length.printArray ("ram","hari","shyam");
       // Length s = new Length();
        //s.printArray("sita","Gita");
       

    }

}
class Length
{
    public static void printArray(String...a)
    {
      for(String s : a)
      {
       System.out.println(" the length of " +  s + " is " + s.length());
      }
    }
}