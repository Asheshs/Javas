 class HelloPal {
    public String palindrome(){
          int num = 201, reversedInteger = 0, remainder, originalInteger;
          originalInteger = num;
         // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            return originalInteger + " is a palindrome.";
        else
            return originalInteger + " is not a palindrome.";

    }

    public static void main(String[] args) {
        
        HelloPal db = new HelloPal();
        String palindrome = db.palindrome();
        System.out.println(palindrome);

       
    }
}