public class Mother
{
    public static void main(String... args)
    {

        Daughter.name();
        Daughter db = new Daughter();
        String surName=db.surName();
        System.out.println(surName);
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