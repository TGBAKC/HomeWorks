import java.util.Scanner;

public class wonderfulTall {
    public static void main(String[] args) {

        System.out.println("Bir tam sayı giriniz:");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {  // i = 1, i < sayi !!
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            System.out.println("Bu sayı mükemmel sayıdır.");
        } else {
            System.out.println("Bu sayı mükemmel sayı değildir.");
        }
    }
}
