package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01Tekrar {
    public static void main(String[] args) {
        //Example 1: stdNames array indeki her ismin sonuna yildiz koyarak cansole a yazdir(bi tik kopya)
        // String stdNames[]=new String[5];

        String stdNames[]=new String[5];
        stdNames[0]="cihan";
        stdNames[1]="kerime";
        stdNames[2]="turan";
        stdNames[3]="sumeyye";
        stdNames[4]="yigit";
        for (String w:stdNames){
            System.out.println(w+"*");
        }


        // ex 2: Bir integer Array olusturunuz, 5 eleman ekleyiniz elemanlarin toplamini bulup console a yazdiriniz

        int not[]=new int[5];
        not[0]=41;
        not[1]=14;
        not[2]=33;
        not[3]=59;
        not[4]=6;
        int toplam=0;
        for (int w:not){
            toplam=toplam+w;

        } System.out.println(toplam);

        System.out.println(Arrays.toString(not));
        System.out.println(not[3]);
        System.out.println(stdNames[4]);

        //Example 3: Bir char Array olusturunuz 3 eleman ekleyiniz bu elemanlarin carpimini yazdiriniz

        char s[]=new char[3];
        s[0]='d';//100
        s[1]='P';//80
        s[2]='Z';//90
        int carpim=1;
        for (int w:s){
            carpim=carpim*w;
        }
        System.out.println(carpim);

    }
}
