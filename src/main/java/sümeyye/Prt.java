package sümeyye;

public class Prt {


    public static void main(String[] args) {

        // INTERWIEW QUESTIONS USA QA

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz.(-)
        // String y ="abbccdc"  ( bu orjinali bunu kendin coz)//ad

        String y="abbccdc";

        for (int i=0; i<y.length(); i++){
            char ch=y.charAt(i);
            if (y.indexOf(ch)==y.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }
    }
}
