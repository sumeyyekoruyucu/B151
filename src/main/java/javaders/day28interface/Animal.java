package javaders.day28interface;

public interface Animal {

    //public abstract void eat();
    void eat(); // (yeterli public ve abstarct yazmaya gerek yok)
    void drink();
    // 1)  interface lerdeki tum variable lar otomatik(default) olarak "final" dir
    // bu yuzden interface icindeki variable i olusturdugumuzda mutlaka deger atamasi yapmalisiniz
    // Bilindigi gibi final variable larin degerleri degistirilemez
    // 2)  interface lerdeki tum variable lar otomatik(default) olarak "public"dir
    // 3) interface lerdeki tum variable lar otomatik(default) olarak "static" dir
    int age=4;
}
