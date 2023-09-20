package practices.day_13_practice;

public class C01_StaticKeyWord {
    // Bir tane static variable, bir tane instance variable olusturalım bunların kullanımını main method icerisinde gosterelim.
    static int sayi1;
    int sayi2;
    public static void main(String[] args) {
        C01_StaticKeyWord obj1 = new C01_StaticKeyWord();
        C01_StaticKeyWord obj2 = new C01_StaticKeyWord();
        System.out.println(sayi1); // 0
        System.out.println(obj1.sayi2);  // 0
        sayi1++;
        obj1.sayi2++;
        System.out.println(sayi1);  // 1
        System.out.println(obj1.sayi2);  // 1
        System.out.println(obj2.sayi2);  // 0
        System.out.println(obj1.sayi1); // 1
        System.out.println(obj2.sayi1);  // 1
        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2);  // 1
        System.out.println(obj2.sayi1);  // 2
        System.out.println(obj1.sayi2);  // 1
        System.out.println(obj1.sayi1); // 2
        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2); // 2
        System.out.println(obj1.sayi1);  // 3
        System.out.println(obj2.sayi2);  // 1
        System.out.println(obj2.sayi1);  // 3
    }
}
