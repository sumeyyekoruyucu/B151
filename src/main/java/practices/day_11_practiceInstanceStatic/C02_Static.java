package practices.day_11_practiceInstanceStatic;

public class C02_Static {

      /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/
    //Static variable lar da main disinda olusturulur,icinde yazdirilir

    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {

        //static old icin  cagirirken isim yeterli obje olusturmaya gerek yok.
        //static variable lara class icerisindeki tum methodlardan  direk ulasilabilir.
        //baska class tan class ismiyle ulasabiliriz.

        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(okulNo);//0
        System.out.println(okulAcikMi);//false

        ///////////////////////////////////////////////////////777

        //Static variable lar gokteki ay gibidir. Bir yerde degistirilirse her yerden bu degisen deger gorunur
        //static variable lar class a baglidir.
        // en son kim tarafindan degistirilirse o olur
        okulNo=102;
        System.out.println(okulNo);//102

        staticMethod(); //method icin yazip create ettik

        System.out.println(okulNo);//200 ==> method icinde degistirdik ama olsun en son ne yaptiysak o okunur.
    }

       public static void staticMethod() {

        okulNo=200;
        System.out.println(okulNo);//200


    }
}
