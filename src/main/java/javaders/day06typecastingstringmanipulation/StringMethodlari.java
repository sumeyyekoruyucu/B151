package javaders.day06typecastingstringmanipulation;

public class StringMethodlari {
    /*

                                       String Class Methodlari

1)toUpperCase():
            i)Bir String'deki tum harfleri
            buyuk harfe cevirmek icin kullanilir.
            ii) toUpperCase() method'u "String" return eder

2)toLowerCase():
            i)Bir String'deki tum harfleri kucuk
            harfe cevirmek icin kullanilir.
            ii) toLowerCase() method'u "String"
            return eder

3)charAt(): i) Bir String'den belli bir index'deki
            characteri almak icin kullanilir.
            ii)charAt() method'u "char" return eder.

4) lenght():i) bir datadaki karakter sayisini bize verir
            ii) int bir deger dondurur

5)substring(): iki kullanimi vardir
            i) substring(baslangicIndexi,bitisIndex) 'i verilirse
               baslangic indexi dahil bitis indexi haric yazdirir
               Metnin ortasindan data almamizi saglar
            ii)(baslangicIndexi) String'in verilen indexten sonuna
               kadar alinmasini saglar
               Bu method bize String dondurur.

6) contains()  :
            i) Bir String'de belli bir characterin veya characterlerin var
               olup olmadigini anlamak icin kullanilir
            ii)contains() method'u "boolean" return eder.

7)substring()  in iki kullanimi vardir.
            i) substring(baslangic indexi, bitis indexi) String'in ortasindan
               bir parca almaya yarar
            ii)substring(baslangic indexi) String'in verilen index'ten sonuna
               kadar almaya yarar.
               Sonuc ise String dir.

8) startsWith() Metnin bas kisminin istenilen dizi(1 veya
                daha fazla karakter) ile eslesip eslesmedigini
                kontrol eder.Sonucu boolean dir

                                String Methodlari
 1) endsWith () Metnin bellirli bir datayla bitip bitmedigini verir
                Bize boolean bir sonuc dondurur
                Tek karakterde , coklu karakterde kullanilabilir

 2) replace ()  Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir
                String bir data dondurur
                tekli karakterler ile de coklu karakterler ile de calisir
                Ancak her iki taraftada " "  ya da  her iki taraftada ' ' kullanilmalidir.
 3) replaceAll()Bir grup datayi degistirmek icin kullanilir.
                Bir grup datayi ifade edebilmek icin Regular
                Expression (Regex) kullanilir

 4) trim ()     Bir String'de bastaki ve
                sondaki space karakterlerini siler .
                Ortadaki space karakterlerine dokunmaz

  5) vaueOf()  Bize String olan bir datayi sayisal bir
               degere yani islem yapabilecegimiz
               bir degere ceviriyor

 6) isEmpty () Bos mu , dolu mu diye bakar

 7) isBlank () Methodu String bir datada space + hiclik icin true dondurur
                bos mu dolu mu oldugunu kontrol eder boolean deger dondurur.
                isEmpty den farki variable de sadece space varsa bosmu
                dolu mu diye soruldugunda isBlank () == bos der
                                          isEmpty () == bos degil der

 8) indexOf () Verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
               tekli karakter icinde, coklu karakter icinde kullanilabilir.
               coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin indexini dondurur
               Olmayan bir datanin kacinci indexde oldugunu sorgulatirsak bize -1 dondurur


 9) lastIndexOf() Verilen bir datada karakter ya da karakterlerin
                  son gorunumunun indexlerini verir
                  Olmayan bir datanin kacinci indexde oldugunu sorgulatirsak bize -1 dondurur

  10) abs ();  methodu matematik klasorundedir. Math. yazinca abs methodu cikar.
               Mutlak deger alir Math.abs
               (sayi = Math.abs(sayi)), abs()
     */



}
