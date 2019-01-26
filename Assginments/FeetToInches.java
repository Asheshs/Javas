import java.util.Scanner;

public class FeetToInches{

    public static void main(String[] args) {

        double feet;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter feet:");
        feet = sc.nextDouble();

        double inches = feet * 12;

        System.out.println(inches + " Inches");

    }
}