import java.util.Scanner;
public class EligibleVoter{

    public static void main(String[]args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        age = sc.nextInt();
        if (age>=18){
            System.out.println("You can vote");

        }
        else{ 
            System.out.println("your age is not eligible for voting");
        }
    }
}