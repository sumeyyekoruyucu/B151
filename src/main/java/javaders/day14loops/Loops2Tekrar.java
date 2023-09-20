package javaders.day14loops;

import com.sun.jdi.IntegerValue;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Loops2Tekrar {
    public static void main(String[] args) {
        // hepsini while loop ile yap
        // 3 den 8 e kadar tum tam sayilari console a yazdiran kodu yaziniz.while loop la yap
        int i=3;
        while(i<9){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari yazdiriniz..while loop la yap

        int r=21;
        while(r<181){
            if (r%4==0 && r%6==0){
                System.out.print(r+" ");
            }
            r++;
        }
        System.out.println();
        //Size verilen kucuk harfle yazilmis Stringin indexi cift olan characterlerini
        // buyuk harfe donusturunuz. while ile
        //miami
        String s="miami";
        int k=0;
        while (k<s.length()){
          String a=s.substring(k,k+1);
            if (k%2==0){
                System.out.print(a.toUpperCase());
            }else
                System.out.print(a.toLowerCase());
            k++;
        }

        System.out.println();
        ////size verilen tamsayinin rakamlari toplamini console a yazdiriniz
        String t="-4567";
        int m=0;
        int toplam=0;
        while(m<t.length()){
            String c=t.substring(m,m+1);
            toplam=toplam+ Integer.valueOf(c);

            m++;
        }
        System.out.println(toplam);
        /*
           int r=578; //r=r.Math.abs(r) negatifler icin de gecerli yapar
        int sum=0;
        while(r>0){
            sum=sum+r%10;
            r=r/10;
        }
        System.out.println(sum);//sum in en son degerini gormek istiyosak while disina yazariz
        // diger turlu butun adimlari yazdirir. sum in butun degerlerini

         */



        //kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        //3x1=3  3x2=6 .........3x10=30

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=input.nextInt();
        int n=1;
        while(n<11){
            System.out.println(sayi + "x" + n + "=" +(sayi*n));
            n++;
        }

        //Kullanicidan aldiginiz String deki sessiz harfleri console a yazdiran kodu yaziniz(-)

        System.out.println("Lutfen bir kelime giriniz");
        String word=input.next();
        int l=0;
        while(l<word.length()){
            char ch =word.charAt(l);
            boolean b=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
            if (!b){

                System.out.print(ch);

            }
            l++;
        }

    }
}
