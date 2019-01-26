import java.io.*;
public class FileWriterExample
{
    public static void main(String []args)
    {
        try{
        FileWriter fw = new FileWriter("mytxt.file");
        fw.write("jpt");
        fw.close();
        System.out.println("file written successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}