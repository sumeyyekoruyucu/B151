package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    /*
    1) Run butonuna bastiktan sonra console da alinan exception lara "Runtime Exception" denir.
      AritmetikException, NullPointerException,NumberFormatException,ArrayIndexOufBoundsException,
      StringIndexOfBoundsException "Runtime Exception" a ornektir.
      "Runtime Exception" lara "Unchecked Exception" da denir.

    2) Code yazarken kirmizi alt cizgi seklinde olan "Exception" lar da vardir,bunlara "Compile Time Exception" denir.
       FileNotFoundException,IOException  "Compile Time  Exception"  a ornektir.
       "Compile Time  Exception" lara "Checked Exception" da denir.

            a) FileNotFoundException:Java ya bir dosyayi bul dedigimizde Java dosyanin adresi ve dosyanin varligi konusunda
                                     hata olusursa ne yapmasi gerektigini soylemenizi ister.

            b) IOException; "IO" input Output demektir.
               NOTE: "IOException", "FileNotFoundException" in parent idir.

    3) Java da hatalar temelde ikiye ayrilir:
          i) Exception' lar (hayatin sonu degil,bir sekilde cozum uretiriz.(handle edilebilir))
          ii) Error' lar (hayatin sonu, cozumu yok, olum gibi)

               a) StackOverflow Error
                  Stack memory nin dolup kullanilamaz hale gelmesi.

               b) Out Of Memory Error
                  Heap memory nin dolup kullanilamaz hale gelmesi.

               c) Virtual Machine Error
                  Java nin icindeki sanal bir makine nin hata vermesi.
     */

    public static void main(String[] args) throws IOException {

        //1. Way: Exception'i method signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");
        //dosya  ayni package da old icin sadece"TextFile" de olur ama bizim yaptigimiz daha genel diger package lardan da alir.
        // FileInputStream kirmizi cunku ya yanlissa diyo more actions u sec
        //try-catch kullan yada Ad Exceptions to method signature (method signature a Exception u ekl) secenekleri cikiyor.
        //Ad Exceptions to method signature secersek yanlissa ben mudahale etcem sen bana bildir demis oluyoruz,cozumu sonraya birakiyoruz.
        // try-catch secersek hata ihtimali icin cozumumuzu bastan belirlemis oluyoruz.
        // Ama burda Ad Exceptions to method signature sectik.(main deki throws dan sonrasi( throws FileNotFoundException ) burdan geldi)

        int i=0;

        while((i=fis.read())!=-1) { // dosyadaki karakterleri tek tek okuyacagimiz icin tekrarli while,for farketmez
            //read() karakterlerin ascii degerlerini okur.karakterler bittiginde(butun satirlar) -1 olur bu yuzden dahil degil dedik

            System.out.print((char) i);//ascii leri char a cevirmesi icin
            //read() hala kirmizi yazi ya cinceyse(okuyamayacagim biseyse diyo)
            //more Actions ister try catch ister Ad Exceptions to method signature
            //Ad Exceptions to method signature sectik  throws FileNotFoundException degisti "throws IOException" oldu

            /*
            Learn Java earn money,
            Java is OOP Language.
            OOP has 4 principles
            1)Inheritance
            2)Polymorphism: i) Overloading    ii)Overriding
            3)Encapsulation
            4)Abstraction: i) Abstract Class ii)Interface
             */

        }
        //2.way diger class da(try-catch)

    }
}

