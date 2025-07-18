import java.util.Scanner;

public class LeapYear {




        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = input.nextInt();

            String result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    ? "Leap year"
                    : "Not a leap year";

            System.out.println("Result: " + result);
        }
    }













