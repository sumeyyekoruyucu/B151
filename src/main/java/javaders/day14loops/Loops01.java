package javaders.day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        // Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz//454567
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        String s = input.next(); // indexof kullanabilmek icin String almak zorundayiz
        int sum = 0;
        for (int i = 0; i < s.length() ; i++) {
            String d = s.substring(i, i + 1);
            if (s.indexOf(d) == s.lastIndexOf(d)) {
                sum= sum + Integer.valueOf(d);
            }
        }
        System.out.println(sum);

        //Bir String deki tekrarli character leri ekrana yazdiran kodu yaziniz
        //Alala==> lala

        String t="Alala";
        String result="";
        for (int i=0; i<t.length(); i++ ){
            char ch= t.charAt(i);
            if (t.indexOf(ch) != t.lastIndexOf(ch) ){
                result=result + ch;

            }
        }
        // sadece  "la" yazmasi icin bir sart daha eklemeliyiz.**** bizden istenen bu*****

        System.out.println(result);
        String result2="";
        for (int i=0; i<t.length(); i++ ){
            char ch= t.charAt(i);
            if ((t.indexOf(ch) != t.lastIndexOf(ch))&& !result2.contains(""+ch)){
                result2=result2 + ch;

                //contains sadece Stringde yapilir string icinde birsey aramak icin kullanilir.
                // icinde var mi yok mu diye bakilir
            }
        }
        System.out.println(result2);

    }
}
