import java.util.ArrayList;
import java.util.Comparator;

public  class FilmFiltreleme {

    // Film sınıfı
    public static class Film {
        String FilmAdi;
        int YayinYili;
        String FilmTuru;
        double ImdbPuani;

        public Film(String FilmAdi, int YayinYili, String FilmTuru, double ImdbPuani) {
            this.FilmAdi = FilmAdi;
            this.YayinYili = YayinYili;
            this.FilmTuru = FilmTuru;
            this.ImdbPuani = ImdbPuani;
        }
    }

    // Film türüne göre filtreleme metodu
    public static void filmTuruneGoreFiltrele(ArrayList<Film> liste, String tur) {
        System.out.println("\n📌 '" + tur + "' türündeki filmler:");
        boolean bulundu = false;

        for (Film film : liste) {
            if (film.FilmTuru.equalsIgnoreCase(tur)) {
                System.out.println(film.FilmAdi + " (" + film.YayinYili + ") - IMDb: " + film.ImdbPuani);
                bulundu = true;
            }
        }

        if (!bulundu) {
            System.out.println("Bu türe ait film bulunamadı.");
        }
    }

    public static void main(String[] args) {
        // Film listesi oluştur
        ArrayList<Film> filmler = new ArrayList<>();

        filmler.add(new Film("Inception", 2010, "Bilim Kurgu", 8.8));
        filmler.add(new Film("The Notebook", 2004, "Romantik", 7.8));
        filmler.add(new Film("Twilight", 2008, "Fantastik", 5.2));
        filmler.add(new Film("Parasite", 2019, "Dram", 8.6));
        filmler.add(new Film("Titanic", 1997, "Romantik", 7.9));

        // IMDb'ye göre büyükten küçüğe sıralama

        filmler.sort(Comparator.comparing(f -> f.ImdbPuani));
        System.out.println("🎬 IMDb Puanına Göre Büyükten Küçüğe:");
        for (Film f : filmler) {
            System.out.println(f.FilmAdi + " - IMDb: " + f.ImdbPuani);
        }

        // Yayın yılına göre küçükten büyüğe sıralama
        filmler.sort(Comparator.comparingInt(f -> f.YayinYili));
        System.out.println("\n📅 Yayın Yılına Göre Küçükten Büyüğe:");
        for (Film film : filmler) {
            System.out.println(film.FilmAdi + " - Yıl: " + film.YayinYili);
        }

        // Film türüne göre filtreleme çağrıları
        filmTuruneGoreFiltrele(filmler, "Romantik");
        filmTuruneGoreFiltrele(filmler, "Dram");
        filmTuruneGoreFiltrele(filmler, "Aksiyon"); // olmayan tür örneği
    }
}
