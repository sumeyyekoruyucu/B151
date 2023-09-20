package javaders.day12switchincrementdecrementloops;

public class Loops01 {

    public static void main(String[] args) {


        //loop : tekrar(dongu) demektir

        //Ekrana 5 KEZ "Hi" yazdiriniz

       /* System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        burdaki sikinti
           1) kod yazarken tekrardan hoslanilmaz
           2) 5000 dese nasil yapicaz(farkli senaryolar icin calisabilmesine dikkat etmeliyiz)
           3) birinde hata varsa hepsini duzeltmemiz gerekir
           4) yazdigimiz kodu surekli gelistiririz hepsini nasil guncelliycez
         */

        /* Yukaridaki gibi tekrar gerektiren isleri yapmak icin  loop yapilarini kullaniriz
        4 tane loop yapisi var
                1)for-loop
                2)while-loop
                3)do-while-loop
                4)for-each-loop
        */

        //for-loop// if iskeletini for a cevir.3 bolum olacak noktali virgulle sirala
        //ilk bolum starting value(baslangic degeri)
        // 2)loop condution(loop ne kadar calisacak
        // 3) increment/ decrement

        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");

        }

        // 4'den 24 e kadar tum tamsayilari ayni satirda aralarina bosluk birakarak konsola yazdiriniz

        for (int i = 4; i < 25; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 33'den 11 e kadar tum cift tamsayilari ayni satirda aralarina bosluk birakarak konsola yazdiriniz

        for (int i = 33; i > 10; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }





        }

        System.out.println();

        // 20'den 74'e kadar tum tek sayilari ayni satirda aralarina bosluk birakarak konsola yazdiriniz
            for(int i=20;  i<75;   i++  ) {
            if (i%2!=0){
                System.out.print(i+" ");
            }

            }
        System.out.println();
        // "Massachusetts" kelimesindeki tum sesli harfleri consal'a yazdiriniz

        String s = "Massachusetts";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.print(c + " ");
            }
        }






        }
    }

