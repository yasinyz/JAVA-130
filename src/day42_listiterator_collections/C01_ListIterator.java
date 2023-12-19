package day42_listiterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {

    public static void main(String[] args) {


        List<Integer> sayılar = new ArrayList<>();

        sayılar.add(5);
        sayılar.add(1);
        sayılar.add(7);
        sayılar.add(3);
        System.out.println(sayılar);

        ListIterator lit= sayılar.listIterator();

      while (lit.hasNext()){
          Integer sayı=(Integer) lit.next();
          lit.set(sayı+2);
      }
        System.out.println(sayılar);


        // iterator'da takip etmemiz gereken en onemli konu
        // iterator'i nerede biraktigimizdir
        // ornegin bu soruda iterator 34.satir itibariyle en sonda
       // listedeki elementleri index kullanmadan
        // sondan başa doğru yazdırın

      while (lit.hasPrevious()){
          System.out.print(lit.hasPrevious());
      }
        System.out.println("");
      // bu loop iteratoro sona götürür
      while (lit.hasNext()){
          lit.next();
      }
        System.out.println(sayılar);


      lit= sayılar.listIterator();

      while (lit.hasNext()){
         Integer sayi=(Integer)lit.next();
         if (sayi>0){
             lit.set(sayi+7);
         }
      }
        System.out.println(sayılar);

    }
}
