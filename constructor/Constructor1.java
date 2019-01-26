public class Constructor1
{
    Constructor1()
    {
        System.out.println("hello i am constructor");
    
}
    Constructor1(String name){
        System.out.println("i am parameterized");
    }
    public static void main (String[]args)
    {
        Constructor1 constructor1 = new Constructor1();
        Constructor1 conste = new Constructor1("hello");
    }
}