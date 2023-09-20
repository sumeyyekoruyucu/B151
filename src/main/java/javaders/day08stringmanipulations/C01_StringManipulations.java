package javaders.day08stringmanipulations;

public class C01_StringManipulations {

    //****************** replaceFirst()  ****************//

    /*
    replace () ile ayni isi yapmakla birlikte ilk gordugu datayi degistirir.
     */

    public static void main(String[] args) {

        String str = "Bizimle Java Ogrenmek Cok Kolay";

        // Ex: str String indeki ilk gordugu "i" harfinin yerine "e" harfi yerlestiriniz.

        String str1= str.replaceFirst("i","e");

        System.out.println("str1 = " + str1);

        String str2=str.replace("i","e");
        System.out.println("str2 = " + str2);

        // ************* trim *****************\\

        /*
        trim ()  Bir String'de bastaki ve
                 sondaki space karakterlerini siler .
                  Ortadaki space karakterlerine dokunmaz
        */

        String isim = "   Mehmet Fatih Yildirim  ";

        // EX : isim String'indeki varsa bas ve sondaki space'leri siliniz

        System.out.print("*********************");
        System.out.print("isim=" + isim);
        System.out.print("*********************");
        String trimIsim= isim.trim();
        System.out.print("trimIsim=" + trimIsim);
        System.out.println("*********************");

        // Ex: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        // String tv = "599.99$"            String laptop = "299.99$"

        String tv= "599.99$";
        String laptop = "299.99$";
        String tv2=tv.replace("$",""); // "599.99"

        // $ gordugun yere hicbirsey koyma; yani $ sembolunu sil

        System.out.println("tv2 = " + tv2);

        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2); //"299.99"

        Double totalPrice = Double.valueOf(tv2)+ Double.valueOf(laptop2);

        System.out.println("totalPrice = " + totalPrice);

        /*
        vaueOf()  bize String olan bir datayi sayisal bir
        degere yani islem yapabilecegimiz
        bir degere ceviriyor
         */

        String tamIsim = "  mehmet fatih  ";

        // Ex: Verilen tam isim String inin icindeki ilk ismin ilk harfi ile
        // son ismin ilk harfini buyuk harf olarak yanyana yazdiriniz. ==> MF

        // Sirasiyla: trim (mehmet fatih), toUppercase(MEHMET FATIH), charAt(0) "M" harfi , split
        // charAt(7) bize "F" verir ancak split ogrenelim diye oyle yapcaz.
        // split cumleyi parcalar nerden parcalamak istiyorsak regex e yazariz o index yok olur.
        // ayrilan yerde ilk kelime 0. ikinci kelime 1. index olur koseli parantez icinde yazilir.

        char first=tamIsim.trim().toUpperCase().charAt(0);
        char second=tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("first+second = "+ first+second);//MF
        // first ten onceki arti cok onemli + koymazsak string resim olarak degil
        // m nin ascii deki sayisal degeri olarak algilar. arti koyarsak//MF ; koymazsak :147
        // System.out.println(first+second);// 147






















    }
}
