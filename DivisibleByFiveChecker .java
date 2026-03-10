import java.util.Scanner;
public class DivisibleByFiveChecker {
     public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputReader.nextInt(); 
        boolean isDivisible = (number % 5 == 0); 
        System.out.println("Is the number " + number + " divisible by 5? " + 
                          (isDivisible ? "Yes" : "No"));

        inputReader.close();
    }
}
