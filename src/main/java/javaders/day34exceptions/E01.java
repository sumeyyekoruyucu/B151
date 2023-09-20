package javaders.day34exceptions;

public class E01 {

    /*
    1)"Exception" beklenmedik problem demektir
    2)"Exception"i hallebilmek icin iki temel yol vardir
        i)"Exception"a uygun cozumler uretebilirsiniz "Exception Handling" denir
       ii)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz.Buna da "Throw Exception" denir.
    3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
       "try block" da yapilmasi gereken islemi Java dan yapmasi istenir.
      Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
       "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
    4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz.
 */
 /* " Exception" beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda Exception class'i devereye girer
         Exception class'İ bize karsilasilan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir.
      *  Java exception firlattiginda kodun calismasini durdurur. java exception olusturan kod icin bizden bir karar vermemizi ister
      *  Eger hicbirsey yapmaz isek beklendigi gibi kodumuzun calismasini durdurur.
      *    - Kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel kodlarimizi catch blogu icinde yazmaliyiz
      ** Exception i halledebilmek icin iki temel yol vardir;
         1) Exception a uygun cozumler uretebilirsiniz. Buna Exception Handling denir
         2) Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada "Throw Exception" denir
      * Exception a uygun cozumler uretmede "try-catch" kullanilir, try block icinde yapilmasi gereken islemi java dan isteriz
        Eger java bu islemi sorunsuz bir sekilde yaparsa catch block devreye girmez
        try block icerisinde eger bir "exception" olusursa catch block o zaman devreye girer, ve catch black icindeki kodlar calisir
     *  try block icinde islem yapilirken "Exception" olusursa try block icindeki exceptiondan sonraki kodlar calistirilmaz
     *  catch satirindaki parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi (e) yazariz
     *  if else kullanirsak olusabilecek her problemi specific olarak if parantezinin icine yazmamiz gerekir. Bu da ciddi bir matematik bilgisi gerektirir
        ve yazacagimiz kodu cok uzatir.
        Ama try catch te java ilgili Exception ile alakali olusabilecek tum problemleri yakalar
    */

    public static void main(String[] args) {

        System.out.println(divide1(12, 3));//4
        //System.out.println(divide(6, 0));//ArithmeticException: / by zero  ==> hata verdi 0 a bolduk diye
        //Matematik kuralina aykiri bir is yaptigimizda AritmeticException hatasi aliriz.
        //bu hatayi yok etmek icin 1. yol olarak if,else kullandik. simdi olur yapalim

        System.out.println(divide1(6,0));//0

        System.out.println(divide2(12,3));//4
        System.out.println(divide2(6,0));//Do not divide any number by zero
                                               //0




    }

    //1.yol: Exception i handle etmede ilk ve igrenc yol(bu yol tum problemleri(Exceptionlari) cozmez( handle etmez)
    public static int divide1(int a, int b) {

        if (b == 0) {
            return 0;
        } else {
            return a/b;
        }
    }

    //2.yol :Exception i handle etmede harika yol

    public static int divide2(int a,int b){

        int result=0;

        try{  //dene demek
            result=a/b;

            System.out.println("I am here");

        }catch(ArithmeticException e) {  //catch if gibi...try(dene) eger olmazsa catch
            //ArithmeticException data tipi e:variable ismi(parametre)
            // "ArtihmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("Do not divide any number by zero");//herhangi bir sayi yi 0 ile bolme
        }
        return result;//return type void degilse return yazmak zorundayiz.


    }
    //toplama,carpma,cikarmada sadece return yeterli sikinti cikmaz,bolmede old icin try-catch kullan
    // try da result, catch de return result;





}