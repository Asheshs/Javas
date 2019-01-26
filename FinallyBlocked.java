public class FinallyBlocked{

    public static void main(String[]args){
        try{
            System.out.println(1/0);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("i am finally block");
        }
    }
}