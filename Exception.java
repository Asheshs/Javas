import java.io.IOException;
public class Exception{
    public static void main(String[]args)
    {
        try{
            System.out.println(1/0); //Throw exception -> arithematic exception
        
        java.io.FileWriter fw  = new java.io.FileWriter("abc.tnt");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
         catch(IOException e)
        {
            System.out.println(e);
        }
         finally
        {
            System.out.println("i am executed");
        }
    }
}