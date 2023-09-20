package javaders.day36exceptions;

public class E03 {
    public static void main(String[] args) {

        /*
        interview sorusu
        "throws" ile "throw" arasinaki farklar nelerdir?
        1)"throws" method signature satirinda kullanilir, "throw" ise method body icinde kullanilir.
        2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
        "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
        3)"throws" dan sonra sadece Exception Class isimleri yazilir,
        "throw" dan sonra ise Exception Class'dan object olusturulur.
 */
        printAge(23);
        //yas neg girildiginde application u durduralim

        try {
            printAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }
        printAge(-9); //exception verir buna try catch yapmadik.exception da kendi notumuzu goruruz
    }


    //Example 1 : Kullanicidan alinan yasi console'a yazdiran methodu olusturunuz

    public static void printAge(int age){

        if (age<0){
            throw new IllegalArgumentException("Used negative integers for ages");//exception atip block luyoruz
        } //Exception icine not yazarsak run yaptigimizda bu notu goruruz.
        System.out.println(age);
    }
    // biz gunluk hayatta yasin negatif olmayacagini bildigimiz icin (java bunu bilmez kendi hata atmaz)
    // biz exception at (throw) diyoruz. ==>throw new IllegalArgumentException(); sonra da handle ediyoruz
    //buna karsilik yukarda bu problemi cozduk neg degeri try icine alarak(handle ettik)

    //bir daha ki derste biz exception lar uretcez.

}
