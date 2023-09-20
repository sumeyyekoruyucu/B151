package studentPractice.day01;

import java.util.Scanner;

public class HormonikSeriSorusu {
    // n sayisina kadar olan harmonik seriyi hesaplayan kodu yazalim
    /*
  1. dongu = 0+1/1 =1
  2.dongu = 0+1/1+1/2=1.5
  3.dongu =0+1/1+1/2+1/3= 1.8333333333333333
  4.dongu = 0+1/1+1/2+1/3+1/4 =2.083333333333333

   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n degeri giriniz");
        int n= scan.nextInt();
        double result =0;
        for (int i=1; i<=n; i++){
            result = result +(1.0/i);
        }
        System.out.println(result);
    }
}
