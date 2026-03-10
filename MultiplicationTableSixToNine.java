import java.util.Scanner;
public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        inputReader.close();
    }
}
