package javaders.day31collectionsmaps;

import java.util.*;

public class HashMap01 { //Map : sozluk
    //Map  "Key: Value" Kelime: Aciklamasi structure ini kullanir.
    //Entry tamamina denir. EntrySet
    //Butun Entry lerin key kismi tekrarsiz oldugu icin hepsi tekrarsiz dir.bu yuzden set olur.
    //Map ler olusturulurken iki data type kullanilir. biri key ler icin biri Value lar icin
    /*
    Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
   Ornek:
   Cat=Evcil hayvan
  Dog=Evcil hayvan
  Su sozluk yapisi Java'daki map yapisina benzer. Kelimenin oldugu sirada ayni kelimeden birden fazla bulunmaz
  bu kelimeler tekrarsizdir. Sol tarafta tekrarli kelimeler yani esanlamli kelimeler olabilir. Maplerde de boyle
  iki bolum olur. Ilk bolum tekrarsiz, ikinci bolumde tekrarli bolum olabilir. Tekrarsiz kisim key, tekrarli kisim
  value olarak tanimlanir. Key=Value
  Maplar key=value yapisini kullanir. Maplerde birinci ve ikinci deger var. Maplerdeki elemanlara "Entry" denilir.
  Elemanlari iceren yapinin tamamina "EntrySet" denir.
  Java tekrarsizlara Set diyor,
  //Key(Tekrarsız) =Value(Tekrarlı olabilir)
  /*   Key   = Value
    Cat  = Evcil hayvan
    Dog  = Evcil hayvan
    Crocodile= Vahşi hayvan
    Tiger = Vahşi hayvan
    ***Entry**********
    Entry Set =Maplar deki tüm elemanlara.

   Map lar KeyValue strucktur unu kullanınır.
    */

      /*

   MY NOTES:
   Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
  "key" kismi tekrarsiz, "value kismi tekrarli olabilir.
   Mapler "key" ve "value" structur'ini kullanir.
   Map'lerdeki elemanlara "entry" denir.
   Elemanlarin tamanina ise "entry set" denilir.
   Entry ler Tekrarsiz  oldugu icin "EntrySet"denilir
   //Key ve Value'lar ayri ayri data type 'larinda olabilirLER:
       */



    public static void main(String[] args) {

        //map nasil olusturulur?
        HashMap<String,Integer> countryPopulation=new HashMap<>();

        //add() tekli datayi koyar. put() ayri data tipleri koyabilir

        //Map e entry nasil eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albania",3000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",10000000);

        //HashMapler Entry leri rastgele siralar.Bu yuzden en hizli map tir
        //Map ler collection degildir.Farkli bir yapidir
        // collectionlar koseli parantez kullaniyodu. bunlar suslu parantez kullanir

        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=10000000, USA=400000000, Germany=83000000, Albania=3000000}

        //get almak demek(get(); methodu key ile calisir bize value yu verir)
        int usaPopulation=countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //Butun key leri nasil alabiliriz?(Tekrarsiz oldugu icin setin icine koyar)
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Turkiye, Netherland, USA, Germany, Albania]

        //Butun value lari nasil aliriz?
        Collection<Integer> values= countryPopulation.values();
        System.out.println(values);//[83000000, 10000000, 400000000, 83000000, 3000000]

        //ex 1: countryPopulation map indeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value= countryPopulation.values();
        int sum=0;
        for(int w:value){
            sum=sum+w;
        }
        System.out.println(sum/ value.size());//115800000

        //entrySet()Map teki "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        Set<Map.Entry<String,Integer>>entries=countryPopulation.entrySet();//data tipini bulmak icin method ustunde beklenir
        System.out.println(entries);//[Turkiye=83000000, Netherland=10000000, USA=400000000, Germany=83000000, Albania=3000000]

        //loop lar map lerde calismaz set icine koyup(entryset()) calisabiliriz.

        // ex 2:countryPopulation mapindeki ulkelerin isimlerinin karakter sayisi ile nufuslarinin top. bulunuz

        int toplam=0;

        for(Map.Entry<String,Integer> w : entries){
           toplam= toplam+w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);//579000034











    }
}
