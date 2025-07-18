import java.util.Scanner;

public class FlightTicketCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in KM: ");
        int distance = input.nextInt();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter travel type (1 = One Way, 2 = Round Trip): ");
        int travelType = input.nextInt();

        // Validation check
        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Invalid input!");
            return;
        }

        double pricePerKm = 0.10;
        double basePrice = distance * pricePerKm;
        double ageDiscountRate = 0.0;

        // Age-based discount
        if (age < 12) {
            ageDiscountRate = 0.50;
        } else if (age <= 24) {
            ageDiscountRate = 0.10;
        } else if (age > 65) {
            ageDiscountRate = 0.30;
        }

        double ageDiscount = basePrice * ageDiscountRate;
        double discountedPrice = basePrice - ageDiscount;

        // Round-trip discount
        if (travelType == 2) {
            double roundTripDiscount = discountedPrice * 0.20;
            discountedPrice = (discountedPrice - roundTripDiscount) * 2;
        }

        System.out.println("Total price to pay: " + discountedPrice + " TL");
    }
}
