package practices.day_11_practiceInstanceStatic;

public class C01_Instance {

     /*
    sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım
*/

    int sayi;
    String isim;
    boolean ogrenciMi;


    public static void main(String[] args) {


        C01_Instance c1=new C01_Instance();

        //yazdirmak icin c1.sayi.sout,asagidaki formata geliyor.

        System.out.println(c1.sayi);//0
        System.out.println(c1.isim);//null
        System.out.println(c1.ogrenciMi);//false

        C01_Instance c2=new C01_Instance();

        c1.isim="Hasan";
        c2.isim="Huseyin";

        System.out.println(c1.isim);//Hasan
        System.out.println(c2.isim);//Huseyin

        c1.sayi=20;
        c2.sayi=25;

        System.out.println(c2.sayi);//25
        System.out.println(c1.sayi);//20

        //instance variable'lar objeye baglıdır
        // hangi obje uzerinden degisiklik yapıldıysa, yapılan bu degisiklik sadece o objeyi baglar






























    }



























}
