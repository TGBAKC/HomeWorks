import java.util.ArrayList;
import java.util.Scanner;

public class HarfBulmaca {

    public static void main(String[] args) {

        // Başlangıçta 4 harften oluşan liste
        ArrayList<String> yazilar = new ArrayList<>();
        yazilar.add("d");
        yazilar.add("f");
        yazilar.add("r");
        yazilar.add("e");

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 4 harf girişi al

        for (int i = 0; i < 4; i++) {

            System.out.println("Lütfen bir harf giriniz: ");
            String harf = scanner.next();

            // Eğer listede varsa, bulunduğu yeri "found" yap

            if (yazilar.contains(harf)) {
                int index = yazilar.indexOf(harf);
                yazilar.set(index, "found");
                System.out.println("Bu harf bulundu, found yapıldı!");
            }
            // Yoksa listeye ekle

            else {
                yazilar.add(harf);
                System.out.println("Harf listede yoktu, eklendi.");
            }
        }

        // Güncellenmiş listeyi yazdır

        System.out.println("Güncellenmiş liste: " + yazilar);
    }
}





