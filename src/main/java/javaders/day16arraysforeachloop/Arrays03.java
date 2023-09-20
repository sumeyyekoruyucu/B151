package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin Arrayde olup olmadigini anlamak icin gereken kodu yaziniz
        //Stringdeki contains in yaptigi isi Array de yapan kodu yazicaz(counter>0)

        String names[]={"K","C", "R", "A", "S"};
        String el="E";

        //1.way:
        int counter = 0;
        for (String w: names){
            if(w.equals(el)){
                counter++;
                break;
            }
        }
        if (counter>0){ //cocugunuz varmi veya cocuk sayiniz 0 dan buyuk mu ayni seydir
            System.out.println("Array has " + el);
        }else{
            System.out.println("Array does not have " + el);
        }//var mi yok mu bakmak icin eleman sayisi 0 dan buyuk mu diye bakilabilir

        //2.way: binarySearch() methodu hizli arama yapar
        // sirala , ortadakine bak, bir tarafi ele,islemi tekrarla

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);//binarySearch A nin indexi int verir
        System.out.println(result); // yazdirinca indexi cikar(0) index varsa A da var demektir
        // 1) binarySearch() methodunu sort() kullanmadan kullanmayiniz.Cunku binarySearch mantigi sirali elemanlar icin gecerlidir
        // 2) binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        // 3) binarySearch() methodundan aldiginiz index 0 veya 0 dan buyukse bu eleman Arrayde var demektir
        // 4) binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        // 5) "-" isaretinin anlami o eleman yok demektir sayi ise o eleman olsaydi kacinci eleman olurdu demektir
        if (result<0){
            System.out.println("Array does not have " + el);
        }else{
            System.out.println("Array has " + el);
        }
    }
}
