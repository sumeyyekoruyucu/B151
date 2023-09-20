package sümeyye;

import java.sql.SQLOutput;

public class OdevIfStatement {
    public static void main(String[] args) {


    // INTERWIEW QUESTIONS USA QA

    // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz.(-)
    // String y ="abbccdc"  ( bu orjinali bunu kendin coz)//ad

        String y="abbccdc";
        char ch=y.charAt(0);
       if (y.indexOf(ch)==y.lastIndexOf(ch) ){
           System.out.print(ch);
       }
        char ch1=y.charAt(1);
        if (y.indexOf(ch1)==y.lastIndexOf(ch1) ){
            System.out.print(ch1);
        }
        char ch2=y.charAt(2);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2) ){
            System.out.print(ch2);
        }
        char ch3=y.charAt(3);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3) ){
            System.out.print(ch3);
        }
        char ch4=y.charAt(4);
        if (y.indexOf(ch4)==y.lastIndexOf(ch4) ){
            System.out.print(ch4);
        }
        char ch5=y.charAt(5);
        if (y.indexOf(ch5)==y.lastIndexOf(ch5) ){
            System.out.print(ch5);
        }
        char ch6=y.charAt(6);
        if (y.indexOf(ch6)==y.lastIndexOf(ch6) ){
            System.out.print(ch6);
        }

        /*
                // INTERWIEW QUESTIONS USA QA

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz.(-)
        // String y ="abbccdc"  ( bu orjinali bunu kendin coz)//ad

        String y="abbccdc";

        for (int i=0; i<y.length(); i++){
            char ch=y.charAt(i);
            if (y.indexOf(ch)==y.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }
         */

        System.out.println();
    // Ex: Verilen sayi pozitif ise ekrana "Sayi Pozitif" yazdiran kodu yaziniz
        int sayi=-154;
        if (sayi>0){
            System.out.println("Sayi Pozitif");
        }else{
            System.out.println("Sayi Pozitif degildir");
        }
    // Ex: Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz
        int a=7;
        if (a>-1 && a<10){
            System.out.println("Verilen Data Rakamdir");
        }else{
            System.out.println("Verilen Data Rakam degildir");
        }
    // Ex: Sayi 3 basamakli ise "Verilan Data 3 Basanaklidir" yazdiran kodu yaziniz
        int s=-114;// Math.abs() de olur bence
        if (s>-1000 && s<-99 || s<1000 && s>99){
            System.out.println("Verilan Data 3 Basanaklidir");
        }else{
            System.out.println("Verilan Data 3 Basanakli degildir");
        }

    // Ex: Verilen bir karakterin buyuk harf ise ekrana
    // "Buyuk Harf " yazdiran kodu yaziniz"

        char d='Z';
        if (d>='A'&& d<='Z'){
            System.out.println("Buyuk Harftir ");
        }else{
            System.out.println("Buyuk Harf degildir");
        }
    // Ex: Verilen sayi cift sayi ise ekrana "Cift Sayi " yazdiran kodu yaziniz
        int g=-16;
        if (g%2==0){
            System.out.println("Cift Sayi");
        }else{
            System.out.println("Cift Sayi Degil");
        }
    // Ex Verilen bir sayi 300'den kucuk veya 1200 'den buyuk
    // ise "Harika Sayi" yazdiran kodu yaziniz

        int h=457;
        if (h<300 || h>1200){
            System.out.println("Harika Sayi");
        }else{
            System.out.println("Harika Sayi degil");
        }
    // Ex : Kullanicidan alinan Datanin Tekmi; CiftMi? oldugunu yazdiran kodu yaziniz
    // Ex : Verilen bir sayinin negatif mi ,
    // pozitif mi , notr mu oldugunu soyleyen kodu yaziniz



    // Kullanici gun ismini girsin kod gunu yazsin
    // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
    // 5== Persembe  6 == Cuma  7 == Cumartesi



       /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
       Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
       Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.
     */


    //Kullanicidan gun isimlerini aliniz, o gunun kacinci gun oldugunu ekrana yazdiriniz
    //Sunday==>1    Monday==>2 ... Saturday==>7






    }
}
