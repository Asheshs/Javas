public class SumAverage{
    public static void main (String[]args)
         {
             int a = Integer.parseInt(args[0]);
             int b = Integer.parseInt(args[1]);
             int sum;
             int average;
             sum = a+b;
             average = (a+b)/2;
             System.out.println(" the sum of two number is " +sum);
             System.out.println("the average of two number is "+average);
         }
      
}