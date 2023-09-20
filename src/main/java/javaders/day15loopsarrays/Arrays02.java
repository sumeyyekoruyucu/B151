package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    /*
    1)Application larda "data" ile datalari isleyen kod'lar(logic) birbirinden ayrilir.
    Yani; logic data ya bagimli olmamali, (bagli tabiki ama bagimli degil,olmamali)
    dataya bagimli olarak yazilan code lara "hard code" denir
    "hard code" hatali kod demektir.
     */
    public static void main(String[] args) {

        // Array leri kisa yoldan nasil olusturabiliriz
        int grades[]= {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));

        //Ex 1:  grades Array indeki en kucuk ve en buyuk grade in toplamini ekrana yazdiran kodu yazdiriniz
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));//sort sirala demek//[34, 67, 76, 98, 100]
        System.out.println(grades[0]+grades[grades.length-1]);//134

        //Ex dan ustteki data kismi alttaki logic kismi.
        // hard kod bir degisiklik yaptiginda calismaz
        // yukari length-1 yerine 4 yazsak hard kod olur degisiklikte kirilir

        //Ex 2: Size verilen bir String Array deki isimlerden 5 characterden
        // az character icerenleri console yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames){
            if (w.length()<5){
                System.out.println(w);
        }

        }
        System.out.println();
        //Ex 3: Size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimlerden onceki isimleri console a yazdiriniz

        Arrays.sort(stdNames);//sort sayilari kucukten buyuge,Stringleri alfabetik siraya gore siralar

        for (String w: stdNames){
            if (w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }
        System.out.println();
        // Ex 4: Ex 3: Size verilen bir String Array deki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimlerden onceki isimleri ve "F" ile baslayanlari yazdiriniz

        Arrays.sort(stdNames);//sort sayilari kucukten buyuge(ascending),
        // Stringleri ise alfabetik siraya gore(alphabetically) siralar
        //ascending  ve  alphabetically==> Natural order (ilk akla gelen siralamadir. ör:kucukten buyuge )

        for (String w: stdNames){
            System.out.println(w);
            if (w.startsWith("F")){
                break;
            }

        }// yukardakinden farki filizi de yazdirdi

        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz

        System.out.println();

       /* Arrays.sort(stdNames);//sort sayilari kucukten buyuge,Stringleri alfabetik siraya gore siralar

        for (String w: stdNames) {

            if (!w.startsWith("F")) {
                System.out.println(w);

            }

        } */
        Arrays.sort(stdNames);// bunu daha once yazdik ama usttekileri silince bu calissin diye tekrar yaziyoruz
        for (String w: stdNames){

            if (w.startsWith("F")){
                continue;   //bosver bunu yazma basa don demek.specific seylerde continue kullan
            }else{
                System.out.println(w);
            }

            }


    }
}
