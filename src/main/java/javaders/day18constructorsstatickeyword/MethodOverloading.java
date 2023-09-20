package javaders.day18constructorsstatickeyword;

public class MethodOverloading {
    /*
    1) Bir method ayni isim farkli parametrelerle olusturulursa buna "Method Overloading"denir.
    2) Method Overloading Java da iyi organizasyon icin onemlidir
     3) Method Overloading yapilirken parametre 3 sekilde degistirilebilir.
       i.   parametrelerin sayilari degistirilebilir.
       ii.  parametrelerin data type'larini degistirebilirsiniz
       iii. parametrelerin data type'lari farkli ise yerleri degistirilebilir.
       4) method overloading bir class in icinde olusur bu yuzden private methodlar da overload edilebilir
       // private in sikintisi class in disina cikinca baslar(bunu sorarlar)
       5)method overloading butun access modifier larda kullanilabilir
       6) static method lar over load edilebilirler(bunu sorarlar)
     */

    public static void main(String[] args) {
        String s="Sabir";
        //s. yaptigimizda bakabiliriz bir suru method birden fazla seyle calisiyo overload edilmis(1.madde)
        // ayni zamanda hepsi sirali orn: lastindexof yaptigimizda hepsi alt alta gelir(2.madde)


        System.out.println( add(3,5));
        // 4 tane add methodu var java en uygun ve pratik olani secer
        //2 uygun degil ,3 ve 4 te auto-widening var en pratigi 1.
        // ama 1. yi silersek 3 ve 4 ayni is ol icin hata verir kodu degistirmemiz gerekir

    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b ,int c){

        return a+b+c;
    }
    private static double add(double a,int b){
        return a+b;
    }//4. madde icin public degil private yaptik
    public static double add(int a,double b){
        return a+b;
    }







}
