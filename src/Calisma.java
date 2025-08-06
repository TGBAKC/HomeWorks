import java.util.*;
public class Calisma {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". ürün: ");
            String ekle = scanner.nextLine();
            urunler.add(ekle);
        }

        System.out.println("Alışveriş listeniz: " + urunler);

        System.out.println("Listeden silmek istediğiniz bir ürünü yazınız:");
        String silinecek = scanner.nextLine();

        urunler.remove(silinecek);

        System.out.println("Güncel alışveriş listeniz: " + urunler);
    }
}
