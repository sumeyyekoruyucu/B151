package javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    Hashmap ile hashtable arasindaki fark nedir?

       1)Hashmap "thread safe" degildir,Hastable  "thread safe" dir.
         HashMap "synchranized" degildir "HashTable" "synchranized" dir.

       2)Hashmap bir tane "null" key e istediginiz kadar null value a musaade eder.
         Hashtable key lerde de value larda da "null" kullanilmasina musaade etmez.

       3)HashMap hizlidir, HashTable HashMap e gore yavastir.
       Note: HashMap ve HashTable ikisi de entry leri rastgele siralar.

     */
    public static void main(String[] args) {

        Hashtable<String,Integer> stdAges=new Hashtable<>();

        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        //stdAges.put(null,85); ==> HastTable larin keylerine de value larina da null konamaz.
        //stdAges.put("Chris",null);

        System.out.println(stdAges);

        //elements methodu hashmap lerde yok hashtable larda var












    }
}
