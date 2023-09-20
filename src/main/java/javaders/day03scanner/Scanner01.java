package javaders.day03scanner;


//Java nin util kutuphanesi scanner class import edildi demektir
import java.util.Scanner;


public class Scanner01 {

    public static void main(String[] args) {

        //1.adim: Scanner class da bir Obje olustur

    Scanner input = new Scanner(System.in);
    //Obje ismini input yapdik cunku bu Object kullanicida alinan datayai benim kodalrimin icine koyacak


    //2.adim: kullaniciya ne istedinize dair mesaj veriniz.
        System.out.println("lutfen yasinizi giriniz...");


    //3.adim: UYgun method u kullanarak kullanicinin verdigi datayi memoriye yerlestiriniz
       byte age = input.nextByte();
        System.out.println(age);








    }


}
