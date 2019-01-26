public class Exception4{
    public static void name(String Name) throws CanNotEnterException{
        throw new CanNotEnterException("contain mohamad");
    }
    public static void main(String[]args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String Name = sc.nextLine();   
        name(Name);
    }
}