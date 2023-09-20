package practices.day_06_practicesSwitchLoops;

import java.util.Scanner;

public class C04_For_Agac {
    public static void main(String[] args) {
           /*
         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.
         Asagıdaki agac seklini konsala yazdırınız
        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yaprak satir sayisini giriniz");
        int yss=scan.nextInt();
        System.out.println("Lutfen govde satir sayisini giriniz");
        int gss=scan.nextInt();

        String y="";

        for (int i=0  ; i<yss ; i++){
            y=y+ "^";
            System.out.println(y);
        }


        for (int i=0 ; i<gss; i++){
            System.out.println("|||");
        }



















    }
}
