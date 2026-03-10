import java.util.Scanner;
public class OddEvenPrinter {
     public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int number = inputReader.nextInt();
        if (number < 1) {
            System.out.println("Please enter a natural number (>=1)");
            inputReader.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) 
                System.out.println(i + " is even number");
            } else {      
                System.out.println(i + " is odd number");
            }
        }
        inputReader.close();
    }
}
