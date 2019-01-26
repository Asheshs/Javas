public class ExceptionExample{
    public static void main(String[]args){
        System.out.println("program started");
       try{
        System.out.println(1/0); //Exception
       }catch(Exception e){
           System.out.println(e);
       }

        System.out.println("work completed");
    }
}