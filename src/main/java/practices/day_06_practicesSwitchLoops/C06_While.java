package practices.day_06_practicesSwitchLoops;

import java.util.Scanner;

public class C06_While {
    public static void main(String[] args) {

        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        /*  benim yaptigim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i=sayi ; i<i+10; i++){
            if (i%10==0){
                break;
            }else{
                System.out.print(i+" ");
            }

        }
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int sayi = scan.nextInt();
        while (sayi%10!=0){
            System.out.print(sayi + " ");
            sayi++;
        }


    }
}
