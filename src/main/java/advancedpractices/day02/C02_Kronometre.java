package advancedpractices.day02;

import java.util.Scanner;

public class C02_Kronometre {

    /*
      KRONOMETRE  2023/04 QA INTERWIEW
Kullanıcının belirlediği sayıda işlemi gerçekleştiren,
sonunda toplam süreyi ve
ortalama süreyi kullanıcıya gösteren bir kronometre
kodunu yaziniz.
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen kac kez islem yapilacagini giriniz");
        int numTasks=input.nextInt();//numTasks : gorev sayisi

        long startTime=System.currentTimeMillis();//currentTimeMillis(); mili saniye olarak ani verir
        //// Nano saniye daha hassas ama farklilik olsun

        System.out.println("*******************");
        for (int i=0;i<numTasks;i++){
            int numbers[]={1,2,3,4,5};
            int sum=0;
            for (int number:numbers) {
               sum+=number;
            }
            System.out.println("Toplam= " + sum);
            System.out.println("Islem "+ (i+1) + " tamamlandi");
            System.out.println("*********************");
        }
        long endTime=System.currentTimeMillis();
        long islemSuresi=endTime-startTime;
        System.out.println("***************");
        System.out.println("islemSuresi = " + islemSuresi);
        System.out.println("OrtalamaSure : "+ (double)islemSuresi/numTasks + " milisaniye");







    }
}
