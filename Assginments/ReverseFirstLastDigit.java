import java.util.Scanner;
 
public class ReverseFirstLastDigit {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int output = reverse(input);
        System.out.println("Output = " + output);
    }
 
    public static int reverse(int input) {
        String inputString = String.valueOf(input);
        String outputString;
        if (inputString.length() == 1) {
            outputString = inputString;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String remaining = inputString.substring(1, inputString.length() - 1);
            outputString = lastChar + remaining + firstChar;
        }
        int output = Integer.parseInt(outputString);
        return output;
    }
}
