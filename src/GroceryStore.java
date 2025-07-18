import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        System.out.print("Enter the weight of pears (kg): ");
        double pearKg = input.nextDouble();

        System.out.print("Enter the weight of apples (kg): ");
        double appleKg = input.nextDouble();

        System.out.print("Enter the weight of tomatoes (kg): ");
        double tomatoKg = input.nextDouble();

        System.out.print("Enter the weight of bananas (kg): ");
        double bananaKg = input.nextDouble();

        System.out.print("Enter the weight of eggplants (kg): ");
        double eggplantKg = input.nextDouble();

        double totalPrice = (pearKg * pearPrice) + (appleKg * applePrice) +
                (tomatoKg * tomatoPrice) + (bananaKg * bananaPrice) +
                (eggplantKg * eggplantPrice);

        System.out.println("Total amount to pay: $" + totalPrice);
    }
}
