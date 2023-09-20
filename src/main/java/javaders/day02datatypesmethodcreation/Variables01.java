package javaders.day02datatypesmethodcreation;

public class Variables01 {




    /*
    Note1: primitive data typleari java olusturmusdur, biz olusturamayiz.
    Note2: primitive data typelariin isimlerinde sadece kucuk harf kullanilir.
    Note3: primitive datalar typelarina gore memoryede farkli farkli yer kaplar.
    Note4: primitive datalar iclerinde sadece sizin atadiniz degeri barindirirlar.
     */


    /*
    Non-primitive data types
    Ornek olarak String non-primitiv bir data typedir
    Uretilen her bir class ayni zamanda bir non-primitive data typedir
    Bu yuzden"non-primitive data type" lar sinirsiz sayida dir denilebilir
    Non-primitive data type larin isimleri buyuk harflöe baslar
    Non-primitive data type larin tamami icin java memory de ayni miktarda yer ayirir.
     */


    public static void main(String[] args) {

        //Ornek1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin.


        String cityName = "Izmir";
        System.out.println(cityName);




        /*
        Interview sorusu: "primtive" ve "non.-primitiv" data typle arasindaki fark nedir?
        1)"primtive" ler sadece bizim atadimiz degeri icerir
          "non-primitve" ler bizim atadimiz deger ve methodlar icerir
        2)"primtive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
        3)"primtive" leri java uretmisdir ve 8 tanedir
          "non-primitive" leri java ve developerler uretebilir, sinirsiz sayidadir
        4)"primtive" ler memory de data type ina gore yer kaplar
          "non-primitive" lerde data type larin tamami icin java memory de ayni miktarda yer ayirir.

         */
    }

}










