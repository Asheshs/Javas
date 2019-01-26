public class RandomTest{
    public static void A()
    {
        System.out.println(1/0);
    }
    public static void B()
    {
        A();
    }
    public static void c()
    {
        B();
    }
    public static void main(String[]args){
        try{
            c();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}