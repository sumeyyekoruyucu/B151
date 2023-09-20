package javaders.day24inheritancepolymorphism;

//Java da parent i olmayan tek class object tir.hz Adem gibi.olusturulan her class onun cocugudur
//parenti yok ama cocugu bir ton. Constructor class i object in icindedir.goremeyiz ama kullaniriz

public class Car {
    /*
    1) Inheritance da objact olustururken Constructor lar yukaridan(parent)
    asagiya(Child) dogru calisir.
    2) Parent ve Super es anlamlidir, Child ve Sub es anlamlidir
    3)Super() her Constructor in ilk satirinda gorunmez olarak bulunur.
    Isterseniz gorunur sekilde de yazabilirsiniz
    4) super() sizi Parent class daki Constructor a tasir
    5)this() sizi ayni class icindeki constructor'lar arasinda gezdirir.
    6)"this()" icinde bulundugunuz variable'lari cagirmaya yarar
      "super()" parent class'daki variable'lari cagirmaya yarar
    7) Parent tan Child a "has a" iliskisi vardir(Animal has a Cat)
    8)Child da Parent a "is a" iliskisi vardir(Cat is a Animal)
    9)Data tipleri arasinda has-a ve is-a iliskisi varsa bu data
    tiplerine "Covariant" denir

     */
    /*
    1)Polymorphism ==> Coklu sekil
       Yani bir method 'un farkli sekillerde karsimiza cikmasi demektir.
       Overloading Polimorphism in bir bolumudur. (method lar sirali duzenli)
    Polymorphism=Overloading+Overriding
        Overriding: parent taki methodu Child daki lere gore ozellestirme islemidir
    hayvan yer
    hayvan icer
    kedi miyavlar

    burada hayvan yer,icer cok geneldi parent ta old icin
    bunu duzenliycez iki kere karsimiza cikcak
    Polymorphism olucak. methodu degistircez ==> eat()Cats eat...
    Overriding parent taki methodu Child daki lere gore ozellestirme islemidir

    2)Overriding parent class taki methodu child class in ihtiyaclarina gore ozellestirerek kullanmak demektir
    3) Overriding de methodun body si degistirilir
    4) Overriding de  method signature'a(method ismi+parametre()) dokunulmaz. Dokunursaniz Java kizar
    */


    //method lar olusturalim
    public void move(){
        System.out.println("Cars move...");
    }
    public void getBreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }
    //Variable lar olusturalim
    public String model="Car";
    public int price= 0;

    //Constructor lar olusturalim
    public Car(){
        //super()  istersek gorunur yapabiliriz
        System.out.println("Car constructor 1");
    }
    public Car(int i){
        System.out.println("Car constructor 2");
    }








}
