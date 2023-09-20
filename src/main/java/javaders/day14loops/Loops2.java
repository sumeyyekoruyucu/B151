package javaders.day14loops;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        // 3 den 8 e kadar tum tam sayilari console a yazdiran kodu yaziniz

        //1.way:

        for(int i=3; i<9; i++){
            System.out.print(i + " ");

        }
        System.out.println();
        //2.way
        int i=3;
        while(i<9){
            System.out.print(i + " ");
            i++;

        }
        System.out.println();
        // for la while ayni sey..for daha teknik,ezber while daha sade anlasilir.while daha iyi
        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari yazdiriniz
        //1.Way:
        for(int k=21; k<181; k++){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }
        System.out.println();
        //2.Way:
        int k=21;

        while(k<181){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
            k++;
        }

        System.out.println();


        //Size verilen kucuk harfle yazilmis Stringin indexi cift olan characterlerini
        // buyuk harfe donusturunuz
        //miami
        String s="miami";
        int m=0;
        while(m<s.length()){
        String ch = s.substring(m,m+1);

        if (m%2==0){
            System.out.print(ch.toUpperCase());
        }else{
            System.out.print(ch);
        }
        m++;

        }
        System.out.println();
        //size verilen tamsayinin rakamlari toplamini console a yazdiriniz
        int r=578; //r=r.Math.abs(r) negatifler icin de gecerli yapar
        int sum=0;
        while(r>0){
            sum=sum+r%10;
            r=r/10;
        }
        System.out.println(sum);//sum in en son degerini gormek istiyosak while disina yazariz
        // diger turlu butun adimlari yazdirir. sum in butun degerlerini




        //kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz
        //3x1=3  3x2=6 .........3x10=30
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number");
        int n= input.nextInt();
        int u=1;
        while(u<11){
            System.out.println(n + "x" + u + "=" + (n*u));

            u++;
        }

        //Kullanicidan aldiginiz String deki sessiz harfleri console a yazdiran kodu yaziniz

        System.out.println("Please enter a word");
        String y=input.next();
        int z=0;
        while(z<y.length()){
            char ch = y.charAt(z);
            boolean x=ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ||ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U';
            if (!x){
                System.out.print(ch);

            }
            z++;

        }
        /*
          if (x){
                z++;
                continue;
            }else{
                System.out.print(ch);
            }
            z++;

        }
         */





















    }
}
