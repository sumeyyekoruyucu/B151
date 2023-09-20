package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    /*
    Javada method nasil olusturulur?

            1) Javada method main'in disinda olusturulur
            2) tekrar tekra kullanmamiz gerekiyorsa method olustururuz
    Access Modifier  +  Return Type + methodIsmi  + ( ) + { }
    islem yapilacak olan sayilari methodIsmi () parantezin icine eklenir
    Scope == Kapsam Alani bir variable'in  bir degerin,
     hangi alanda kapsam icinde oldugunu gosterir

 */

    public static void main(String[] args) {

        // 1) Verilen iki sayiyi toplayan methodu olusturunuz
        add(30,87);
        //toplama yap yazip ustune mausu gotursekte olur.
        // more actions sonra create method ile baslayani sec

        // 2) verilen 2 sayiyi carpan methodu yaziniz
        multiply(46,12);


        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        firstTwoMultiplyThirdAdd(2,3,5);

        // 4) Verilen bir ondalikli sayinin kupunu hesaplayip kullandiran bir method olusturunuz

        double sayininKupu =getCube(5.6);
        System.out.println("sayininKupu = " + sayininKupu);

        //5) Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        
        cemberinCevresi(5);
        daireninCevresi(2);


        System.out.println("cemberinCevresi = " + cemberinCevresi(5));
        System.out.println("daireninCevresi(2) = " + daireninCevresi(2));

    }

    private static double daireninCevresi(int r2) {
        return 2*3.14*r2;
    }

    private static int cemberinCevresi(int r) {
        return 2*314*r/100;//(3,14 yapmak istersen return type i double sec )
    }


    static double getCube(double v) {
        return v*v*v;
    }

    public static void firstTwoMultiplyThirdAdd(int a, int b, int c) {
        System.out.println(a*b+c);// return a*b+c de yazabilirsin
        // void i degistirip örnegin:int yaparsan isleme
        // sonradan ekleme yapabilirsin

        /* public static int firstTwoMultiplyThirdAdd(int a, int b, int c)
        {return a*b+c;}
        System.out.println(firstTwoMultiplyThirdAdd(2, 3, 5)/10);
        yazdirma main icinde olsun
         */

    }


    private static void multiply(int a, int b) {
        System.out.println(a*b);//("carpma="+ a*b) yazarsak aciklamasi da olur
    }

    static void add(int a, int b) {
        // Access modifiers default oldugu icin bir sey yazilmadi
        System.out.println(a+b);





    }


}
