import java.util.Scanner;

public class wonderfulTall {

    public static void main(String[] args) {
        System.out.println("bir sayi griniz");
       Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();

  for(int i =2;i<=p;i++){


      if(p % i==0){

          System.out.println("p asal degil");



      }

      else{


          System.out.println("bu asaldir");

      }
      if(p % 2 !=0){

        int result = (int) Math.pow(2, p - 1);

          System.out.println("sadkkf" + result);

  }



















    }
}}