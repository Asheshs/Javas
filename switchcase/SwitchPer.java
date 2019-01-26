class SwitchPer
{
    public static void main(String[]args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int per = sc.nextInt();
        switch(per/10)
        {
        case 10:
        case 9:
        case 8:
        System.out.println("distinction");
        break;
        case 7:
        case 6:
        System.out.println("first divison");
        break;
        case 5:
        System.out.println("second divison");
        break;
        case 4:
        System.out.println("third divison");
        break;
        case 3:
        case 2:
        case 1:
        case 0:
        System.out.println("fail");
        break;
    default:
    System.out.println("not in the list");

        }
    }
}