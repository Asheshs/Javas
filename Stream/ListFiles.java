import java.io.*;

public class ListFiles{

    public static void main(String[] args){
        try{
            File f= new File("C:\\Users\\5567i5\\Desktop");
            File[] listFiles=f.listFiles();

            for(File x : listFiles){
                System.out.println(x.getName() +"\t\t"+(x.isFile()?"File": "Folder"));
            } 
        }catch(Exception e){

        }
    }
}