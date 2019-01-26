import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        int num ;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
// using biginteger
//import java.math.BigInteger;

//public class Factorial {

   // public static void main(String[] args) {

     //   int num = 30;
       // BigInteger factorial = BigInteger.ONE;
        //for(int i = 1; i <= num; ++i)
        //{
            // factorial = factorial * i;
          //  factorial = factorial.multiply(BigInteger.valueOf(i));
        //}
        //System.out.printf("Factorial of %d = %d", num, factorial);
   // }
//}

//using while loop
//public class Factorial {

    //public static void main(String[] args) {

        //int num = 5, i = 1;
        //long factorial = 1;
        //while(i <= num)
        //{
           // factorial *= i;
         //   i++;
       // }
     //   System.out.printf("Factorial of %d = %d", num, factorial);
   // }
//}