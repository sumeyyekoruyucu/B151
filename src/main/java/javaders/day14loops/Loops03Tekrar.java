package javaders.day14loops;

import java.util.Scanner;

public class Loops03Tekrar {
    public static void main(String[] args) {
        //do-while-loop ile yap
        // Kullanici bir sayi girsin,sayi 100 den kucuk ise kullanici kazandiniz mesaji alsin
        // diger durumlarda kaybettiniz mesaji alsin
        // ( yarim arti islemi tekrarlatmadim .ilk sout ve input u do nun icine koymadim)
        Scanner input=new Scanner(System.in);

        do {
            System.out.println("Lutfen bir sayi giriniz");
            int a=input.nextInt();
            if (a<100){
                System.out.println("Kazandiniz");
            }else{
                System.out.println("Kaybettiniz");
                break;
            }

        }while(true);

        /*
        benim yaptigim
         System.out.println("Lutfen bir sayi giriniz");
            int a=input.nextInt();
             do {
              if (a<100){
                System.out.println("Kazandiniz");
            }else{
                System.out.println("Kaybettiniz");
                break;
            }

        }while(true);
         */

        // kullanicidan alinan bir kelimenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz(-)


          do{
            System.out.println("Please enter a word");
            String s=input.next();
            if (s.endsWith(".")&& (s.charAt(0)>='A'&& s.charAt(0)<='Z')){
                System.out.println("Your word is correct grammatically");
            }else{
                System.out.println("Your word has grammatical mistake");
                break;
            }

        }while(true);


         /* benim yaptigim
         do{
            System.out.println("lutfen bir kelime giriniz");
            String s=input.next();
            if (s.startsWith("[A-Z]" )&& s.endsWith(".")) {

                System.out.println("Kelime buyuk harfle basliyor ve nokta ile bitiyor ");
            }else{
                System.out.println("Kelime yanlis girilmistir");
                break;
            }

            }while(true);
        /*
          */



    }
}
