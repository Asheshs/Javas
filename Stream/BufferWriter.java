import java.io.*;
public class BufferWriter
{
    public static void main(String [] args)
    {
        try{
        BufferedWriter bw = new BufferedWriter( new FileWriter("buffer.txt"));
        bw.write("hello.......");
        bw.close();
        System.out.println("file created succsessfully!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}