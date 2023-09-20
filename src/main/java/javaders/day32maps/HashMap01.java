package javaders.day32maps;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String,Integer>stdAges=new HashMap<>();


        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);

        //"key'i tekrarli kullandigimizda hata vermez,en son verilen entry nin degerini kabul eder.
        //Bu yontem value guncellemede kullanilabilir.Buna "overwrite" denir.

        stdAges.put("Tom",83);

        /*
        Maplerde keyler tekrarsiz olmali, ama valueler tekrarli olabilir. Maplerde key ve valuler {} icine konulur.
     Eger key tekrarli kullanilirsa kod hata vermez, ancak tekrarli olarak yazilan key'in en son ekleneni alir,
     onu yazdirir. Key'in yeni degerini(value) alir. Ornek "Tom" 76 idi, ikinci eklemede "Tom" 83 oldu ve sonucta
     "Tom" 83 olarak yazildi. Bu yontem VALUE GUNCELLEME'de tavsiye edilmese de kullanilabilir.
         */


        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        /*
     HashMap'ler "entry" leri rastgele siralar bu yuzden en hizli map'dir
     HashMap'ler "entry" leri siralarken "key" lere bakarak siralama yapar
 */

        //replace() value larui key leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel",39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        stdAges.replace("Angelina",58,61); //bu methodda angelina 58 olmasaydi degistirmezdi.
        // yani bu method key ve value ikisini de kontrol eder dogruysa degistirir. yoksa ayni birakir.
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //putIfAbsent() Map de "Brad" key olarak yoksa ekler,varsa eklemez.
        stdAges.putIfAbsent("Brad",60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
       // "get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom",0));//83

        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse",0));//0


        //containsValue(61) value larin arasinda 61 var mi? diye bakar.
        System.out.println(stdAges.containsValue(61));//true
        System.out.println(stdAges.containsValue(99));//false

        //containsKey("Ali") key'lerin icersinde Ali var mi diye bakkar
        System.out.println(stdAges.containsKey("Ali"));//false

        //remove("Ajda") key kullanarak entry yi silmeye yarar.
        stdAges.remove("Ajda");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Brad=58, Ezel=39}

        //remove("Tom",83) Map'te key'i "Tom" ,value su 81 ise siler,yoksa silmez.
        stdAges.remove("Tom",81);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Brad=58, Ezel=39}

        stdAges.remove("Tom",83);
        System.out.println(stdAges);//{Angelina=61, Brad=58, Ezel=39}

        // putAll() bir map in icine baska bir map koymaya yarar

        HashMap<String,Integer> kidsAges=new HashMap<>();

        kidsAges.put("John",12);
        kidsAges.put("Jin",22);
        kidsAges.put("Jack",32);

        //stdAges.putAll(kidsAges); stdAges Map ine kidsAges Map ini ekler. Dolayisiyla stdAges degismis olur,
        //Ama kidsAges Map i degismez.
        stdAges.putAll(kidsAges); // Hash map iki map in birlesimini rastgele siralar.
        System.out.println(stdAges);//{Angelina=61, John=12, Brad=58, Jack=32, Ezel=39, Jin=22}
        System.out.println(kidsAges);//{John=12, Jack=32, Jin=22}



    }

}
