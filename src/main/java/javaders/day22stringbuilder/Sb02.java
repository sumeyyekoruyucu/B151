package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse(); // String i ters cevirir. Loop veya reverse. interwiev de reverse de diyebilirsin ama adam loop ister
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6); // index ini veriyoz karakter siliyo ama StringBuilder i degistirdigimiz icin tersteki halinden siler.
        // tabi istersek reverse u tekrar kullanip ilk haline cevirebiliriz ama yapmiycaz

        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7); // baslangic dahil bitis dahil degil orayi siler
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"X");// baslangic dahil bitis haric onlari siler yerine istedigini koyar
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,"2023");//offset bosver,gec. ilk 3 u gec sonra 2023 yerlestir
        System.out.println(sb1);// ysX2023vaJ

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");

        int r1 = sb2.compareTo(sb3);//compare karsilastir demek.
        // alfabetik siraya gore aralarinda fark olmadigi icin 0 vercek

        System.out.println(r1);//0 (Sonuc 0 ise ayni siradalar)

        StringBuilder sb4=new StringBuilder("Ali");
        int r2 =sb2.compareTo(sb4);
        System.out.println(r2);//9 ( poz ise sonra, neg (-)ise once demek. sb2 sb4 ten 9 sonra
        int r3= sb4.compareTo(sb2);
        System.out.println(r3); //-9 (sb4 sb2 den 9 once )
        // ilk harfleri ayni ise sonrasina bakar
        // ilk harfleri biri buyuk biri kucuk ise ascii degerlerine bakar
        /*
         StringBuilder sb2 = new StringBuilder("Java");
         StringBuilder sb3 = new StringBuilder("java");
         burda J ve j nin ascii degerlerine gore siralar
         */

        sb2.toString();//StringBuilder i String e cevirir. String class method acisindan cok zengin.
        // bunun yanina bile noktali virgulden once nokta koysan String deki methodlari gorebilirsin
        // sb2.toString.(); nokta sadece String methodlarini gormek icin


        //StringBuilder nasil String'e cevrilir?
        String str = sb1.toString().toUpperCase();
        System.out.println(str);// String YSX2023VAJ

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);// StringBuilder YSX2023VAJ








    }
}
