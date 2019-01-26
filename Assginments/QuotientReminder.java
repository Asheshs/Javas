public class QuotientReminder { 
  
    public static void main(String[] args) 
    { 
        
        int dividend = Integer.parseInt(args[0]);
        int divider =  Integer.parseInt(args[1]);
  
        int quotient = dividend / divider; 
        int remainder = dividend % divider; 
  
        System.out.println("The Quotient is = " + quotient); 
        System.out.println("The Remainder is = " + remainder); 
    } 
} 