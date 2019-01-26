import java.io.*;
public class Students
{
    public static void main (String [] args)
    {
        try{
        Student s = new Student("ram", 60);
        FileOutputStream fs = new FileOutputStream(new File("abc.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fs);
        oos.writeObject(s);
        oos.close();
        fs.close();
        System.out.println("File written succseessfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}