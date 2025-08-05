public class MyList<T> {

    // Generic türde bir dizi tanımlıyoruz
    private T[] array;

    // Dizide şu ana kadar eklenen eleman sayısı
    private int size;

    // Dizinin kapasitesi (kaç kutu var)
    private int capacity;

    // Kapasiteyi döndüren metot
    public int getCapacity() {
        return capacity;
    }

    // Eleman sayısını (boyutunu) döndüren metot
    public int size() {
        return size;
    }

    // Boş constructor → kapasite varsayılan olarak 10
    public MyList() {
        this.size = 0;
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity];
    }

    // Parametreli constructor → kapasiteyi kullanıcı belirler
    public MyList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }

    // Eleman ekleme metodu
    public void add(T data) {
        // Eğer kapasite dolmuşsa, kapasiteyi 2 katına çıkar ve diziyi genişlet
        if (size == capacity) {
            capacity *= 2; // kapasiteyi 2 katına çıkar
            T[] newArray = (T[]) new Object[capacity]; // yeni dizi oluştur

            // Eski verileri yeni diziye kopyala
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }

            array = newArray; // yeni dizi artık bizim ana dizimiz oldu
        }

        // Yeni veriyi diziye ekle ve eleman sayısını artır
        array[size] = data;
        size++;
    }

    // Test için main metodu
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();

        System.out.println("Dizinin boyutu: " + liste.size());
        System.out.println("Dizinin kapasitesi: " + liste.getCapacity());
    }
}
