package INTERFACE;


// 📌 1. Interface tanımı
// Interface: Sadece kuralları (metot imzalarını) belirler, içini doldurmaz.
interface Hayvan {
    // Her hayvanın ses çıkarması gerekir (ama nasıl çıkardığını interface bilmez)
    void sesCikar();
}

// 📌 2. Interface'i uygulayan (implements eden) sınıf
// "INTERFACE.Kedi" sınıfı INTERFACE.Hayvan kurallarına uyar ve sesCikar metodunu kendi yazısına göre doldurur.
class Kedi implements Hayvan {
    @Override // Interface'teki metodu zorunlu olarak dolduruyoruz.
    public void sesCikar() {
        System.out.println("Miyav 🐱");
    }
}

// 📌 3. Başka bir sınıf daha, o da INTERFACE.Hayvan kurallarına uyar.
class Kopek implements Hayvan {
    @Override
    public void sesCikar() {
        System.out.println("Hav hav 🐶");
    }
}

// 📌 4. Main class → Program burada başlar
public class interfaceKonusu {
    public static void main(String[] args) {

        // Interface türünde referans, farklı hayvan nesnelerini tutabilir.
        Hayvan h1 = new Kedi();  // INTERFACE.Kedi kurallarına göre ses çıkarır
        Hayvan h2 = new Kopek(); // Köpek kurallarına göre ses çıkarır

        // Metot çağrıları
        h1.sesCikar(); // Miyav 🐱
        h2.sesCikar(); // Hav hav 🐶
    }
}

/*
📌 ÖZET:
- interface = kurallar listesi (ne yapılmalı)
- implements = bu kurallara uymayı kabul etmek
- Class, interface’teki metotların içini doldurmak zorundadır.
- Aynı interface’i birden fazla sınıf farklı şekilde uygulayabilir.
*/
