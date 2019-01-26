import java.util.Scanner;

public class GrossSalary
{
    public static void main( String[] args ) 
    {
        double Basic_Salary, DA, HRA, Gross_Salary;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter Basic Salary : ");
        Basic_Salary = reader.nextDouble();
        
        DA = (Basic_Salary * 40) / 100;
        HRA = (Basic_Salary * 20) / 100;
        Gross_Salary = Basic_Salary + DA + HRA;
        
        System.out.println("\nDearness Allowance 40 % of Basic Salary : " + DA);
        System.out.println("House Rent 20 % of Basic Salary : " + HRA);
        System.out.println("Gross Salary : " + Gross_Salary);
    }
}