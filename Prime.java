class Prime
{
    public static void main(String[]args)
    {
    int p = Integer.parseInt(args[0]);
    int flag = 0;
    if (p%2!=0){
    for (int i=2; i<=p; i++  ) 
    {
   if (p%i==0)
{
    flag=1;
}
    }

    if(flag==0)
    {
        System.out.println("prime");
    }
    else
    {
        System.out.println("Not Prime");
    }
    }
    else 
    {
        System.out.println("Not prime");
    }
    
}
}