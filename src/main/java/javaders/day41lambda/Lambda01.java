package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));

        System.out.println(getMultiplicationOfSquareOfEvens1(nums));
        System.out.println(getMultiplicationOfSquareOfEvens2(nums));


        System.out.println(getTheSumOfEvenMaxAndOddMin1(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin2(nums));


        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));

    }

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){//lambda expression
        return nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0, (t,u)->t+u);
    }

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums){//method reference
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).//Ihtiyaciniz olan method Java Class'larinda yoksa Utils Class olusturup icinde
                //ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                        reduce(0, Math::addExact);//Class Ismi :: Method Ismi ==> Method Reference
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums){
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce(Math::addExact).
                get();// get() method'u Optional<Integer> i Integer'a cevirir.
    }

    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens1(List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(1, (t,u)->t*u); //147456
    }
    public static int getMultiplicationOfSquareOfEvens2(List<Integer> nums){
        return nums.
                stream().
                filter(Utils::isEven).
                map(Utils::getSquare).
                distinct().
                reduce(Math::multiplyExact).get(); //147456
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
    //           toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin1(List<Integer> nums){
        int maxEven = nums.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u ? t : u).get();
        int minOdd = nums.stream().distinct().filter(t->t%2!=0).reduce((t, u)->t<u ? t : u).get();
        return maxEven + minOdd;
    }
    public static int getTheSumOfEvenMaxAndOddMin2(List<Integer> nums){
        int maxEven = nums.stream().distinct().filter(Utils::isEven).reduce(Math::max).get();
        int minOdd = nums.stream().distinct().filter(Utils::isOdd).reduce(Math::min).get();
        return maxEven + minOdd;
    }
    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile tek sayi olan elemanlarin
    //           8 den buyuk minimum degerinin toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){
        int max = nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t : u).get();
        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t : u).get();
        return max + min;
    }



    /*
    //reduce azaltmak(indirgemek demektir.islemlerde kullanilir.Parantezine ilk etkisiz eleman
    // sonrada parantez icinde harfler->istenen islem)
    //max , min de de kullanilir once iki harf(t,u) > ile kiyasla(t>u ? t : u) buyukse t degilse u
    //sayilar degil Kareler tekrarsiz dedigi icin distinct i map ten (kare hesabindan)sonraya
    //koymamiz gerekir   // tekrarsiz kelimesinin yeri onemli
    //get() apptional<Integer data tipini normal Integer data tipine cevirmek icin kullandik methodda
    //int i degistirsek de olur ama tavsiye edilmez
    //max ,min bulunurken tekrarli sayilara bakmaya gerek yok soruda istemese de distinct() kullaniriz.
    //method reference her zaman daha iyi mecbur kalmadigimiz surece bunu kullaniriz
    //ihtiyacimiz olan method java class da yoksa(or:Math class inda)
    //Utils class i icinde olusturup method reference kullaniniz

 */

}


