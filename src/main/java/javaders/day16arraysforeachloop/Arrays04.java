package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s= "Java is easy. Learn Java earn money.";// bosluklardan keseriz.split()
        //kesince coklu data olusur.Java coklu datayi Array lerin icine koyar.

        String words[]=s.split(" ");

        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length);//7

        //Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        String letters[]= s.replaceAll("[^a-zA-Z]","").split("");
        //Stringi kestigin icin karakterde alsan char kabul etmiyor
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letters.length);//28


































    }
}
