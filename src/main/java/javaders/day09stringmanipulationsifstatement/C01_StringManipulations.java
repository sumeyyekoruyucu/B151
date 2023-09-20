package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

        // *************************isEmpty () ****************************\\

        /*
        isEmpty () bos mu , dolu mu diye bakar.Bize boolean bir deger dondurur.
         */

        //Ex: Bir String in hic karakter icermedigini gosteren kodu yaziniz.

        String str= "";

        // 1.Yol : lenght ()

        boolean bosMu= str.length()==0;

        System.out.println("bosMu_ = " + bosMu); //true

        // 2. Yol : isEmpty()

        boolean bosMu2= str.isEmpty();
        System.out.println("bosMu2 = " + bosMu2);

        // lenght iki is , isEmpty bir is makbul olani budur.

        // Ex: bir String in bosluk haric hicbir karakter icermedigini gosteren kodu yaziniz

        String str2=" ";

        // 1. Yol
        boolean result= str2.replace(" ","").length() ==0;
        System.out.println("result = " + result);//true

        // 2. Yol
        boolean result2= str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2);//true

       String str3="s";
        boolean result3= str3.replace(" ","").isEmpty();
        System.out.println("result3 = " + result3); // false

        String str4="";
        boolean result4= str4.replace(" ","").isEmpty();
        System.out.println("result4 = " + result4);// zaten hic karakter yok true cevirir

        // Ex: Bir String`in "*" haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String str5="*";
        boolean rslt= str5.replace("*","").length()==0;
        boolean rslt2= str5.replace("*","").isEmpty();

        System.out.println("rslt = " + rslt);// true
        System.out.println("rslt2 = " + rslt2);//true

        String str6="*a";
        boolean rslt3= str6.replace("*","").length()==0;
        boolean rslt4= str6.replace("*","").isEmpty();

        System.out.println("rslt3 = " + rslt3);// false
        System.out.println("rslt4 = " + rslt4);//false

        // ******************** isBlank **********************\\

        /*
       isBlank methodu String bir datada space + hiclik icin true dondurur
                bos mu dolu mu oldugunu kontrol eder boolean deger dondurur.
                isEmpty den farki variable de sadece space varsa bosmu
                dolu mu diye soruldugunda isBlank () == bos der
                                          isEmpty () == bos degil der

                */
        boolean rslt5=str2.isBlank();
        System.out.println("rslt5 = " + rslt5);//true
        boolean rslt6=str2.isEmpty();
        System.out.println("rslt6 = " + rslt6);//false

        // ***************indexOf *********************\\

        /*
        indexOf () Verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        tekli karakter icinde, coklu karakter icinde kullanilabilir.
        coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin indexini dondurur
        Olmayan bir datanin Olmayan bir datanin kacinci indexde oldugunu sorgulatirsak bize -1 dondurur
         */

        // Ex: Bir String de a,i,e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdirir
        String r = "Java is easy to Learn";

        int aIdx= r.indexOf("a");
        System.out.println("aIdx = " + aIdx);//1
        int iIdx= r.indexOf("i");
        System.out.println("iIdx = " + iIdx);//5
        int eIdx= r.indexOf("e");
        System.out.println("eIdx = " + eIdx);//8

        System.out.println("aIdx+iIdx+eIdx= " +(aIdx+iIdx+eIdx));//14

        //Ex: Bir String ´de "Java" kelimesinin ilk olarak kacinci index´de
        //kullanildigini gosteren kodu yaziniz

        String u ="Ah Java vah Java sen ne guzel seysin Java ";

        int idxJava =u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//3

        int idxPhyton =u.indexOf("Phyton");
        System.out.println("Phyton = " + idxPhyton);//-1

        //*********************** lastIndexOf () ***********************\\
        /*
        lastIndexOf() Verilen bir datada karakter ya da karakterlerin
        son gorunumunun indexlerini verir
        Olmayan bir datanin kacinci indexde oldugunu sorgulatirsak bize -1 dondurur
         */


        // Ex : Bir String de a ,i ,e karakterlerinin son gorunumlerinin
//      indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to Learn";

        int aLastIdx= v.lastIndexOf("a");//18
        System.out.println("aLastIdx = " + aLastIdx);
        int iLastIdx= r.lastIndexOf("i");//5
        System.out.println("iLastIdx = " + iLastIdx);
        int eLastIdx= r.lastIndexOf("e");//17
        System.out.println("eLastIdx = " + eLastIdx);

        System.out.println("aLastdx+iLastIdx+eLastIdx= " +(aLastIdx+iLastIdx+eLastIdx));//40
        // asagi inmek icin + dan sonra enter a bas












    }
}
