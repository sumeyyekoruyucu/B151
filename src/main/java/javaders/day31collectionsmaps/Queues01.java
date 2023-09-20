package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {

        //Queue olusturmak icin iki constructor kullanabiliriz
        //    i) LinkedList
        //    ii)PriorityQueue

        Queue<String> wareHouse=new LinkedList<>();
        // "Queue"  Ilk girenin ilk cikmasi gerektigi durumlarda kullanilir.
        // or: bir markete ilk giren urun ilk satilmalidir,cikmalidir,banka sirasi ilk giren ilk isini gorur, cikar
        // bu banka eger java kullaniyosa Queue kullaniyodur.


        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");

        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]

        //add methodunun digerleri yok araya kaynak yaptirmiyo burda sira onemli
        // remove bir tane oda ilk elemani siler.

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        //peek Queue bossa null ,element Queue bossa hata verir.

        System.out.println(wareHouse.poll());//Meat
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();
        System.out.println(wareHouse.poll()); //null
        //System.out.println(wareHouse.remove());//hata verdi






    }

}
