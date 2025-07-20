import java.util.Scanner;

public class casting{

    public static void main(String[] args) {
        // Kullanıcıdan tam sayı al
        System.out.println("Bir tam sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        int tamsayi = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı al
        System.out.println("Bir ondalıklı sayı giriniz:");
        double ondalikli = scanner.nextDouble();

        // Tip dönüşümleri
        double donusen1 = (double) tamsayi;  // int → double
        int donusen2 = (int) ondalikli;      // double → int

        // Sonuçları yazdır
        System.out.println("Tam sayının double hali: " + donusen1);
        System.out.println("Ondalıklı sayının int hali: " + donusen2);
    }
}
