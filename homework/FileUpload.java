interface IFileUpload{
    void getFile(String name);
    String returnFile();
    default String someString(){
        return "randome string";
    }
    void something();
}

public class FileUpload implements IFileUpload{
    
    public void getFile(String name){
        System.out.println(name);
    }
    
    public String returnFile(){
        return "Something";
    }
        //to be coded method
    public void something(){

    }

    public static void main(String[] args){
        FileUpload fileUpload= new FileUpload();
        fileUpload.getFile("Hello.java");
        System.out.println(fileUpload.someString());
    }

}