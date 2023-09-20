package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {

    public static void main(String[] args) {

        //PriorityQueue Kendi belirledigi kurala gore dizer
        //Askerlik subelerinde master i olan basa gecsin, ogrenci olanlar suraya vs.
        //pasport sirasi cocuklular yaslilar one gelsin vs.

        Queue<String> line=new PriorityQueue<>();

        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");

        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]

        //Deque ==>Double ended Queue ==>D si double, e si iki uclu demek , iki uclu Queue
        //or: otobus iki kapisi var ilk binen arka kapidan, son binen on kapidan rahat iner.

        Deque<String> d=new LinkedList<>();

        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");

        //Deque'daki add(), get(), peek(), poll() remove()
        // methodlari first-last seklinde iki uclu olarak bulunur


    }
}
