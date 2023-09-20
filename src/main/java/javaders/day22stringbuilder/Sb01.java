package javaders.day22stringbuilder;

public class Sb01 {
    /*
    1)StringBuilder String ureten bir class tir
    2)String class kullanarak String uretiriz java nicin StringBuilder class i olustirdu?
    String class immutable(degistirilmez) String uretir, StringBuilder class mutable(degistirilebilir)String uretir.
    3) immutable olmak demek orjinal degerin korunmasi degistirilemez olmasi demektir.
    mutable olmak demek orjinal degerin egistirilebilir olmasi demektir.
    4) capacity java nin size verdigi data depolama yerinin kullanilan kismidir
    5) java baslangic olarak size capacity i 16 olarak verir
    siz verilen capacity i asarsaniz java yeni capacity i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
     */

    public static void main(String[] args) {
        String s="Java";

        //s + "!"; burda orjinal degismez yeni data olusur. ama s' e atarsak degisir tabi s=s+"!";
        // yeni bir yer olusturulur .memory fazladan kullanilir

        String u="Apex";
        String v="Apex";//Java akilli ayni sey icin ikinci defa yer olusturmaz u nun refransini birde v olarak isimlendirir.
        // biz v dedigimizde "Apex" e referanstan ulasiriz. Yani java heap memory de aynindan sadece bir tane olusturur.
        String y="C++";

        // StringBuilder nasil olusturulur?

        //1.way
        StringBuilder t=new StringBuilder("Python");//burda orjinal degisir. atamaya gerek yok
        System.out.println(t);//Python

        //StringBuilder lara nasil ekleme yapilabilir?

        // t. yap
        t.append("!"); // atama yapmiyoruz tekrar yazdiriyoruz
        System.out.println(t);//Python!

        //normal Stringlerde concatination StringBuilder larda append

        t.append("!").append("..."); //method zinciri(method chain) birden fazla method pespese
        System.out.println(t);//Python!!...

        //2.way
        StringBuilder r=new StringBuilder(); //bos olusturuyoruz
        System.out.println(r);

        r.append('c');
        System.out.println(r);

        //capacity ve length arasindaki fark nedir?

        //yapabilecegimiz max is kapasite yaptiginiz is length( 100 soru cozebilirsin 20 cozdun)
        StringBuilder sb1=new StringBuilder("Money");

        int capacity =sb1.capacity();
        System.out.println(capacity);//21 (StringBuilder da java otomatik 16 kutu verir, 5 tane de money den)

        int length=sb1.length();
        System.out.println(length);// 5 ( "Money" 5 harf)

        sb1.append("!");
        int c= sb1.capacity();
        System.out.println(c);//21 ( ekleme yaptigimizda yeni yer acmiyo ilk verdigimiz standart 16 kutudan birine yaerlestiriyor)
        // ekledigimiz karakter sayisi toplam 21 i asarsa capacity yi artirirken var olan kadar(21 ek kutu) ekler bide 2 ekler
        // or: diyelim 23 karakter var.. 21 i astigi icin ekstra 21 ve +2 ekler. öncekiyle beraber 21+21+2=44
        // her astiginda varolanin 2 katinin 2 fazlasi eklenir.Standart

        //sb1.append("!").append(".................");//23 karakter. 21 i asti
        // int c= sb1.capacity();//21x2+2=44 yeni capacity

        int ln=sb1.length();
        System.out.println(ln);//6

        //Default capacity i nasil degistirebiliriz?

        StringBuilder sb2=new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6







    }
}
