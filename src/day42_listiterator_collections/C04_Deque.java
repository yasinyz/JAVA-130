package day42_listiterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {


        // eklemeler ve silmeler baştan veya sondan olabilir

        Deque deque=new LinkedList();

        deque.add(5);
        deque.add(7);
        deque.add(3);

        System.out.println(deque);//[5, 7, 3]

        deque.addFirst(10);
        deque.addLast(11);

        System.out.println(deque);//[10, 5, 7, 3, 11]

        deque.offerLast(6);
        deque.offerFirst(4);
        System.out.println(deque);//[4, 10, 5, 7, 3, 11, 6]




    }
}
