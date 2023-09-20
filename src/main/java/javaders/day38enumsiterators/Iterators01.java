package javaders.day38enumsiterators;


import java.util.*;

public class Iterators01 {

    /*
    1) Iterator lar loop larin yaptigi ayni isi yapar.
    neden java bunu olusturdu. cunku ;
    2) Iterator larda sonsuz loop olusma ihtimali yoktur.(loop larda var)
    3) Iterator lar ile loop lar arasinda performans(hiz) farki yoktur.
    4) Iterator lar bir collection dan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidirlar.
    5) Iki tip Iterator vardir
            i) Iterator: Bu sadece eleman silmede kullanilir,
                         eleman eklemek veya elemani degistirmek mumkun degildir.

            ii) ListIterator: Bu eleman silebilir,ekleyebilir ve degistirebilir.
            Note: "Iterator" sadece soldan saga (ilk elemandan son elemana) calisir.
                  "ListIterator": Ise iki yonlu calisir.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]
        //"Iterator" kullanim
        Iterator<String> myItr= myList.iterator();//(pointer la calisir.)

        while(myItr.hasNext()){//.hasNext() pointer a senden sonra eleman var mi diye sorar.varsa true return eder

            myItr.next(); //pointer i hep bi sonraki elemanin onune yollar.ve ustunden atladigi elemani return eder
            myItr.remove();//next methodunun return ettigi elemani siler
        }
        System.out.println(myList);//[]

        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!");

        }
        System.out.println(yourList);// [Tom!, Jim!, Clara!, Angie!, Mark!]

        //hasPrevious() ve previous() nasil kullanilir?
        while(yourListItr.hasPrevious()){

            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);

        }
        System.out.println(yourList);// [ ?Tom!,   ?Jim!,   ?Clara! ]

        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();// descendingIterator() ancak LinkedList ile kulanilabilir.

        while(ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }
    }
}
