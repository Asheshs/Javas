import java.io.*;
public class StudentList
{
    public static void main(String []args)
    {
        try{
        Student s = new Student();
        FileWriter fw = new FileWriter();
        
        fw.close();
        System.out.println("file written successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}