package practices.day_10_practiceLocalDateInstance;

public class C03_Instance {

    //variable olusturma kismini main ustune de, altina da yazabiliriz.

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {

 /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım

*/
        //instance variable lar ;class icinde main disinda olusturulur. static yazmiyo sa instance dir.
        //ama static lerde ayni sekilde main disinda olusturulur.

        C03_Instance obj1=new C03_Instance();

        System.out.println(obj1.sayi);//0
        System.out.println(obj1.bransIsmi);//Java
        System.out.println(obj1.okuldaMi);//false

        //instance variable lar objeye baglidir. hangi obje uzerinden variable da degisiklik yapildiysa,
        // bu degisiklikler sadece o objeyi baglar.

        obj1.sayi=10;
        System.out.println(obj1.sayi);//10

        C03_Instance obj2=new C03_Instance();

        System.out.println(obj2.sayi);//0

        obj1.bransIsmi="SQL";

        System.out.println(obj1.bransIsmi);//SQL
        System.out.println(obj2.bransIsmi);//Java

        obj1.okuldaMi=true;

        System.out.println(obj1.okuldaMi);//true
        System.out.println(obj2.okuldaMi);//false

        obj2.sayi=100;

        System.out.println(obj2.sayi); // 100
        System.out.println(obj1.sayi); //10


        obj2.bransIsmi="API";

        System.out.println(obj2.bransIsmi); // API
        System.out.println(obj1.bransIsmi); // SQL



















    }

















}
