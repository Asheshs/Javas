public class CheckException{

    public static void main(String[]args){

        //we are using FileWriter class to write a file
        //during compie time , exception is checked & found that the code might
        //throw IOException later on if goes unchecked
        java.io.FileWriter fw = new java.io.FileWriter("abc.java"); 
    }
}