public class StreamDemo
{
    public static void main(String [] args)
    {
        try{
        System.out.println("please enter a character");
        int c = System.in.read();
        System.out.println("the character you entered was:");
        System.out.println((char)c);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}