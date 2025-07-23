import java.awt.*;
import java.util.Scanner;

public class carpimTablosu {


    public static void main(String[] args) {

        System.out.println("1 ile 10 arasi pozitif bir tam sayi griniz");
        Scanner scanner = new Scanner(System.in);

        int n =scanner.nextInt();




        if (n < 1 || n > 10) {
            System.out.println("Hatalı giriş! Sayı 1 ile 10 arasında olmalı.");
            return;
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "  ");
            }
            System.out.println();
        }



















    }














    }



















