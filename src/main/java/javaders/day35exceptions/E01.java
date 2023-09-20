package javaders.day35exceptions;

public class E01 {

    public static void main(String[] args) {

        System.out.println(convertStringToInt("123")+2);//125
        //123 string olsaydi sonuc 1232 olurdu.int e cevirdigi icin toplama yapabildi.

        //System.out.println(convertStringToInt("12ab")+2); hata verdi."NumberFormatException"
        //sayi formatinda olamayan bir string kullandigimiz icin.duzenleyince yine yazdircaz

        System.out.println(convertStringToInt("12ab")+2);//14 (hatayi duzeltmek icin harfleri silip topladik)
    }

    // bir string i intger a ceviren method olusturunuz.

    public static int convertStringToInt(String str){

       // return Integer.valueOf(str); hata old icin try-catch yapcaz

        try{
            return Integer.valueOf(str);
        }catch(NumberFormatException e){////NumberFormatException valueOf() method'u non-digit character
            // iceren bir String ile kullanildiginda atilir.
           // System.out.println("Do not use non-digit characters"); olabilir ama baska yapcaz
            str= str.replaceAll("[^0-9]","");
            return Integer.valueOf(str);
        }
    }
}
