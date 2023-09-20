package sümeyye;

public class Pratic {

    public static void main(String[] args) {

        System.out.println(islemonceligi(3,10,12));
        System.out.println(islemonceligiiki(2,3,5));


        int intMax= Integer.MAX_VALUE;
        int intMin= Integer.MIN_VALUE;

        byte byteMax=Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("intMax = " + intMax + "\n"+ "intMin = " + intMin +"\n"+ "byteMax = " + byteMax +"\n"+ "byteMin = " + byteMin);




    }

    public static double islemonceligi( int x ,int y, int z ) {

        double islem  = x+y*(y-z/x);
        return islem;

    }
    public static double islemonceligiiki (int x, int y, int z) {
        double islemiki = x * x * x * x * x - y * y * y + z * z;
        return islemiki;
























    }

}
