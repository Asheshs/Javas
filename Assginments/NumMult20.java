
public class NumMult20
{
    public static void main(String[] args) 
    {
    int i,j;
    int num;
        for(i=1; i <= 20; i++)
        {
           num = i;
           for( j=1; j<=10; j++)
           {
                System.out.println(j+" * "+i+" = "+num*j);

           }
        }
    }
}