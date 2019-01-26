class HelloWorl
{
    static int b = 20; //b is declared inside a class so it is a global variable
    public static void main(String...args)
    {
        int a = 10; //a is declared inside a main method so its scope is local
        System.out.println(a);
        System.out.println(b);


    }
}