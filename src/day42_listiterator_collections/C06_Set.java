package day42_listiterator_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_Set {

    public static void main(String[] args) {

        //setin ikiözelliği mutlakaa bilinmeli
        //1- her elemandan sadece 1 tane olabilir
        // var olan elementi yeniden eklemek istersek
        // eskiyi siler aynı elementin yenisini kaydeder
        // 2- index desdeklemez

        int[] arr={2,3,4,5,6,4,6,7,4,3,2,4,5,5,4,3,3};
        // verilen array'i unique elementlerden olusan
        // tekrarsiz bir array haline getirin
        Set<Integer> uniqueSet=new HashSet<>();

        for (int each :arr){
            uniqueSet.add(each);
        }
        System.out.println(uniqueSet); // [2, 3, 4, 5, 6, 7]
        // Bizim unique sayilarla elde ettigimiz set
        // simdi bu set'teki elementleri, kendi arr'mize atamaliyiz

        arr=new int[uniqueSet.size()];
        // bir loop ile array'deki tum sayilari uniqueSet'e ekleyelim
        int index=0;
        for (Integer each :uniqueSet){
            arr[index]=each;
            index++;

        }
        System.out.println("Array'in son hali:"+ Arrays.toString(arr));


    }
}
