import java.io.*;
public class BufferReading
{
    public static void main(String []args)
    {
        try{
        BufferedReader br = new BufferedReader(new FileReader("buffer.txt"));
        String line;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}