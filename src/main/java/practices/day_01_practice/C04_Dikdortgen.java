package practices.day_01_practice;

import java.util.Scanner;

public class C04_Dikdortgen {

    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz


        Scanner scan=new Scanner(System.in);


        System.out.println("Lütfen dikdortgenin a kenar uzunlugunu giriniz" );

        int a= scan.nextInt();


        System.out.println("Lütfen dikdortgenin b kenar uzunlugunu giriniz" );

        int b=scan.nextInt();

        int cevre=2*(a+b);

        System.out.println("cevre = " + cevre);

        // System.out.println("Dikdortgenin cevresi = " + (2*(a+b)));









    }
}
