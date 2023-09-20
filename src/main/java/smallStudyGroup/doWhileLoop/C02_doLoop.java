package smallStudyGroup.doWhileLoop;

import java.util.Scanner;

public class C02_doLoop {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alip
        //do  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int counter=1;
        if (sayi>0) {
            do {
                System.out.print(counter+" ");
                counter++;
            } while (counter < sayi);
        }else System.out.println("lutfen pozitif olan bir sayi giriniz");

        for (int i = 1; i < sayi; i++) {
            System.out.println(i+" ");
        }


    }
}
