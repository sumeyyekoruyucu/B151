package javaders.day35exceptions;

public class E03 {
    /*
        1)try block'dan sonra coklu catch block kullanilabilir.
          catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
          catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir

        2)"Exception Class"tum Exception'larin parent'idir.
           Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
           tek catch block'i "Exception Class" ile kullanabilirsiniz

        3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz

        4) "try" catch block olmadan kullanilabilir mi?
          "try + finally" olabilir.

 */

    public static void main(String[] args) {

       // System.out.println(convertStringToIntDivideByLength("Learn Java earn money"));//NumberFormatException
       // System.out.println(convertStringToIntDivideByLength(""));//NumberFormatException
       // System.out.println(convertStringToIntDivideByLength("2"));//AritmetikException
        /*  bir method icinde iki exception
           1) valueOf() ==> NumberFormatException
           2) bolme   ==> AritmetikException
         */
        System.out.println(convertStringToIntDivideByLength1("Learn Java earn money"));
        //Non-digit character cannot be used in valueOf()  ==> 0
        System.out.println(convertStringToIntDivideByLength1(""));
        //Non-digit character cannot be used in valueOf() ==> 0
        System.out.println(convertStringToIntDivideByLength1("2")); //  /by zero  (otomatik mesaj)  ==>0
        System.out.println(convertStringToIntDivideByLength1("124"));//62 (124/(3-1))

        //ayni methoda bir catch de cozum bulmak ;(911)
        System.out.println(convertStringToIntDivideByLength2(""));//For input string: ""  ==>0
        System.out.println(convertStringToIntDivideByLength2("2")); //   /by zero  (otomatik mesaj)  ==>0
        System.out.println(convertStringToIntDivideByLength3("2")); // Jump  ==> 0
    }

    // ex 1: Bir Stringi integer a ceviren ve bu integer i String in length inin 1 eksigine bolen methodu olusturunuz.

    public static int convertStringToIntDivideByLength1(String str){

      /*  int a=Integer.valueOf(str);
        return a/(str.length()-1);

       */

        int result=0;
        try{
            int a=Integer.valueOf(str);
            result= a/(str.length()-1);
        }catch (NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;

        // Exception lara ozel kodlar yazmamiz gerekirse coklu catch blok yapariz
    }
    public static int convertStringToIntDivideByLength2(String str){
        int result=0;
        try{
            int a=Integer.valueOf(str);
            result= a/(str.length()-1);
        }catch(Exception e){ //911 gibi butun exception lari halleder
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int convertStringToIntDivideByLength3(String str){
        int result=0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(ArithmeticException e){
            System.out.println("Jump");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
        //Exceptionlar arasinda parent-child ilskisi varsa child yukarda parent asagida olmali
        //yoksa sira farketmez.
        //Exception class butun exceptionlarin parenti dir.
    }




}
