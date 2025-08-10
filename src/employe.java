// Employe adinda bir class olusturduk ve bu class icinde degiskenler tanimladik
public class employe {

    private String Ad;
    private String soyAd;
    private ContactInfo contactInfo;

    // Bu metot calisanin adini, soyadini, telefonunu ve mailini atar.
    public void iletisim(String Ad, String soyAd, String phone, String email) {
        // this ile class icindeki degiskenlere ulasiyoruz
        this.Ad = Ad;
        this.soyAd = soyAd;

        // ContactInfo nesnesi olusturuyoruz (inner class)
        this.contactInfo = new ContactInfo(phone, email);
    }

    // Inner class olarak ContactInfo adinda bir class tanimladik.
    // Bu class icinde telefon ve email degiskenlerini tanimladik.
    public static class ContactInfo {

        private String phone;
        private String email;

        // Constructor (kurucu metot)
        public ContactInfo(String phone, String email) {
            this.phone = phone;
            this.email = email;
        }

        // Getter metotlari
        public String getPhone() { return phone; }
        public String getEmail() { return email; }
    }

    // Programin baslangic noktasi
    public static void main(String[] args) {
        // employe icindeki bilgilere ulasmak icin bir nesne olusturuyoruz
        employe employe = new employe();

        // employe nesnesi icinde iletisim metodunu cagiriyoruz
        employe.iletisim("Ahmet", "Yilmaz", "22222", "233455@gmail");

        // employe nesnesi icindeki degerleri yazdiriyoruz
        System.out.println(
                "Çalışanın Adı: " + employe.Ad + " " + employe.soyAd +
                        " | Telefonu: " + employe.contactInfo.getPhone() +
                        " | Email: " + employe.contactInfo.getEmail()
        );
    }
}
