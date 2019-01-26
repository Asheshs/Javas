import java.util.Scanner;
class ReverseString
{
    public static void main(String[]args)
    {
        
         String y = "";

        System.out.println("Enter in a sentence:"); 
        
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
      
         for(int i = x.length()-1; i >= 0; i--)
         {
            y=y + x.charAt(i);
            }
        System.out.println(y);
    }
}