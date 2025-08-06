import java.util.HashMap; // Harfleri ve frekanslarını tutmak için
import java.util.Map;     // Map arayüzü
import java.util.Scanner; // Kullanıcıdan giriş almak için

public class FrekansBulma {

    public static void main(String[] args) {

        // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir kelime veya cümle isteniyor
        System.out.print("Bir kelime ya da cümle girin: ");
        String kelime = scanner.nextLine().toLowerCase(); // Küçük harfe çeviriyoruz

        // Harfleri ve frekanslarını tutacak boş bir HashMap oluşturuluyor
        Map<Character, Integer> frekans = new HashMap<>();

        // Girilen metindeki her karakteri tek tek kontrol ediyoruz
        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i); // İlgili karakteri alıyoruz

            // Sadece harf olan karakterlerle ilgileniyoruz (boşluk, noktalama, rakam yok)
            if (Character.isLetter(ch)) {

                // Harf daha önce eklenmişse, sayısını 1 artır
                if (frekans.containsKey(ch)) {
                    frekans.put(ch, frekans.get(ch) + 1);
                }
                // Harf ilk kez görülüyorsa, haritaya 1 olarak ekle
                else {
                    frekans.put(ch, 1);
                }
            }
        }

        // Harf frekanslarını ekrana yazdırıyoruz
        System.out.println("\nHarf Frekansları:");
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
