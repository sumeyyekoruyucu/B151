package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

            /*

            Kullanicidan data almak icin Scanner Classi kullanilir.Ve bir input/ scan/ scanner Objesi olusturulur
            .Bu objeyi new objeyi new key worduyle olustururuz

         */
        // 1 )Adim Object Olusturma
        Scanner input = new Scanner(System.in);//Tolgahan

        //2 ) Kullaniciya ne yapacagini soyluyoruz
        System.out.println("Lutfen maasinizi giriniz");

        // 3 ) Adim kullanicidan alinan datalar yapisina ve
        // buyuklugune gore bir Variable'a yerlestirilir
        long maas = input.nextLong();

        // kullanici verdigi bilgileri teyit edebilmesi vs icin yazdiriyoruz


        System.out.println("maas = " + maas);

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini , soran bir program yaziniz


        System.out.println("lutfen cinsiyetinizi kadin ise K erkek ise E olarak giriniz" );

        char cinsiyet=input.next().charAt(0);// erkek
        System.out.println("cinsiyet = " + cinsiyet);

        System.out.println("Lutfen adinizi giriniz");

        // String isim=input.next(); // sadece tolgahan goruruz
        // String name=input.nextLine(); // tolgahan metehan komple gorunur satir da atlamaz
        input.nextLine();//dummy atildi Satir atlamasi yapmamasi icin

        String name=input.nextLine(); //tolgahan metehan

        System.out.println("name = " + name);


        System.out.println("Lutfen memleketinizi giriniz");
        String memleket=input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy= input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/False seklinde giriniz ");
        boolean seviyorMu=input.nextBoolean();

        System.out.println("*************Tolgahan***********");
        System.out.println("cinsiyet : "+cinsiyet+"\nname : "+name+"\nmemleket : "
                +memleket+"\nyas : "+yas+"\nboy : "+boy+"\nseviyorMu : "+seviyorMu);




































    }



}
