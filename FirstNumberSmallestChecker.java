import java.util.Scanner;
public class FirstNumberSmallestChecker {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = inputReader.nextInt();
        System.out.print("Enter number2: ");
        int number2 = inputReader.nextInt();
        System.out.print("Enter number3: ");
        int number3 = inputReader.nextInt();
        boolean firstIsSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + 
                          (firstIsSmallest ? "Yes" : "No"));
        
        inputReader.close();
    }
}
