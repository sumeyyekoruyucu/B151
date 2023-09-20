package smallStudyGroup.forLoop1;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
        /*Soru 7) Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
         1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3'un kati ise sayi yerine "Java" yazdirin.
- Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
- Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<100&&sayi>0){
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0&&i%5==0){
                    System.out.print("Java Guzeldir , ");
                } else if (i%5==0) {
                    System.out.print("Guzeldir * ");
                }else if (i%3==0){
                    System.out.print("Java ! ");
                }else System.out.print(i+" ");

            }

        }else System.out.println("lutfen 100den kucuk ve 0dan buyuk bir sayi giriniz");

    }
}
