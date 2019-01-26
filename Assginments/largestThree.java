import java.util.Scanner;
public class LargestThree{
    public static void main(String[]args){

    int a,b,c;
    String input = null;
    Scanner sc = new Scanner(System.in);
    do{
    System.out.println("Enter First Number:");
    a = sc.nextInt();
    System.out.println("Enter Second Number:");
    b = sc.nextInt();
    System.out.println("Enter Third Number:");
    c = sc.nextInt();
    if(a>b && a>c){
        System.out.println("The large Integer is" + a);
    }
    else if(b>c && b>a){
        System.out.println("The large Number is" + b);
    }
    else if (c>a && c>b){ 
        System.out.println("The Large Number is" +c);
    }
    System.out.println("Do you want to repeat?");
    input = sc.next();
    }
   while( input.equals("yes"));
    }
}