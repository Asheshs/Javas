interface Cup{
 int stress();
}
public class Tea{
    public static void main(String [] args){
        Cup c = new Cup(){
            @Override
            public int stress(){
            return 0;
            }
            }; 

                   
            
        int result = c.stress();
        System.out.println(result);
    }
}