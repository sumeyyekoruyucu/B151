package javaders.day34exceptions;

public class E03 {

    public static void main(String[] args) {

        System.out.println(getNumOfChars("Java"));//4
        System.out.println(getNumOfChars("Money"));//5
        System.out.println(getNumOfChars(""));//0
        //System.out.println(null);  ==> hata verdi
    }

    //Bir String deki character sayisini veren method u olusturunuz.

    public static int getNumOfChars(String s){
        //return s.length();//hatayi duzeltelim

        int result=0;
        try{
            result=s.length();
        }catch(NullPointerException e){ //NullPointerException String Class'da null ile uyumlu olmayan methodlar kullanildiginda atilir.
            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//bu nu(e.getMessage())kullanirsak varsa java kendi teknik mesajini verir.
            //AMA uretmedigi icin biz burda null aldik. yani java nin Exceptionicin urettigi teknik mesaj yoksa null verir
        }
        return result;
    }

}
