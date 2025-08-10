/* record clas ozellikleri
* 1️⃣ Immutable (Değiştirilemez)
Bir record’daki alanlar (field) final gibidir.

Yani değer atandıktan sonra değiştirilemez.

Setter metodu olmaz.*/


record Kisi(String ad, int yas) {}
Kisi k = new Kisi("Ali", 30);
// k.ad = "Veli"; ❌ HATA - değiştirilemez






/*️⃣2 )   Otomatik Metotlar
Java otomatik olarak şunları oluşturur:

Constructor → Parametreli kurucu

Getter (ama get değil, alan adıyla aynı metot) → ad(), yas()

toString() → Bilgileri düzgün formatta döndürür

equals() & hashCode() → Nesne karşılaştırma için*/



   public static void main(String[] args) {

/* Java 16 ile gelen record ozelligi ile basit bir ornek
kisi adinda bir record tanimladik ve ksii nesnesi olusturduk
ve kisi nesnesine erisim sagladik ad ve soyad yazdrdik*/



    record Kisi(String ad, int yas) {}
    Kisi kisi = new Kisi("Ali",30);

    System.out.println(kisi.ad() + " "   + kisi.yas() + "yasindadir");
    // buarada kisi nesnesinin ad ve yas alanlarina otomatik olarak ulasiyoruz.
}



/* 3) Kısa Sınıf Tanımı */

//record Kisi (String ad,String soyad){}//


 /* 4)       4️⃣ Final ve Extend Edilemez
record otomatik olarak final olur.

Başka bir sınıf onu extend edemez.

Ama interface implemente edebilir.*/






