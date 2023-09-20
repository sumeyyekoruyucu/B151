package javaders.day14loops;

public class Loos01Tekrar {
    public static void main(String[] args) {
        // Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz//454567(-)



        //Bir String deki tekrarli character leri ekrana yazdiran kodu yaziniz(farkli yolla yaptim)
        //Alala==> la

        String s="Alala";
        String t="";
        for (int i=0;i<s.length();i++){
            String a=s.substring(i,i+1);

            if ((s.indexOf(a)!=s.lastIndexOf(a)) && !t.contains(a)){
                t=t+a;

            }
        }  System.out.println(t);

        /*
         String result2="";
        for (int i=0; i<t.length(); i++ ){
            char ch= t.charAt(i);
            if ((t.indexOf(ch) != t.lastIndexOf(ch))&& !result2.contains(""+ch)){
                result2=result2 + ch;
                //contains sadece Stringde yapilir string icinde birsey aramak icin kullanilir.
                // icinde var mi yok mu diye bakilir
         */


    }
}
