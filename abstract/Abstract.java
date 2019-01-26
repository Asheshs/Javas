interface SumInterface
{
    void add(int a, int b);
}
public class Abstract{
    public static void main(String args[]){
        
        SumInterface si = (int a, int b )->System.out.println(a+b);
        
        si.add(4,5);

    }
}