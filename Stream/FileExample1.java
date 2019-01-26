import java.io.File;
public class FileExample1{

    public static void main(String[] args){
        String fileName="something.txt";
        try{
            File f= new File(fileName);
            boolean result=f.createNewFile();
           //boolean result=f.delete();
           //boolean result=f.mkdir();
            if(result){
                System.out.println("Folder created successfully!!!!!");
            }
            else{
                System.out.println("Couldn't create folder");
            }



        }catch(Exception e){
            System.out.println(e);
        }

    }
}