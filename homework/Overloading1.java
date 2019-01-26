public class Overloading1{

    Overloading1(){
        System.out.println("Constructor 1");
    }
    Overloading1(String name){
        System.out.println(name);
    }

    public void printName(){
        System.out.println("Rameshwor Yadav");
    }
    public void printName(String name){
        System.out.println(name);
    }
    public void printName(String name1,String name2){
        System.out.println(name1+ " "+ name2);
    }

    public static void main(String[] args){
        Overloading1 o1= new Overloading1();
        o1.printName();
        o1.printName("Ram");
        o1.printName("Hari","Shyam");
    }
   

}