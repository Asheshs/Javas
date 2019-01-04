class Reverse
{
    public static void main(String[]args)
    {
       String x = "Hello";
       String y = "";

         for(int i = x.length()-1; i >= 0; i--)
         {
            y=y + x.charAt(i);
            }
    System.out.println(y);
    
if (y == String.valueOf (x))

{
    System.out.println("word is palindrom");
}   
else
{
     System.out.println("word is not palindrom");
}
    
    }
}