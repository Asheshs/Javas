import java.util.Scanner;
public class Interest
{
    public static void main(String args[]) 
    {
        float p, r, t;
        String input = null;
       
        Scanner s = new Scanner(System.in);
        do{
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.println("The Simple Interest is : " + si);
        
        
        System.out.println("Do you want to repeat??");
        input = s.next();
        }
            while(input.equals("yes"));
        
    
    }
}