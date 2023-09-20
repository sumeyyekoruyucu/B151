package javaders.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    /*
               method ogrenirken 3 seye dikkat!!
       o method ne is yapar, o method nasil kullanilir, o method size ne verir
 */
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun]

        //Arraylist te bir elemanin ilk gorunumu nasil silinir? (remove())
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //Arraylist te bir eleman indexi kullanirsak nasil silinir?
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun]

        //Arraylist olusturulurken en basa Arraylist yerine List de yapabilirsiniz.
        // Sebebini Collections konusunda gorecegiz
         List<Integer> ages= new ArrayList<>();
         ages.add(23);
         ages.add(12);
         ages.add(7);
         ages.add(4);

         // ex 1:12 yi ages.list ten siliniz
        //System.out.println(ages.remove(12));// primitive int kabul eder
        //primitive int remove icinde kullanilinca java onu index kabul eder
        //java ya 12 nin index olmadigini kabul ettirmek icin int yerine wrapper class Integer kullanmaliyiz

        ages.remove((Integer)12);//[23, 7, 4]
        System.out.println(ages);

        //Bir ArrayList'teki bir elemanin tum gorunumlerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);// [Miami]


        //Kisa yoldan bir List olusturmak icin asagidaki List.of()methodu kullanilabilir
        List<Character>initials=List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d, k]

        List<Character>letters=List.of('a','c','k','d','k');
        System.out.println(letters);//[a, c, k, d, k]

        // iki Arraylist in birbirine esit olup olmadigini nasil anlariz?
        //equals() methodu ayni elemanlar ayni index te oldugu surece true verir
       boolean r1=initials.equals(letters);
        System.out.println(r1);//false

        //indexOf('k') yazarsaniz 'k' nin ilk gorunumunun index'ini verir
        int r2 = initials.indexOf('k');
        System.out.println(r2);//1

        //lastIndexOf('k') yazarsaniz 'k' nin son gorunumunun index'ini verir
        int r3 = initials.lastIndexOf('k');
        System.out.println(r3);//4

        //Example 1: Bir listteki tekrarsiz elemanlari console'a yazdiran kodu yaziniz
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for(Double w : prices){
            if(prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.print(w + " ");//3.75 4.0
            }
        }
        System.out.println();

        //Example 2: Bir list'te tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Double> heights = List.of(2.5, 2.5);

        int counter = 0;
        for(Double w : heights){

            if(heights.indexOf(w) != heights.lastIndexOf(w)){
                counter++;
            }

        }

        if(counter==0){
            System.out.println("All elements are unique in the list");//"Listedeki tüm öğeler benzersizdir"
        }else{
            System.out.println("At least one element is not unique in the list");//"En az bir öğe listede benzersiz değil"

        }

    }
}
