package javaders.day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
    java da method nasil olusturulur?

    1) main methodun disinda olusturulur ama classin icinde
    2)Access Modifier + Return Type + Method Ismi + () + {}


    Olusturulan methodlar nasil kullanilir?
    1)main method un icinden kullanilir
    2)method un ismi + () yazin
    3)islem yapacaniz parametreleri parantez icersinde koyun
    */
    public static void main(String[] args) {

        int sonuc = toplamaYap (3, 5);
        System.out.println(sonuc);


        long carpmaSonuc = multiply(3,6);
        System.out.println(carpmaSonuc);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2,3,4);
        System.out.println(ucluSonuc);


        System.out.println(getCube(3));

        print ("Hello world");



    }

    // Ornek1: toplama islemi yapan bir method olusturnuz
    //main method static oldugu icin main method icersinde kullanacimizi hersey static olamidir
    public static int toplamaYap (int a, int b) {
       return a+b;
    }


    //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz
    protected static long multiply(int a, int b){
        return a*b;
    }


    //Ornek3: Verilen 3 sayidan ilk ikisini carpan ve sonucu cunucu sayi ile toplayan methodu olusturnuz.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
           return a * b + c;
    }


    //Ornek 4: VErilen bir ondalik sayinin kupunu hesaplayan mehodu olusturup kullaniniz
    // NOTE: ACCESS MODIFIER I default YAPMAK icin access modifier YAZMAYINIZ
    static double getCube(double a) {
        return a*a*a;
    }

    // ORNEK girilen bir kelimeyi ekrana yazdiran bir method olusturunuz.

    public static void print (String ahmet ) {
        System.out.println(ahmet);
    }

    // eger bir method yeni bir data uretmiyor ise returntype i void olur.

    // shift ve f10 ayni anda basilirsa direk yazdirir.














}
