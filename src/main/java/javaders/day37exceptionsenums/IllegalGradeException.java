package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception{ //kural disi not hatasi

    //kendi Exception class imi Java daki Exception class in child i yapiyoruz cunku
    // benim Exception class im bundaki butun ozelleikleri kullanabilsin diye
    // kendi constructor imizi olusturuyoruz ama super diyerek parent exception i kullaniyoruz
    //olusturdugumuz class CompileTimeException in cocugu olsun istiyorsak exception in child i yapmaliyiz
    //olusturdugumuz class RuntimeException in ocugu olsun istiyorsak RuntimeException in child i yapmaliyiz
    /*
    1)Custom Exception Class olusturmak icin Exception class a extend etmeliyiz.
    Exception Class a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur.

    2)Custom Exception Class olustururken "constructor" olusturmalisiniz.
          Bu "constructor" parent'taki constructor'i cagirmalidir.
          Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

    3)Custom Exception Class olusturdugunuzda ismin sonunda exception kelimesini kullanmalisiniz.
    IllegalGradeException da oldugu gibi.
     */
    public IllegalGradeException(String message){
        super(message);
    }

    public IllegalGradeException(){
        super();
    }

}
