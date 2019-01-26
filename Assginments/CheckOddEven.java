public class CheckOddEven{

    public static void main(String[]args){

      int a = Integer.parseInt(args[0]);
     String output = (a % 2 == 0)?"even":"odd";
     System.out.println(output);

     
    } 
}