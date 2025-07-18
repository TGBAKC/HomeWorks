import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int a = input.nextInt();

        System.out.print("Please enter the second number: ");
        int b = input.nextInt();

        System.out.print("Please enter the third number: ");
        int c = input.nextInt();

        // Operation order: a + b * c - b
        int result = a + b * c - b;

        System.out.println("The result of the operation is: " + result);
    }
}
