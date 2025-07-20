import java.util.Scanner;

public class sifreKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifre giriniz: ");
        String sifre = scanner.nextLine();

        boolean uzunlukKontrol = sifre.length() >= 8;
        boolean boslukKontrol = !sifre.contains(" ");
        boolean ilkHarfBuyuk = Character.isUpperCase(sifre.charAt(0));
        boolean sonKarakterSoru = sifre.endsWith("?");

        if (uzunlukKontrol && boslukKontrol && ilkHarfBuyuk && sonKarakterSoru) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }
    }
}


























