package javaders.day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz. kendimize veya baskasina aciklamadir.
        /*
        java bu satiri okumaz
         */


        //Variable olusturma
        //data type + variable name + atama operatoru + data + noktali virgul
            int            age             =             13        ;

            //java cümlesi ==>Statement
        //Data type + Variable Name ==> Variable Decleration
        //Assignment Operator (atama operatoru) + Variable degeri ==> Assignment
        //Eger variable Decleration yapar, assignment yapmazsaniz Java kendi degerlerini (default) koyar
        //Default degerler sayilar icin sifirdir.
        //Dilbilgisindeki nokta ne ise java daki nokatli virgul ayni seydir. ve statementin bittigini gosterir
        //javada esittir demek"==". Yani Matematik te "=", javada da "=="

        /*
            Java da temelde iki tip data vardir.
            1)primitive data type:
               char,boolean, byte,short,int,long, float, double,
            2)non-primitive data type:
               String
         */


        //Ornek1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Stringlere verilen degerler daima cift tirnak icinde olmailidir.

        String studentName = "Ali Can" ;

        //String bir variable olusturup ona her hangi bir atama yapmassak yava o varaible a
        //default olarak "null" koyar.
        //null demek 0 demek degil, 0 da coding te bir degerdir
        //null demek iki bos obje demektir.
        //yani icinde variable veya method bulunmayan default obje demektir.
        // {}

        //char data type:
        //Tek karakter icin kullanilir. ornegin ==> A, x, ?, 5,
        //Ornek2: char data typinda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Note: char data typeinda degerleri tek tirnak icersinde konulmalidir.
        char isminIlkHarfi = 'A' ;

        //boolean data type:
        //boolean´lar sadece iki farkli deger alanbilir; true yada fault
        //Ornek3: boolean data typeda emeklimisin icin variable olusturun ve false degerini atayin

        boolean emeklimisin = false ;

        //byte data type:
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 ye kadar tamsayi degerleri icin kullanilir
        //Ornek4: byte data typeinda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        byte studentAge = 33 ;

        // short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tam sayilar icin kullanilir.
        //Ornek5: site nufusu icin bir variable olusuturn ve deger atayiniz

        short siteNufusu = 33 ;

        // int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 6 : Ulke nufusu icin bir variable olusturun ve deger atamasi yaopin

        int ulkeNufusu = 33 ;
        int countryPopulation = 33 ;

        //Long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile + 9, 223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek7: insan vucudundaki hcure sayisi icin variable olusturp deger atamasi yapin.
        //Note: Bir deger long ise sonuna büyük "L" veya kücük "l" konulur.

        long insanHucre = 33 ;
        long cellNumberInHumanBody = 3333333333L ;

        //Eger longa atadiniz deger intlerin araliginda ise sonuna "L" koymaya gerek yok
        //Long dememize ragmen somnuna L koymazsak eger int araliginda ise java onu int kabul eder.

        long weightOfSun = 133434346463L;


        //float data type:
        // float data tipi virgullu sayilar icindir (Ondalikli sayilar ==>Decimal sayilar) icin kullanilabilir.
        //float hafizada 4 byte yer kaplar
        //Note: java ondalikli sayilari yani "Decimal Numbers"i otomatik olarak double kabul eder
        //eger float data typei olmasinda israr ederseniz sonuna büyük"F" yada kücük"f" koyamlisniz

        //ornegin fiyatlandirmalar icin tercih edlebilir(12.99)
        //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;

        System.out.println(shirtPrice + shoesPrice );
        //System.out.println(); yazdirmanin kisa yolu sout. SOut yaz ve entere bas


        int a = 12;
        int b = 13;
        System.out.println(a);
        System.out.println(b);


        //System.out.println(); ekranan yazdirir ve pointer i bir sonraki satira koyar
        //System.out.print(); ekranan yazdirir ve pointer i ayni satirda tutar



        // double data type:
        // data tipi virgullu sayilar icin kullanilir(ondalikli sayilar==>DEcimal Numbers icin kullanilir
        //double hafizada daha fazla(8byte) yer kaplar, virgulden sonraki rakam daha fazla alir
        //Ornek 9: Hucre agirligi ve amipin agirligi icin iki tane variable olusturunuz ve agirilklari farkini conosla yazdiriniz.


        double weightCell = 0.00000000000033;
        double weightAmip = 0.00000000000034;

        System.out.println(weightCell - weightAmip);
















    }


}
