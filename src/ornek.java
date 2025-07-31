import java.util.ArrayList;
import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listeler = new ArrayList<>();
        String liste = "";

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Ürün ekle");
            System.out.println("2. Ürün sil");
            System.out.println("3. Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // dummy newline temizliği

            switch (secim) {
                case 1:
                    System.out.print("Eklemek istediğiniz ürün: ");
                    liste = scanner.nextLine();
                    if (listeler.contains(liste)) {
                        System.out.println("Bu ürün zaten listede!");
                    } else {
                        listeler.add(liste);
                        System.out.println("Ürün eklendi.");
                    }
                    break;

                case 2:
                    System.out.print("Silmek istediğiniz ürün: ");
                    String silinecek = scanner.nextLine();
                    if (listeler.remove(silinecek)) {
                        System.out.println("Ürün silindi.");
                    } else {
                        System.out.println("Bu ürün listede yok.");
                    }
                    break;

                case 3:
                    System.out.println("Alışveriş Listeniz:");
                    for (String urun : listeler) {
                        System.out.println("- " + urun);
                    }
                    break;

                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}
