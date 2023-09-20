package practices.day_04_IfElse;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // EX: kullanicidan aldiginiz bir karakter ile asagidaki sekli olusturan kodu yaziniz

       /*
             A   // 2 space +a+2 space
            A A  //1 space+a+1 spaca+a+1 space
           A A A //a+1 space+a+1 space+a
    */


        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen bir karakter veriniz...");

        char a= input.next().charAt(0);


            System.out.println("  " + a + "  ");
            System.out.println(" " + a +" "+ a + " ");
            System.out.println(a+" "+a+" "+a);


       //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran basit bir hesap makinesi kodunu yaziniz
        System.out.println("Lutfen 2 sayi giriniz");// tek tek de girdirebilirsin
        int s1=input.nextInt();
        int s2=input.nextInt();
        System.out.println(s1+s2);
        System.out.println(s1-s2);
        System.out.println(s1*s2);
        System.out.println(s1/s2);
        System.out.println(s1+"+" + s2+ "=" + (s1+s2));

        // ex: kullanicidan alacaginiz 5 basamakli bir sayinin
        // ilk iki ve son iki rakamlari toplamini bulan kodu yaziniz

        System.out.println("Lutfen bes basamakli bir sayi giriniz");
        int sayi=input.nextInt();
        int ilkbas=sayi/10000;
        int ikincibas=sayi/1000%10;
        int dorduncubas=sayi/10%10;
        int sonbas=sayi%10;
        System.out.println(ilkbas+ikincibas+dorduncubas+sonbas);//12 benim cozumum

        int sayilarintop=sayi%10+sayi/10%10+sayi/1000%10+sayi/10000;
        System.out.println(sayilarintop);


    }
}
