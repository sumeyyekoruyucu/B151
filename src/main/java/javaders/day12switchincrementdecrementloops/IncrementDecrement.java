package javaders.day12switchincrementdecrementloops;

public class IncrementDecrement {
    // increment: artirmak

    // *********toplama**********\\
    // int age=12
    //age =age + 1;  veya age+=1; (2.si daha iyi)  veya age++;
    // (+ ile = arasinda bosluk olmaz oncesinde sonrasinda olabilir)
    // 3. yontem sadece 1 artirmak icin kullanilir

    // *********carpma**********\\
    // int salary =120000;
    //1.yontem :  salary= salary*1.1 ;  (%10 zamli maas) 132000
    //2.yontem :  salary*=1.1;
    // 3. yok 1 le carpmak artirmaz


    //decrement: azaltmak

    // *********cikarma**********\\
    //int price= 12;
    //1.yol  price=price-3;
    //2.yol  price-=3;
    //price-- (sadece 1 azaltmak icin kullanilir)

    // *********bolme**********\\
    //int salary=1200;
    //1.yol   salary=salary/3;
    //2.yol   salary/=3;
    // 3. yok 1 e bolmek azaltmaz

    // increnment ve decrement sayisal degerlerde ve charda kullanilir char java icin sayisal degerdir

    public static void main(String[] args) {
        int age=12;
        age=age++;//post increment
        System.out.println(age);
        age=++age;//pre increment
        System.out.println(age);

        int salary = 40;

        salary = salary--;//Post Decrement
        System.out.println(salary);//40

        salary = --salary;//Pre Decrement
        System.out.println(salary);//39


    }



}
