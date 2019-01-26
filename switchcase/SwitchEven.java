class SwitchEven
{
    public static void main(String[]args)
    {
         java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        switch(a%2)
        {
        case 0:
        System.out.println("number is even");
        break;
        case 1:
        System.out.println("nubmer is odd");
        break;
        }
    }
}