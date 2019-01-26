import java.util.Scanner;
class DigitsOpr
{
    private int num;
     
    //function to get value of num
    public void getNum(int x)
    {
        num=x;
    }/*End of getNum()*/
     
     public int sumDigits()
     {
         int n,sum;
         n = num;
         sum = 1;
         while(num>0)
         {
             sum +=n;
         }
         return sum;
     }
    //function to calculate product of all digits
    public int productDigits()
    {
        int n,pro;
        n=num;  //keep value of num safe
        pro=1;
        while(n>0)
        {
            pro *=(n%10); //find digit using n=n%10 
            n/=10;
        }
        return pro;
    }//End of productDigits()
}

public class AdditionGivenNum
{
    public static void main(String []args)
    {
        DigitsOpr dig = new DigitsOpr();
        int n;
         
        Scanner sc = new Scanner(System.in);
         
        //read number
        System.out.print("Enter an +ve integer number:");
        n=sc.nextInt();
         
        dig.getNum(n);
        System.out.println("SUM of all digits: " + dig.sumDigits());
        System.out.println("PRODUCT of all digits: " + dig.productDigits());
         
    }
}