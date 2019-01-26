import java.util.Scanner;
class MathClass { 
    /* Function to calculate x raised to the power y */
    static int power(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    } 
  
    /* Program to test function power */
    public static void main(String[] args) 
    { 
        int x ; 
        int y ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        x = sc.nextInt();
        System.out.println("Enter a power");
        y = sc.nextInt();
  
        System.out.println( "the x ^n is" +power(x,y)); 
    } 
} 
 