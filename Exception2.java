public class Exception2{
    public static void hello(int a) throws AgeIsNotValidException{

            if(a<16){
            throw new AgeIsNotValidException("you annpt buy unleess you are 18");
    }
    }
    public static void main(String[]args){
        int a = 16;
        try{
        hello(a);
        }
        catch( Throwable e){
            System.out.println(e);
        }
       
        }
    
}
