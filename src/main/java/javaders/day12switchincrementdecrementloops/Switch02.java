package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02 {
    /*
       kullanicidan aldiginiz karakterin sesli harf olup olmadigini kontrol eden kodu yaziniz
     sesli harfler: a-e-i-o-u
        */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Harf Giriniz");
        char harf = input.next().charAt(0);
        //1.Way

        switch (harf) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("sesli harftir");
                break;
            default:
                System.out.println("sesli harf degildir");

        }
        //2.way
        System.out.println("Please enter a letter");
        String letter = input.next().substring(0, 1).toLowerCase();
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");

        }
        //3.way
        System.out.println("Please enter a letter");
        String letter2 = input.next().substring(0, 1);
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter2 + "is a vowel");
                break;
            default:
                System.out.println(letter2 + "It is not a vowel");
                //kisa kod 2. deki makbuldur ama dinamik degildir .
                // 3 de dinamik olur a sesli mi dersin a sesli der.
                // bizden dinamik istiyorsa 3.yu kullanmaliyiz.
                //1. de de uygulayabiliriz
                // 2.de olmaz biz buyuk A gireriz konsolda kucuk a cikar tulower yaptigimiz icin

        }
    }
}