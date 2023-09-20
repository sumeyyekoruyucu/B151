package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        //Ex 1: Cumledeki kelimalerin gorunumlerin sayisini veren kodu yaziniz
        // "I like to move it,move it do you like it?(interwiev sorusu)
        // biz boyle yapalim "I like you, like like!" ==> I=1 , like=2 , like!=1 ,you=1

        String s="I like you, like like!";
        System.out.println(s);//I like you, like like!
        //like! bitisik kabul ettigi icin sikinti olur.
        //like ile like! i ayni yapabilmek icin tum noktalama isaretlerini silelim
        //I=1 , like=3 ,you=1

        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        //Ben kelimelerle calismaliyim bu yuzden split(" ") kullanmaliyim

        String words[]=s.split(" ");

        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        //Adamin benden istedigi format map formatinda bu yuzden map olusturmaliyiz. //I=1 , like=3 ,you=1
        HashMap<String,Integer> acc=new HashMap<>();

        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
       //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
       //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w:words){
            Integer numOfOccurance=acc.get(w);//map te w var mi yoksa null verir.(varsa var olan degeri verir)
            if (numOfOccurance==null){
                acc.put(w,1);
            }else{
                acc.replace(w,numOfOccurance+1);
            }

        }
        System.out.println(acc);//{like=3, I=1, you=1}

    } // nonprimitive ler null i eleman olarak kabul eder o yuzden Integer yapabildik.
}
