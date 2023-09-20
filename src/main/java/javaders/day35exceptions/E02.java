package javaders.day35exceptions;

public class E02 {

    public static void main(String[] args) {

        System.out.println(getCharFromString("Java",2));//v
        //System.out.println(getCharFromString("Java",8));//StringIndexOutOfBoundsException

        System.out.println(getCharFromString("Java",8));//j
    }
    //ex 1: Bir String deki karakteri index kullanarak alan bir method olusturunuz

    public static char getCharFromString(String str,int idx){
        //return str.charAt(idx);

        try{
            return str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){

            idx= Math.abs(idx);//kullanici negatif verirse pozitife cevircek
            idx=idx % str.length();
            return str.charAt(idx);
        }
    }
}
