package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        int i=1;
        while(i<1){//while loopda loop body sinin
            // hic calismamasi mumkundur (zero execution is possible)
            // kuralda hata varsa 1<1 hatali once kurala bakar sonra true ise yazdirir
            System.out.println("while loop");
            i++;
        }

        //do-while-loop
        int k=1;
        do{//do-while-loop ta lopp body si en az bir kere calisir
            System.out.println("do-while-loop");
            k++;
        }while(k<1);

        // do-while hata da olsa (1<1) yazdirir cunku once calistirir sonra kontrol eder
        // Kullanici bir sayi girsin,sayi 100 den kucuk ise kullanici kazandiniz mesaji alsin
        // diger durumlarda kaybettiniz mesaji alsin

        Scanner input=new Scanner(System.in);


        do{
            System.out.println("Please enter an Integer");
            int n=input.nextInt();
            if (n<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");
                break;
            }

        }while(true);//infinitiv loop sonsuz loop kullanici 100 den kucuk girdigi surece
        // sonsuza kadar calissin

        // kullanicidan alinan bir kelimenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz


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





















    }
}
