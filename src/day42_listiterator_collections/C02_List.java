package day42_listiterator_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        List<Integer> sayılar=new LinkedList<>();

        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(10);

        System.out.println(sayılar);//[5, 7, 10]

        sayılar.add(2,44);
        System.out.println(sayılar); // [5, 7, 44, 10]


        List<Integer> digerList=new LinkedList<>();
        digerList.add(44);
        digerList.add(23);
        digerList.add(10);

        System.out.println(digerList); // [44, 23, 10]

     sayılar.retainAll(digerList);
     // sayılar listesinden diger listede olmayanları siler

        System.out.println(sayılar); // [44, 10]

        System.out.println(sayılar.hashCode()); // 2335



    }
}
