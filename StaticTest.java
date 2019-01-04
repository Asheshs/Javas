public class StaticTest
{
    static 
    {
        int i = 10;
        System.out.println("Static block called");
    }
      StaticTest(){
          System.out.println("hi iam constructor");
      }
    public static void main(String []args)
    {
        StaticTest st = new StaticTest();
        System.out.println(StaticTest2.testMethod());


    }
}
class StaticTest2
{
static String name;
    static
    {
        name = "rameshwor yadav";//static block
    }
    public static String testMethod()
    {
      return name;
    }
}