import java.util.*;
import java.io.Console;
public class ReadLine
{
    public static void main(String [] args)
    {
        try{
            
        System.out.println("please enter a character");
        Console c = System.console();
        String input = c.readLine();
        //String input= System.console().readLine();
        System.out.println("the character you entered was:");
        System.out.println(input);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}