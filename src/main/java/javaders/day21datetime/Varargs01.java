package javaders.day21datetime;

import java.sql.SQLOutput;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(5,2,4,3));//14
        System.out.println(add(5,2));//7
        System.out.println(add());//0

        getInitials("Ali Can","Kemal Han","Tuncay Cide","Ibrahim Cide");
        /*
            AC
            KH
            TC
            IC
         */

    }
    //ex 1 : Toplama islemi yapan bir method olustur
    //Asagidaki gibi farkli methodlar olusturarak is yapamayiz. Cunku kullanici farkli
    //sayidaki sayilari toplamak isteyebilir,her ihtimal icin bir method olusturmak mumkun degildir

    /*
    public int add(int a,int b){
        return a+b;
    }


    public int add(int a,int b,int c){
        return a+b+c;
    }

    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

     */

    //java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //bu yapiya "Varargs" denir.(3 nokta onemli)
    //"Varargs" arkada "Array" yapisini kullanir.
    /*
    1) bir method parantezinde birden fazla varargs kullanilamaz
    2) bir method parantezinde birden fazla parametre kullanilacaksa varargs en sonda olmalidir
         orn  :(int a,int...b)
     */


    public static int add(int...a){
        int sum=0;
        for (int w: a){
            sum=sum+w;
        }
        return  sum;

    }
    //ex 2: Verilen isimlerin ilk harflerini console a yazdiran method u olusturunuz
    //    Ali Can ==> AC  Kemal Han ==> KH
    public static void getInitials(String...s){
         String initials="";

         for (String w: s){
             initials=initials+w.charAt(0) + w.split(" ")[1].charAt(0);
             System.out.println(initials);

             initials="";

         }

    }





}
