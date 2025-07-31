import javax.swing.event.TreeWillExpandListener;
import java.lang.classfile.instruction.LabelTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedMap;

public class Array {








    public static void main(String[] args) {

        ArrayList<Integer> elemanlar = new ArrayList <>();
        elemanlar.add(10);
        elemanlar.add(20);
        elemanlar.add(30);
        elemanlar.add(40);
        elemanlar.add(50);
        elemanlar.add(60);
        elemanlar.add(70);
        elemanlar.add(80);
        elemanlar.add(90);
        elemanlar.add(12);


        Collections.sort(elemanlar);
        System.out.println(elemanlar);

        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0, sayi2 = 0;

        for(int i =0; i< elemanlar.size()-1;i++){
       int fark = elemanlar.get(i+1) - elemanlar.get(i);

            if(fark < minFark){
                minFark = fark;
                sayi1 = elemanlar.get(i);
                sayi2 = elemanlar.get(i+1);
            }


   }






    }

































}
