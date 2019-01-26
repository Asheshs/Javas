import java.util.Scanner;
class DoWhile
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String input = null;


        do 
        {
            System.out.println("enter a num");
            int a = sc.nextInt();
            System.out.println(a%2 == 0?"even":"odd");
            System.out.println("Do you wish to continue?");
            input = sc.next();
            
        }
        while(input.equals("yes"));
    }
}