import java.io.*;
public class Download
{
    public static void main(String[] args)
    {
        System.out.print("Downloading.....");
        try{
        for(int i=0; i<=100; i++ ) {
       
            Thread.sleep(500);
            System.out.print(i);
            System.out.print("/b");
        }
        }catch(Exception e){
            System.out.println(e);
        }
                //System.out.print("\b\b\b\b\b\b%3d%%",(i));
                //System.out.println(i+1);
    
    }
    
}