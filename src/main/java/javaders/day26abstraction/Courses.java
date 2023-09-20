package javaders.day26abstraction;

public abstract class Courses {
    // Body si olmayan methoda abstract(soyut) method denir
    //Abstract method abstract class icinde olmak zorunda
    // method u abstract yapmanin bir guzel ozelligi child larin hepsi override edip kullanmak zorunda
    /*
    1)Bazen Parent class daki methodun body si hicbir
    Child class indan kullanilmaz.
    Bu durumda parent daki methoda body yazmak hic kullanilmadigi
    icin mantikli degildir.
    Biz de method a body yazamayiz.
    2)Body si yazilmayan methoda "Abstract Method" denir,
    Abstract Ingilizce de "vucutsuz" veya "soyut" anlamindadir
    3) Method un body sini yazmayinca Java hata verir,biz de "abstract"
    keyword unu kullanarak Java ya bu methodun body si olmayacak deriz
    4)"Abstract" keyword unu kullaninca elde ettigimiz "Abstract Method"
    normal class lara konulmaz, o yuzden class i da "abstract" yapariz.
    5) Parent taki method abstract ise butun child class lar o methodu
    override etmek zorundadir.
    bu yuzden tum child lar icin mecburi olmasini istedigimiz fonksiyonlari
    abstract yapmak mantikli bir secimdir.
    6) Body si olan methodlar(Concrete Method) abstract class larin icine yazilabilir(2.method)
     ama abstract method concrete class larin icine yazilamazlar.
    7) Abstract keyword ile method body bir method da ayni anda kullanilamaz.
    8) Abstract class larin icinde abstract method lar olur . abstract methodlar
    body si olmadigindan eksik methodlar gibi dusunulebilir.
    Yani abstract class icinde eksik bir yapi barindirir,siz abstract class dan
    object uretirseniz abstract class icindeki eksiklik object e yansir ve object
    eksigi olan bir object olmus olur.
    Java bunu istemez çünkü eksik object eksik iş yapar.bu application in
    Yanlış çalışmasına sebep olur.
    Java aplicationu korumak için abstract classlardan obje üretilmesini engellemiştir.
    9) abstract class larin constructor i vardir ama obje olusturamazlar.
    10) Final methodlar "abstract" olamazlar.
    11) private methodlar "abstract" olamazlar.
    12) Abstract class larin abstract cocugu da concrete cocugu da olabilir
    */

    /*
    interwiev sorusu
    final keyword u java da ne anlama gelir?

    "final" keyword u
    i)   variablelar da
    ii)  methodlar da
    iii) classlar da kullanilir


        i) variable larda kullanildiginda
           a) variable a kesinlikle deger atamasi yapilmalidir
           b) ilk atanan deger degistirilemez

        ii) method larda kullanildiginda
           a)O method body si degistirilemez
           b)O method override edilemez

        iii) class larda kullanildiginda
           a) O class in cougu olamaz ama final class in kendisi child olabilir.



     */
    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }






}
