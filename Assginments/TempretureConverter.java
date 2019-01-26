import java.util.Scanner;
public class TempretureConverter {
  public static void main(String args[]){
    System.out.print("Enter the temperature in Celsius: ");
    Scanner sc = new Scanner(System.in);
    float Fahrenheit = sc.nextFloat();
    float celsius = (Fahrenheit-32) *5/9;
    System.out.println("Temperature in celsius: "+celsius);
  }
}