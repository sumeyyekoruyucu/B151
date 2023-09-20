package advancedpractices.day01;

import java.util.Arrays;
import java.util.Locale;

public class C02_CamelCase {
    // INTERWIEW QUESTIONS QA AUTOMATION Nisan 2023
/*
    String str = "cats AND*Dogs-are Awesome"
    verilen String Datanin her bir kelimenin ilk harfini
    buyuk harf diger harfleri kucuk harf olacak
    "CatsAndDogsAreAwesome" sekilde veren kodu yaziniz
    input==> "cats AND*Dogs-are Awesome"
    output ==>"CatsAndDogsAreAwesome
 */
    public static void main(String[] args) {

        //tum harfler haricindeki yerlerden parcala
        String str = "cats AND*Dogs-are Awesome";
        String words[]=str.split("[^A-Za-z]");
        System.out.println(Arrays.toString(words));//[cats, AND, Dogs, are, Awesome]
        StringBuilder sb=new StringBuilder();
        for (String w:words) {
            if (w.length()>0){ //splitle sildik ama split bastaki ve sondaki bosluklari silmez.
                sb.append(w.substring(0,1).toUpperCase());
                sb.append(w.substring(1).toLowerCase());

            }
        }
        System.out.println(sb);//CatsAndDogsAreAwesome

    }
}
