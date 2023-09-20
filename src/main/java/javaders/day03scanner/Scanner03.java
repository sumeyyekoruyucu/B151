package javaders.day03scanner;


import java.util.Scanner;

public class Scanner03 {

    //Kullanicidan adressinil aliniz ve ekrana yazdiriniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Lutfen adressinizi giriniz....");

        //next() methodu kullanicidan tek kelimeli String i almak icin kullanilir.
        //nextLine() methodu ise kullanicidan cok kelimeli Stringe almak icin kullanilir.

        String adress = input.nextLine();

        System.out.println(adress);













    }







}
