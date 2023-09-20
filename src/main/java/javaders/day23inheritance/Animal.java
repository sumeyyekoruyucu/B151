package javaders.day23inheritance;//inheritance:miras

public class Animal {

    /*
    1) eat(){} methodu gibi bir cok methodun kullanmasi gereken methodlari her class a ayri ayri yazarsak;
        i) Tekrar yapmis oluruz,tekrar ideal code'da olmamalidir.
        ii) Ayni method 'u tekrar tekrar yazmak zaman kaybidir.
        iii) Tekrar tekrar yazilan methodun tamiri cok zaman alir
        iv) Tekrar tekrar yazilan methodun gelistirilmesi cok zaman alir
        v)  Method u tekrar tekrar yazmak "atomik yapi"ya terstir.
    2)  private class  member'lar child class'lar tarafindan kullanilamaz.
        public class  member'lar child class'lar tarafindan kullanilabilir.
        default class  member'lar ayni package'de child class'lar tarafindan kullanilabilir.
        protected class  member'lar farli package'de de olsalar child class'lar tarafindan kullanilabilir.
    3) Java da bir class in sadece bir tane parent i olabilir.
       Coklu Parent a "Multiple Inheritance" derler, tekli Parent a "Single Inheritance" derler.
       Java "Multiple Inheritance" desteklemez,Java "Single Inheritance" kullanir.
    4) Apartman seklindeki(soy agaci) inheritance yapisina "Multilevel Inheritance" denir.
       Java "Multilevel Inheritance" i destekler  (babamda yoksa dedeme gidebilirim.)
     */

    protected void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

}
