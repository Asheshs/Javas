class Variable
{
    public static void main(String[]args)
    {
        int a=40;
        int b=30;
        int c=20;
        int greater =(a>b)?((a>c?a:b)):c;
        System.out.println("greatest value"+ greater);
    }
}