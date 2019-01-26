import java.io.*;
public class FileWrite
{
    public static void main(String [] args)
    {
        try{
        FileWriter fw = new FileWriter("facebook.com");
        fw.write("djsjshjws");
        fw.close();
        System.out.println("file write kjgd");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}