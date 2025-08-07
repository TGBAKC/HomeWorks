public class HAFTAICI {
    public static void main(String[] args) {
        for (Gunler gunler : Gunler.values()) {
            System.out.println(gunler + ": " + gunler.CalismaGunuMu());
        }
    }
}

enum Gunler {
    PAZARTESI(true),
    SALI(true),
    CARSAMBA(false),
    PERSEMBE(true),
    CUMA(false);

    private boolean calismaGunuMu;

    Gunler(boolean calismaGunuMu) {
        this.calismaGunuMu = calismaGunuMu;
    }

    public boolean CalismaGunuMu() {
        return calismaGunuMu;
    }
}
