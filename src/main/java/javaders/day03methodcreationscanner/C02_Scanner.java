package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz 4 basamakli bir sayinin ilk ve son rakaminin toplamini
        // ekrana yazdiran kodu yaziniz

        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen dort basamakli bir sayi giriniz...");

        int sayi= input.nextInt();

        int sonRakam=sayi%10; // % sayinin 10 a bolumundan kalan(son rakam)

        sayi=sayi/1000; // tam kismi alir(sayinin ilk rakami)

        System.out.println(sayi+sonRakam);

        // asagidaki gibi de yapabiliriz ama yazdirma da toplama kismini parantez icine almak zorundayiz
        // yoksa string olarak algilar

       /* int sonRakam = sayi%10;//9
        int ilkRakam = sayi/1000;//8
        System.out.println("IlkRakam+ sonRakam = "+(ilkRakam+sonRakam));
        veya
        int toplam = sayi%10+ sayi/1000;
        System.out.println("toplam = " + toplam);    */

















    }
}
