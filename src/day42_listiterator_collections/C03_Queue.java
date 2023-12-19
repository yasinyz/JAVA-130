package day42_listiterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {


        /*
        Queue (kuyruk) yapısı geregi
        eklenenler ototmatik sona eklenir silinenler
         en baştan silinir

                  */

        Queue<Integer> queue=new LinkedList();

        queue.add(6);
        queue.add(9);
        queue.add(2);

        System.out.println(queue); //[6, 9, 2]

        queue.remove();
        System.out.println(queue);//[9, 2]

        System.out.println(queue.element());
        // en baştaki elementi silmeden bize getirir

        System.out.println(queue.peek());
        // en baştaki elementi silmeden bize

        Queue<Integer> bosQueue=new LinkedList<>();
       // bosQueue.element();
       // ikisi aynı işlemi yapar bir excaption fırlatır
        // diğeri null döndürür
        System.out.println(bosQueue.peek());

       // add ile aynı işlemi yapar add her durumda ekler
        // offer ise kapasite sınırlaması yoksa ekler
        queue.offer(7);
        System.out.println(queue);


        System.out.println(queue.poll());
        //queue nin başındaki elementi siler ve bize getirir


    }
}
