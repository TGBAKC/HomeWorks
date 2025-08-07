import java.util.Scanner;

enum Day {
    SUNDAY("Kapalı"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");

    String calismaSaati;

    Day(String calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public String CalismaSaati() {
        return calismaSaati;
    }

    // 📌 Kullanıcının girdiği güne göre çalışma saatini döndürür
    public static String getCalismaSaatiByDay(String secilenGun) {
        Day gun = Day.valueOf(secilenGun.toUpperCase().trim()); // enum sabitini bul
        return gun.CalismaSaati(); // çalışma saatini döndür
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir gün ismi giriniz: ");
        String secilenGun = scanner.nextLine();

        // Çıktıyı yazdır
        System.out.println("Seçilen gün: " + secilenGun +
                " → " + Day.getCalismaSaatiByDay(secilenGun));
    }
}


