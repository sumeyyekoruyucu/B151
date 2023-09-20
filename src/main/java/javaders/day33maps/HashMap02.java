package javaders.day33maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,String> capitals=new HashMap<>(); //capitals=baskent

        //HashMap arkasinda calisan mekanizma nasil calisir?
        //hashmap olusturdugumuzda 16 bucket olusturur.
        //ekledigimiz elemanlara hashing code atayip bu kodu 16 ya bolerek kalan a gore bucket a koyar
        //Bucket'a gider, kalan sayi'nin bulundugu index'e gider ve sirayla "HashCode", "key" ve "value" u koyar.
        //Java Buckets larin icinde linklist yapisini kullanir, bir bucket a birden fazla entry koyarak,siralar
        //Eger daha once ayni entry ile bir "HashCode" uretildiyse Java tekrar bir "HashCode" uretmez ama
        // "value" degisti ise "overwrite" islemi yapar.
        //Bucketlarin ici cok sismesin diye 12 bucket doldugunda yeni 16 kutu ve yeni hashingkod uretir,var olanlari update eder


    }
}
