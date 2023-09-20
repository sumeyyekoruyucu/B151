package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {


        // INTERWIEW QUESTIONS USA QA

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz.
        // String y ="abbccdc"  ( bu orjinali bunu kendin coz) //ad



        String y= "aac"; //c Soru cozumu cok uzamamasi icin y bu sekilde alindi.

       char ch = y.charAt(0);
       if(y.indexOf(ch) == y.lastIndexOf(ch)){
           System.out.println(ch);

       }// if body iki curly braces arasi

        char ch1 =y.charAt(1);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 =y.charAt(2);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        // Ex: Verilen sayi pozitif ise ekrana "Sayi Pozitif" yazdiran kodu yaziniz

        int num= 65;
        int num1=-14;

        if(num>0){
            System.out.println("Sayi Pozitif");//yazdirir
        }

        if(num1>0){
            System.out.println("Sayi Pozitif");// yazdirmaz
        }

        // Ex: Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz

        int rakam=33;
        if (rakam>-1 && rakam<10 ){
            System.out.println("Verilen Data Rakamdir");
        }
        System.out.println("**********************");

        int rakam2=5;
        if (rakam2>-1 && rakam2<10 ){
            System.out.println("Verilen Data Rakamdir");
        }

        // Ex: Sayi 3 basamakli ise "Verilan Data 3 Basanaklidir" yazdiran kodu yaziniz

        int sayi= -100;

        sayi = Math.abs(sayi);// method mutlak deger alir
        if (sayi>99 && sayi<1000){
            System.out.println("Verilan Data 3 Basanaklidir"); // yazdirdi
        }
        System.out.println("************");

        int sayi2= 99;
        sayi2 = Math.abs(sayi2);// method mutlak deger alir
        if (sayi2>99 && sayi2<1000) {
            System.out.println("Verilan Data 3 Basanaklidir");
        } // yazdirmadi









    }
}
