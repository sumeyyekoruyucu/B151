package javaders.day01variablesscanner;

import java.security.spec.RSAOtherPrimeInfo;

public class Variables {

    //byte,short,integer,long,double,float
    // veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {

        byte byteMax=Byte.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;

        System.out.println("byteMax=" +byteMax); // sout byteMax
        System.out.println("byteMin = " + byteMin); // soutv byteMin (direk cikar)

        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        int intMax=Integer.MAX_VALUE;
        int intMin=Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

        double doubleMax= Double.MAX_VALUE;
        double doubleMin= Double.MIN_VALUE;

        System.out.println("doubleMax = " + doubleMax);
        System.out.println("doubleMin = " + doubleMin);

        float floatMax= Float.MAX_VALUE;
        float  floatMin= Float.MIN_VALUE;

        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);







    }// main method un


} //class body
