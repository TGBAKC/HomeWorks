import java.util.Scanner;

public class minMaxValues {


    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;







        for(int i=1; i<=4; i++){

     System.out.println( i + ".sayi giriniz" );
     int sayi= scanner.nextInt();

            if (sayi < min) {
                min = sayi;
                System.out.println(sayi + " en küçüktür");
            }

            if (sayi > max) {
                max = sayi;
                System.out.println(sayi + " en büyüktür");
            }




        }









        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);








    }






























}







