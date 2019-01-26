import java.io.*;

public class StudentsDetailsGet
{
    public static void main(String [] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream(new File ("abc.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            ois.close(); 
            fis.close();
          
            System.out.println(s);
        }catch(Exception e){
            System.out.println(e);
        }
    }
} 