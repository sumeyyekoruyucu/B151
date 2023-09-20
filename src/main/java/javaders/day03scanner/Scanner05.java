package javaders.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan nir dikdörtgenin iki kenar uzunlugunu aliniz
        //1) Alanini hedsaplayiniz ==> kisa kenar * uzun kenar
        //2)cevresini hesaplayniz ==> 2*kisa kenar + 2* uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz..");
        double shortSide = input.nextDouble();

        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longSide = input.nextDouble();

        System.out.println("Alan = "+(shortSide * longSide));
        System.out.println("Cevre = " +(2*shortSide + 2*longSide));

        // double alan = shortSide* longSide yapip alan da yazdirabiliriz sout v ile

        double alan = shortSide* longSide;
        System.out.println("alan = " + alan);// tavsiye edilen


    }







}
