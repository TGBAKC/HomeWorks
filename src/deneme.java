import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deneme {


    record Ogrenci ( String ad, double notOrtalamasi) implements Comparable < Ogrenci >{


        @Override
        public int compareTo(Ogrenci o) {
            return Double.compare( o.notOrtalamasi, this.notOrtalamasi);
        }

    }


    public static void main(String[] args) {

      Ogrenci ogrenci1= new Ogrenci("ahmet",85.5) ;
        Ogrenci ogrenci2= new Ogrenci("ali",55.5) ;
        Ogrenci ogrenci3= new Ogrenci("ali",90.5) ;
        Ogrenci ogrenci4= new Ogrenci("ali",45.5) ;
        Ogrenci ogrenci5= new Ogrenci("ali",25.5) ;


        List<Ogrenci>Ogrenci = new ArrayList<>();
        Collections.addAll(Ogrenci,ogrenci1,ogrenci2,ogrenci3,ogrenci4,ogrenci5);
        Collections.sort(Ogrenci);


        for (Ogrenci o : Ogrenci) {
            System.out.println(o);
        }








    }














}
