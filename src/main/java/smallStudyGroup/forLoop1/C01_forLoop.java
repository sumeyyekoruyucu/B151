package smallStudyGroup.forLoop1;

import java.util.Scanner;

public class C01_forLoop {
    public static void main(String[] args) {
             /*
           Soru 6) Kullanicidan 100'den kucuk bir tamsayi isteyin.
           1'den baslayarak girilen sayiya kadar 3'un veya 5"in kati olan sayilari yazdirin.
            */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi<100&&sayi>0){
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0||i%5==0)
                    System.out.print(i+" ");

            }

        }else System.out.println("lutfen 100den kucuk ve 0dan buyuk bir sayi giriniz");

    }
}
