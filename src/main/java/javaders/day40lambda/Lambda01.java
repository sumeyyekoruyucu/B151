package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


        List<String>iller=new ArrayList<>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","Ordu","Gaziantep","Hatay","Edirne","MUS"));
        bykHrfLenghtArtanDistinct(iller);
        System.out.println();

        bykHrfSonHarfArtanDistinct(iller);
        System.out.println();

        bykHarfLenghtArtanDistinctAyniUznNatrlOrder(iller);
        System.out.println();

        System.out.println(karakterSayisiBestenFazlaIseSil(iller));
        System.out.println();

        System.out.println(hIleBaslayanUIleBitenElSil(iller));
        System.out.println();


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfLenghtArtanDistinct(List<String>iller){
        System.out.println();
        iller.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).
                forEach(t->System.out.print(t+" "));
    //lambda expression
    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

      public static void bykHrfSonHarfArtanDistinct(List<String>iller){
          System.out.println();
          iller.stream().distinct().
                  map(t->t.toUpperCase()).//lambda expression bunun kolayi method referance asagida yaptik
                  sorted(Comparator.
                  comparing(t->t.charAt(t.length()-1))).//lambda expression(ama burda icine bosluk yazdiramiyoruz)
                  forEach(t->System.out.print(t+" "));
                  // lambda expression da icine bosluk yazdirmak icin sonra method yazicaz.simdi yapismasin diye alt alta yaptik
    }

    //3. soruyu lambda expression ile degil //method referance ile yapicaz
    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar



    public static void bykHarfLenghtArtanDistinctAyniUznNatrlOrder(List<String>iller){
        System.out.println();
        iller.stream().distinct().//
                map(String :: toUpperCase).//buyuk harfi burda baska yaptik.( method referance)
                sorted(Comparator.comparing(String :: length).thenComparing(Comparator.naturalOrder())).//sonra yine karsilastir
                forEach(System.out::println);////method referance ile yazdirma
              //forEach(t->System.out.print(t+" ")); lambda expression ile yazdirma
    }

    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz

    public static List<String> karakterSayisiBestenFazlaIseSil(List<String>iller){
        iller.removeIf(t->t.length()>5);
        return iller;
        //stream yazinca remove gelmedigi icin burda kullanmadik.void i de degistirdik.
        //sout yapmadigimiz return yaptigimiz icin de yukarda main de yazdirdik

        //Note:Bazi durumlarda stream methodu aradigimiz methodlari vermez bu nedenle akisa sunmadan "iller." dedikten sonra removeIf() kullandik
       //  Note 2: removeIf() methodu silme islemi bir sarta bagli ise kullaniriz

    }


    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz

    public static List<String> hIleBaslayanUIleBitenElSil(List<String>iller){
        iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));
        return iller; //[Van, MUS, MUS] removeIf silince tam siliyor


    }



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin


    public static List<Integer> elKarakterSayilarininKareleriniAl(List<String> iller ){
        System.out.print("6) ");
        return iller.
                stream().
                map(Utils::karesiniAl).// LAMBDA EXPRESSION   map(t->t.length() * t.length()).
                        collect(Collectors.toList());
    }



    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> karakterSayisiCiftOlanlariListYazdir(List<String> iller ) {
        System.out.print("7) ");
        return  iller.
                stream().
                filter(Utils::ciftMi).//Lambda expression filter(t->t.length() %2 ==0).
                        collect(Collectors.toList());
    }
}
