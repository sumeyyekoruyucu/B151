package advancedpractices.day01;

public class C01_StringBuilderBufferKiyas {

          /*
2023 Nisan QA Tester
 * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
 * kontrol edip StringBuilder ,String Buffer ve String class'larinin performanslarini
 * karsilastiralim.
 * Ipucu: long TimeSb = System.nanoTime(); kullanalim
 */

    public static void main(String[] args) {

        String str = "Merhaba";
        System.out.println("********String********");

        long t1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            str += " ";
        }

        long t2 = System.nanoTime();

        System.out.println(t2 - t1);//11812000

        System.out.println("**********StringBuffer***********");

        StringBuffer buffer = new StringBuffer("Merhaba");
        long t3 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            buffer = buffer.append(" ");

        }
        long t4 = System.nanoTime();
        System.out.println(t4 - t3);//81300

        System.out.println("******************StringBuilder************");

        StringBuilder builder = new StringBuilder("Merhaba");
        long t5 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            builder = builder.append(" ");

        }
        long t6 = System.nanoTime();
        System.out.println(t6 - t5);//48000


        // Builder en hizlisi buffer ve builder da obje olusturmak zorundayiz,string de variable yeterli.

        if (t2 - t1 > t4 - t3 && t2 - t1 > t6 - t5) {
            System.out.println("En yavas String Class i dir");
            if (t4 - t3 > t6 - t5) {
                System.out.println("Ikinci yavas StringBuffer Class i dir");
                System.out.println("En hizlisi StringBuilder Class i dir");
            } else {
                System.out.println("Ikinci yavas StringBuilder Class idir ");
                System.out.println("En hizlisi StringBuffer Class idir");
            }


        } else if (t4-t3>t2-t1 && t4-t3>t6-t5) {
            System.out.println("En yavas StringBuffer Class idir");
            if (t2-t1>t6-t5){
                System.out.println("Ikinci yavas String Class idir");
                System.out.println("En hizlisi StringBuilder Class idir");
            }else{
                System.out.println("Ikinci yavas StringBuilder Class idir");
                System.out.println("En hizlisi String Class idir");
            }

        }else{
            System.out.println("En yavas StringBuilder Class idir");
            if (t4 - t3>t2 - t1){
                System.out.println("Ikinci yavas StringBuffer Class i dir");
                System.out.println("En hizlisi String Class idir");
            }else{
                System.out.println("Ikinci yavas String Class idir");
                System.out.println("En hizlisi StringBuffer Class idir");
            }
        }
    }
}