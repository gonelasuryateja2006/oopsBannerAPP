import java.util.Scanner;
public class LargestNumberChecker {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = inputReader.nextInt();
        System.out.print("Enter number2: ");
        int number2 = inputReader.nextInt();
        System.out.print("Enter number3: ");
        int number3 = inputReader.nextInt();
        boolean firstIsLargest = (number1 > number2) && (number1 > number3);
        boolean secondIsLargest = (number2 > number1) && (number2 > number3);
        boolean thirdIsLargest = (number3 > number1) && (number3 > number2);
        System.out.println("Is the first number the largest? " + 
                          (firstIsLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + 
                          (secondIsLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + 
                          (thirdIsLargest ? "Yes" : "No"));
        inputReader.close();
    }
}
