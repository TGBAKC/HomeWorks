// Student adında bir record tanımlıyoruz.
// Record, değişmez (immutable) ve veri taşıyıcı sınıflar için kullanılır.
// Bileşenler (ad, soyad, ogrenciNo) için otomatik olarak:
// - private final alanlar
// - erişim metotları (ad(), soyad(), ogrenciNo())
// - equals(), hashCode() ve toString()
// üretilir.
record Student(String ad, String soyad, int ogrenciNo) { }

public class StudentRecordExample {

    public static void main(String[] args) {

        // record yapısıyla öğrenci nesneleri oluşturuyoruz
        Student student  = new Student("Ahmet", "yILMAZ", 1);
        Student student2 = new Student("Ayse",  "yILMA",  12);
        Student student3 = new Student("Aslan", "yIL",    123);
        Student student4 = new Student("Ahmet", "Yılmaz", 1); // soyadında büyük/küçük harf farkı

        // Bileşen erişim metotlarıyla (component accessor) bilgileri yazdırıyoruz
        System.out.println("ogrenci adi :" + student.ad()  + " soyadi :" + student.soyad()  + " ogrenci no :" + student.ogrenciNo());
        System.out.println("ogrenci adi :" + student2.ad() + " soyadi :" + student2.soyad() + " ogrenci no :" + student2.ogrenciNo());
        System.out.println("ogrenci adi :" + student3.ad() + " soyadi :" + student3.soyad() + " ogrenci no :" + student3.ogrenciNo());

        // equals & hashCode testleri
        // Not: record'larda equals ve hashCode alanlara göre otomatik üretilir ve karşılaştırma BÜYÜK/KÜÇÜK harfe duyarlıdır.
        System.out.println("student1 equals student2? " + student.equals(student2)); // beklenen: false
        System.out.println("student1 equals student3? " + student.equals(student3)); // beklenen: false
        System.out.println("student1 equals student4? " + student.equals(student4)); // soyad farkı nedeniyle muhtemelen false

        // hashCode değerleri, equals ile tutarlı olacak şekilde otomatik üretilir
        System.out.println("student1 hashCode: " + student.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
        System.out.println("student1 hashCode (tekrar): " + student.hashCode()); // aynı nesne değişmediği sürece aynı değer
        System.out.println("student4 hashCode: " + student4.hashCode());
    }
}
