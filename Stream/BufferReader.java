import java.io.*;
public class BufferReader
{
    public static void main(String [] args)
    {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a value");
        String value = br.readLine();
        System.out.println(value);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}