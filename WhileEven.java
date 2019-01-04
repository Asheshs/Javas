class WhileEven
{
    public static void main(String[]args)
    {
        int a ;
        do
        {
            System.out.println("Enter a number");
            System.out.println(a%2==0?"even":"odd");
            System.out.println("do you wish to continue");
        }
        while (a<0);
    }
}