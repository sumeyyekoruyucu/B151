package javaders.day02printmethodcreation;

import java.util.Scanner;
public class PrintlnPrint {
    public static void main(String[] args) {

        //TECHPRO EDUCATION yazisini yukaridan asagi
        // her bir haf alt satirda olacak sekilde yaz


       // 1. yol
        //ctrl +d ==> windows
        // cmd +d ==> mac
        System.out.println("**********1 .YOL ********************");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");//HICLIKTE OLUR
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        // 2 Yol
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satira gelecek sekilde tek bir sout ile yazdiriniz
        //  \n     bir alt satira gec demektir

        System.out.println(" ********** 2 .YOL ********************");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz


        System.out.println("JAVA\nILE\nGUZEL\nDUNYA ");

        // \t    bir tab bosluk birakir

        // JAVA I     ==> 1 SPACE BOSLUK
        // JAVA   I   ==> 1 TAB BOSLUK

        System.out.println("JAVA\tILE\tGUZEL\tDUNYA ");
        //   \t de harf sayisi onemli ...harf sayisi fakli oldugundan araliklar tam esit degil

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"Techpro \" ile java cok ' kolay '");

        //   /" consolda cift tirnak yazdirmamizi saglar. \ koymazsak tirnak kapandi sanar


        // asagidakini oldugu gibi yazdir 3 satir bosluk ve tirnaklara ve
        // asagidaki bir tab bosluga(satirbasi) dikkat et

        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        System.out.println("\"MAHARET \" hic 'DUSMEMEK' degil; \n\n\n\t\"Her dustugunde kalkabilmektir\"");

        // istedigin yerde "+"koyarak alt satira gecebilirsin
        // println bir sonraki satira gec , print yanina yazdir. ln=line next


        System.out.println("**************** 1 *****************");
        System.out.print("Ali");
        System.out.println("Can");
        //AliCan yazdirir
        System.out.println("**************** 2 *****************");
        System.out.println("Ali");
        System.out.print("Can");
        //Ali
        //Can  yazdirir

        System.out.println("**************** 3 *****************");
        System.out.print("Ali");
        System.out.println("Can");
        //Can**************** 3 *****************
        //AliCan

        // Ex)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun


        /*
                  A
                 A A
                A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");

        char ch = input.next().charAt(0);//Ali HAKKI
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);






    }
}
