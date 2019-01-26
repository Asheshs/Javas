import java.io.*;
public class FileDemo
{
    public static void main(String [] args)
    {
        String fileName = "Something.txt";
        try{
        File f = new File(fileName);

        boolean result = f.createNewFile();
        System.out.println("please wait");
        Thread.sleep(3000);

        if(result)
        {
            System.out.println("File Created successfully");
        }
        else
        {
            System.out.println("couldn't create file");
        }
        }catch(Exception i)
        {
            System.out.println(i);
        }
    }
}