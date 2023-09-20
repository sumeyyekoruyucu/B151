package practices.day_01_practice;

import java.util.Scanner;

public class C07_IfElse {

    public static void main(String[] args) {

        // kullanicinin ayri ayri sisteme iki sayi girmesini isteyiniz
        // ilk



        Scanner scan=new Scanner(System.in);


        System.out.println("Lutfen Ilk Sayiyi Giriniz");
        int ilkSayi= scan.nextInt();


        System.out.println("Lutfen Ikinci Sayiyi Giriniz");

        int ikinciSayi= scan.nextInt();


        if(ilkSayi>ikinciSayi){
            System.out.println("Ilk Sayi Ikinci Sayidan buyuktur");

        } else{
            System.out.println("Ilk Sayi Ikinci Sayidan buyuk degildir");
        }







    }







}
