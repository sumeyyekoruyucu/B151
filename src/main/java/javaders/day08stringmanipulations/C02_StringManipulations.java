package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {

         /*
             Ex: Kullanicidan email adresini girmesini isteyin,
             Asagidaki kurallara gore kullanicinin
             girdigi email adresini kontrol ediniz.
             i)mail adresi "gmail" icermeli
             ii)Space characteri mail'de olmamali
             iii)mail adresinde buyuk harf olmamali
             iv)En az bir tane noktalama isareti bulunmali
 */


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen mail adresinizi\n i)mail adresi \"gmail\" icermeli\n" +
                "               ii)Space characteri mail'de olmamali\n" +
                "               iii)mail adresinde buyuk harf olmamali\n" +
                "               iv)En az bir tane noktalama isareti bulunmali\nveriniz ");

        String mail= input.nextLine();

        //i)mail adresi "gmail" icermeli
        boolean first=mail.contains("gmail");
        System.out.println("gmail icermeli = " + first);

        //ii)Space characteri mail'de olmamali

        boolean second = !mail.contains(" ");
        System.out.println("space olmamali = " + second);

        //iii)mail adresinde buyuk harf olmamali
        boolean third= mail.replaceAll("[a-z0-9]","").
                replaceAll("[\\p{Punct}]","").
                replaceAll(" ","").length()==0;

        //iv)En az bir tane noktalama isareti bulunmali

        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").
                replace(" ","").
                length()>0;
        System.out.println("fourth = " + fourth);

        boolean fourth1 = mail.replaceAll("[^\\p{Punct}]","").//[^\p{Punct}] semboller haric herseyi sil
                length()>0;
        System.out.println("fourth1 = " + fourth1);

        boolean fourth2 = mail.replaceAll("[\\P{P}]","").// [\\P{P}] semboller haric herseyi sil
                length()>0;
        System.out.println("fourth2 = " + fourth2);
        System.out.println(first && second && third && fourth);






    }
}