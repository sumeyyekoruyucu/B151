package javaders.day29collections;

import java.util.LinkedList;

public class LinkedList01 {

    // Arraylist ler eleman silme ve ekleme de tekrar indexleme yapmak zorunda olduklarindan
    // eleman silme ve ekleme de basarisizdirlar,yaparlar ama cok uzun,zahmetli
    // Java bunun icin Linklistleri uretmistir
    // Linkedlistler icinde cift bolmeli kutucuklar var ilk bolmelerinde data
    // ikinci bolmelerinde pointer var.son elemanin pointeri null dir.
    // ilk elemani gosteren Head ismi verilen data bolumunu icermeyip sadece pointer bolumu olan kutu vardir.
    // Burdaki farkli yapidan(cift bolmeli) dolayi eleman degil "Node" diyoruz.
        /*
        Bu yapinin eleman silmede kolayligi;
        silinen Node u gosteren pointeri siler ve bu Node dan sonraki elemani gosteren pointeri siler.
        Silinen Node dan Bir onceki node un pointeri Silinen Node dan Bir sonraki Node gosterir.

         Bu yapinin eleman eklemedeki kolayligi;
         Eklenen Node dan bir onceki pointeri silip eklenen node icin pointer olusturur.

         1)Linkedlistler index kullanmazlar bu yuzden eleman ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
         2)Linkedlistlerde node ekleme ve silme islemi yaparken sadece pointeri degistiririz.

         Silme ve ekleme islemlerini coklukla yapacagimiz zaman Linkedlist kullaniriz
         ör: muzeye sabah girenleri ekliyo aksam girenleri siliyo.muze kapandiginda herkes cikmis mi kontrol ediyor
         bu gibi orneklerde linkedlist kullanmaliyiz.
         or: marketler aldigini ekliyor sattiklrini listeden cikariyor.

         Arraylist gereksiz mi hayir tabiki onda index old icin eleman bulmak daha kolay
         linkedlistte node node dolasir senden sonraki su eleman mi diye sorar bu cok uzun

         Arraylistler eleman bulmada cok basarilidir.

         Arraylistler indexleri adres gibi kullanir bu yuzden Arraylistler search islemlerinde cok basarilidirlar

         note: ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretleri) linkedlist,
         search islemleri yapacaksa(amerika eyaletleri gibi) Arraylist kullanilir

         Butun Collectionlar linkedlistte dahil non primitive data type kullanirlar.
         */

    public static void main(String[] args) {

        LinkedList<String> s =new LinkedList<>();

        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        System.out.println(s);//[Steve, Ajda, Muge, Cuneyt, Esra]

        s.add(2,"Esen");// aslinda burda index kullanmiyor arkada bunu node 3 yapiyor.
        //kolaylik olsun diye yeni birsey uretmemek icin

        System.out.println(s);//[Steve, Ajda, Esen, Muge, Cuneyt, Esra]

        s.addFirst("Kemal");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra]

        s.addLast("Ajdar");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]

        s.remove(2);//silmek icin
        //indexle ,eleman ismiyle(object),ilk eleman,son eleman, vb silinir bircok remove methodu var.
        //Linkedlist eleman ekleme ve silmede uzman old icin bir cok ekleme,silme methodu var.
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

        s.remove("Ajdar");
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra]

        s.remove();//herhangi bir parametre olmadan kullanirsak direk ilk elemani siler
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        s.addFirst("Esra");
        System.out.println(s);//[Esra, Steve, Esen, Muge, Cuneyt, Esra]

        s.removeFirstOccurrence("Esra");//ilk gorunen esra gider
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        // s.removeLastOccurrence("Esra"); //son gorunen esra gider

        //peek() // ilk elemani(node) getirir,gosterir ama silmez

        String r1 = s.peek();
        System.out.println(r1);//Steve
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        //poll() // ilk elemani(node) getirir,gosterir ve siler
        String r2=s.poll();
        System.out.println(r2);//Steve
        System.out.println(s);//[Esen, Muge, Cuneyt, Esra]

        /*
       Not; peek() ile element() ikisi de ilk elemani silemeden size verir.
       Ama peek() list bos oldugunda size "null" verir, element() ise "hata" verir.

        Retrieves, but does not remove,first element of this list .
        throws: NoSuchElementException if this list is empty.
        This method is equivalent to getFirst().
         */

        //element();//ilk elemani silmeden size verir (copy+paste)
        String r3=s.element();
        System.out.println(r3);//Esen
        System.out.println(s);//[Esen, Muge, Cuneyt, Esra]

        /*
         Not; poll() ile pop() ikisi de ilk elemani silemeden size verir.
        Ama poll() list bos oldugunda size "null" verir, pop() ise "hata" verir.
        Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
        This method is equivalent to removeFirst().
         */
        //s.pop(); //ilk elemani bize verir ve siler.list bossa hata verir.

        String r4=s.pop();
        System.out.println(r4);//Esen
        System.out.println(s);//[Muge, Cuneyt, Esra]












    }
}
