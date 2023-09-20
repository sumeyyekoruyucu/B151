package javaders.day07stringmanipulations;

import java.util.SplittableRandom;

public class C02_StringManipulations {

    public static void main(String[] args) {


        //*****************replaceAll()*********************\\

        /*
        replaceAll() Bir grup datayi degistirmek icin kullanilir
                     Bir grup data= Regular Expression (Regex) kullanilir


        En cok kullanilan Regexler:

        1) Tum Rakamlar ==> [0-9]
        2) Tum Kucuk Harfler ==> [a-z]
        3) Tum Buyuk Harfler ==> [A-Z]
        4) Tum Harfler ==> [a-zA-Z]
        5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
        6) Tum Sesli Harfler ==> [aeiouAEIOU]
        7) Tum Noktalama Isaretleri ==> \\p{Punct}

         */
        String s = "Mehmet 20 yasinda QA_Developer kursunda $ dolar kazanmistir...";
        //Ex s string indeki tum rakamlari "*" ceviriniz

        String s1 = s.replaceAll("[0-9]","*");
        System.out.println("s1 = " + s1);

        //Ex s string indeki tum harfleri ve tüm rakamlari "@" ceviriniz

        String s2 = s.replaceAll("[a-zA-Z0-9]", "@");
        System.out.println("s2 = " + s2);

        // Ex : s String'indeki tum spaceler disindaki karakterleri "+" ceviriniz

        String s3= s.replaceAll("[^ ]", "*");
        System.out.println("s3 = " + s3);


        // Ex: s Sring'indeki tum kucuk harfler disindaki karakterleri "*" ceviriniz


        String s4= s.replaceAll("[^a-z]","*");
        System.out.println("s4 = " + s4);

        // Ex: s Sring'indeki tum sesli harfler disindaki karakterleri "&" ceviriniz

        String s5= s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("s5 = " + s5);



















    }









}
