package javaders.day13loops;

public class Loops2 {

    public static void main(String[] args) {
        //Verilen bir String deki kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String s="Pwd12?Ab";

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch>='a'&& ch<='z') { // a ile z nin arasinda ise yani kucuk harfse
                continue;

            }else{
                System.out.print(ch);
            }
        }
        System.out.println();

        // break loop disina atar continue i degerine dondurur komple isi bitirmez
        //"break" ile "continue" arasindaki fark nedir?
        //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
        // "continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

        //Bir Stringi ters ceviren kodu yaziniz

       String s1="Sümeyye";
        for (int i=s1.length()-1;   i>-1   ;  i--){
            char ch=s1.charAt(i);
            System.out.print(ch);
        }
        System.out.println();

        //Dogru olan bu digerleri String i tersten yazdirir tek tek  bu ters cevirdikten sonra yazdirir
        String t= "Java";
        String ters ="";//a,av,ava,avaJ ...en son avaJ oluyo yanyana yazdiriyo
        for(int i=t.length()-1; i>=0; i--){
            ters=ters + t.substring(i,i+1);
        }
        System.out.println(ters);

        String a="TURAN KERIME CIHAN ELIF BILAL DONDU VEYSEL FARUK";
        for (int i=a.length()-1 ; i>-1 ; i--) {
            char ch2 = a.charAt(i);
            System.out.print(ch2);
        }
        System.out.println();
        //bir tam sayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==>5+7+8=20
        int sum=0;
        int n=-578;
        n=Math.abs(n);
        for(int i=n ; i>0 ; i=i/10 ){//i/=10
            sum= sum+i%10;//sum+=i%10
        }
        System.out.println(sum);











    }
}
