public class Mother
{
    public static void main(String... args)
    {

        String name = Daughter.name();
        Daughter db = new Daughter();
        String surName=db.surName();
        System.out.print(surName);
        System.out.print(name);
    }
}
 class Daughter
{
    public static String name()
    {
        return "Ashely";
    }
    public String surName()
    {
        return "kutons";
    }
}