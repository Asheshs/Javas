class Percentage
{
    public static void main(String[]args)
    {
        
        double percentage = Double.parseDouble(args[0]);
        if(percentage>=80)
        {
            System.out.println("Distinction");
        }
        else if(percentage>=60 && percentage<80)
        {
            System.out.println("First divison");
        }
        else if(percentage>=50 && percentage<60)
        {
            System.out.println("Second divison");
        }
        else
        {
            System.out.println("fail");
        }
    }
}