class Switch
{
    public static void main(String[]args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        long a = sc.nextInt();
        switch (a)
        {
            case 1:
            System.out.println("you pressed one");
            break;
            case 2:
            System.out.println("you pressed two");
            default:
            System.out.println("not on our list");
        }
    }
}