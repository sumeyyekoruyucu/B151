package javaders.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    //Kullanicidan ilk ismini ve soy ismini alip ikisnini ayni satirda ekrana yazdiriniz.
    public static void main(String[] args) {


        //1Adim: Scanner classdan Obje olsutur.
        Scanner input = new Scanner(System.in);

        //2.Adim: Kullaniciya ne istedinizi dair mesj verin.

        System.out.println("ilk isminizi giriniz...");
        String firstName = input.next();

        System.out.println("Soy isminizi girin....");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);









    }



















}
