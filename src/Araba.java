public class Araba {

    private String marka;   // her araba için ayrı
    private String model;   // her araba için ayrı
    public static int tekerSayisi = 4; // tüm arabalar için ortak

    // İstersen sabit de bırakabilirdin ama örnek olsun diye constructor ekledim
    public Araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    // Parametresiz: sadece yazdırır
    public void bilgiYazdir() {
        System.out.println("Marka: " + marka + ", Model: " + model + ", Teker: " + tekerSayisi);
    }

    public static void main(String[] args) {
        Araba a1 = new Araba("Toyota", "Corolla 2023");
        Araba a2 = new Araba("Honda", "Civic 2020");

        a1.bilgiYazdir();
        a2.bilgiYazdir();

        // static alanın ortak olduğunu göstermek için:
        Araba.tekerSayisi = 3;
        a1.bilgiYazdir(); // teker sayısı her ikisinde de 3 oldu
        a2.bilgiYazdir();
    }
}
