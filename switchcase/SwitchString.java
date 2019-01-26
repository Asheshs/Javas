class SwitchString
{
    public static void main(String[]args)
    {
         java.util.Scanner sc = new java.util.Scanner(System.in);
    String input = sc.next();
        
        switch(input.toLowerCase())
        {
        case "kathmandu":
        System.out.println("capital of nepal");
         break;
        case "delhi":
        System.out.println("capital of india");
        break;
        default:
        System.out.println("not on our list");
        }
    }
}