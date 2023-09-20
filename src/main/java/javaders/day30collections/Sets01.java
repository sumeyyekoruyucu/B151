package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    //Butun set ler in elemanlari tekrarsizdir.Non-Primitive data tipi kullanirlar butun collectionlar gibi
    /*
    1)Set ler "tekrarsiz" eleman(unique) depolamak icin kullanilir.
    2) 3 Tane Set Class vardir;

        i) HashSet Class:

    Bentersiz id olusturma teknigidir. Bu teknige "Hashing Tecnique "denir.
    "HashSet elemanlari rastgele atar.
    "Siralama yapmadigindan cok hizli calisir.
    "HashSet" ler "null" i eleman olarak kabul eder.

        ii)LinkedHashSet Class:

    "LinkHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden(Insertion Order)
    "HashSet"lere gore yavastirlar.

        iii)TreeSet Class:

    "TreeSet" ler elemanlari natural order'a gore siralar.Bu yuzden coooook yavastirlar.
     En yavas Set TreeSet tir.Cok yavas oldugundan mumkun oldugunca bunu kullanmamaya calisiriz.

     */

    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<>();

        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        // hs.add("Ezel"); birden fazla ayni elemandan eklesek bile 1 defa yazdirir.
        hs.add(null);

        System.out.println(hs);//[null, Zeki, Ajda, Cuneyt, Esra, Ezel]
        // ("HashSet"null i hep en basa yazdirir)
        // null i cift tirnak icine koyamazsin.

        System.out.println(hs.hashCode());//2038751948
        //biz hashset e ulasmak istersek Java bu id(hashcode) den hashset e ulasir.
        //hashing teknikle olusturulmus kodlar

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);//[234, 87, -32, 124]  verdigimiz sirayla

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);//[451, 87, 231, 124]

        //  lhs.retainAll(ls); Ilk linkhashsetteki(lhs) ortak elemanlari muhafaza et farkli elemanlari siler.
        //  Ikinciye dokunmaz.


        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124] //  Ilk linkhashsetteki farkli elemanlar silindi
        System.out.println(ls);//[451, 87, 231, 124] //ikincide degisiklik olmaz

        /*[insanlar]    insanlar.retainAll(suclular) ==>suclular
          [suclular]    insanlar.size(suclular)      ==>sucsuzlar
         */

        TreeSet<Character> ts=new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        // ts.add(null); ==> treesetlere null eklenemez
        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z

        System.out.println(ts.lower('R'));//G ==> Verilen eleman olan R den bir onceki elemani verir
        System.out.println(ts.lower('D'));//A ==>D Setimizde olmasa bile alfabetik olarak sette olan harflerden bir oncekini verir
        System.out.println(ts.lower('A'));//null
        System.out.println(ts.higher('K'));//R ==>K olmasa bile k dan bir onceki sonraki elemani verir

        System.out.println(ts.headSet('R'));//[A, G] ==>Parantez icindeki R dahil degildir
        System.out.println(ts.headSet('R',true)); //[A, G, R]

        System.out.println(ts.tailSet('G'));//[G, R, U, Z] ==>Parantez icindeki G dahildir
        System.out.println(ts.tailSet('G',false));//==>Parantez icindeki G dahil degildir

        System.out.println(ts.ceiling('R'));//R==>Eleman setin icinde varsa elemanin kendisini return eder.
        System.out.println(ts.ceiling('K'));//R==>Eleman setin icinde yoksa sonraki elemani return eder.

        System.out.println(ts.floor('G'));//G==>Eleman setin icinde varsa elemanin kendisini return eder.
        System.out.println(ts.floor('J'));//G==>Eleman setin icinde yoksa onceki elemani return eder.

        System.out.println(ts.subSet('G','Z'));//[G,R,U]==> ilk eleman dahil ikinci haric.
        System.out.println(ts.subSet('G',false,'Z',true));//[R, U, Z]










    }
}
