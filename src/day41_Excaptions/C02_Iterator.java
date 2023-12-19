package day41_Excaptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {


        List<Integer> sayılar = new ArrayList<>();

         sayılar.add(5);
         sayılar.add(1);
         sayılar.add(7);
         sayılar.add(3);
        System.out.println(sayılar);

        for (Integer each:sayılar){
            System.out.print(each+2+" ");
        }
        System.out.println(" ");
        System.out.println(sayılar);

        Iterator iterator= sayılar.iterator();


    }
}
