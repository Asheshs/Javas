import java.util.Scanner;
class Whileloop
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find odd or even");
        int input = sc.nextInt();
        while(input >= 0 )
        {
             if(input%2 == 0)
             {
            System.out.println("number is even");
             }
             else 
            {
                System.out.println("number is odd");
            } 
            System.out.println("Do you want to enter another number?");
            input = sc.nextInt();
            
        
            
        }
    }
}