package javaders.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        // Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner ( System.in);

        System.out.println(" Lutfen 5 basamakli bir sayi giriniz...");

        int number = input.nextInt();

        //Bir sayinin sonm rakamini alabilmek icin o sayiyi 10a bolup kalani almaliyiz
        //%==> modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        //dolaysiyla %10 her zaman bize birler basmayinda bulunan saiyi verir
        //bir tam sayiyiya bolerseniz java sonucu kesinlikle tam sayi yapar
        //java bu durumda yuvarlama yapmaz ondalikli kismi iptal eder
        //dolaysyial bir tam sayiyi 10 a bolersek birler basamayini silmis oluruz


        //son rakami al
        int lastDigit = number%10;
        //sayi kuculu
        number = number/10;


        //sondan ikinci rakam al
        int lastSecondDigit = number%10;
        //sayi kucult
        number = number/10;


        //sondan ucuncu rakami al
        int lastthurdDigit = number%10;

        //sayi kucult
        number = number/10;


        //sondan dorduncu rakami al

        int lastFourthDigit = number%10;
        //sayi kucult

        number = number/10;



        //sondan besinci rakai al
        int lastFifthDigit = number%10;
        //sayi kucult

        number = number/10;


        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);










    }
}
